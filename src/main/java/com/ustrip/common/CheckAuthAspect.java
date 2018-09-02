package com.ustrip.common;

import com.paypal.base.rest.JSONFormatter;
import com.ustrip.entity.Operation;
import com.ustrip.entity.User;
import com.ustrip.service.OperationService;
import com.ustrip.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JacksonJsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;


@Component
public class CheckAuthAspect {
    private RedisTemplate<String, Serializable> redisTemplate;
    @Autowired
    public void setRedisTemplate(RedisTemplate<String, Serializable> redisTemplate) {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new JacksonJsonRedisSerializer<User>(User.class));
        this.redisTemplate = redisTemplate;
    }
    @Autowired
    private UserService userService;
    @Autowired
    private OperationService operationService;

    private Logger logger = LogManager.getLogger(this.getClass().getName());

    public void pointCut() {
    }

    public void before(JoinPoint point) {
        HttpServletRequest request = ResteasyProviderFactory.getContextData(HttpServletRequest.class);
        String jsonRequest = null;
        try {
            jsonRequest = new POSTREST().getRaw(request);
            JSONObject jsonInput = new JSONObject(jsonRequest);

            JSONObject jsonAuth = jsonInput.getJSONObject("auth");
            String username = jsonAuth.getString("username");
            String apiPassword = jsonAuth.getString("password");
            User user = (User) redisTemplate.opsForValue().get("eb_user:" + username);
            if (user == null) {
                boolean flag = username != null && username.trim().length() > 0 && apiPassword != null && apiPassword.trim().length() > 0;
                if (flag) {
                    user = userService.selectUserByUsernameAndApiPwd(username, apiPassword);
                    if (user != null) {
                        redisTemplate.opsForValue().set("eb_user:" + username, user, 120, TimeUnit.MINUTES);
                        storeData(user, jsonInput);
                        return;
                    }
                }
            } else {
                if (user.getApiPassword().equals(apiPassword.trim())) {
                    storeData(user, jsonInput);
                    return;
                }
            }
            throw new RuntimeException();
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(jsonRequest == null ? "request acquirement exception" : jsonRequest);
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1003, ErrorCodeEnum.ER1003.getMsg());
        }
    }

    private void storeData(User user, JSONObject jsonInput) {
        RequestData.setUserId(user.getUserId());
        RequestData.setRole(user.getRole());

        if (jsonInput.has("data")) {
            if(jsonInput.get("data") == JSONObject.NULL){
                RequestData.setJSONData(new JSONObject());
            }else{
                JSONObject data = (JSONObject) jsonInput.get("data");
                RequestData.setJSONData(data);
            }
        }
    }

    public void after(JoinPoint point) throws IOException {
    }

    public void log(JoinPoint point, Object returnVal) {
        ServerResponse response = (ServerResponse) returnVal;
        Integer userId;
        if ((userId = RequestData.getUserId()) != null) {
            String className = point.getSignature().getDeclaringTypeName();
            String methodName = point.getSignature().getName();
            String responseStr = JSONFormatter.toJSON(response == null ? null : response.getEntity());
            String requestStr = RequestData.getJSONData() == null ? null : RequestData.getJSONData().toString();
            logger.info("---USER:" + userId + " ---Request: " + requestStr + " ---Class:" + className + " ---Method:" + methodName + " ---Return:" + responseStr);
            if (!methodName.startsWith("query") && !methodName.startsWith("select") && !methodName.startsWith("logout")) {
                Operation operation = new Operation();
                operation.setUserId(userId);
                operation.setDate(new Date());
                operation.setMethod(className + ": " + methodName);
                if (RequestData.getJSONData() != null) {
                    operation.setRequest(RequestData.getJSONData().toString());
                }
                operation.setResponse(responseStr);
                operationService.insertOperation(operation);
            }
        }
    }
}

