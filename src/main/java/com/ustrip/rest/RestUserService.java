package com.ustrip.rest;

import com.google.gson.JsonSyntaxException;
import com.ustrip.common.*;
import com.ustrip.dao.HotelDao;
import com.ustrip.delegate.TransactionDelegate;
import com.ustrip.entity.Hotel;
import com.ustrip.entity.Operation;
import com.ustrip.entity.User;
import com.ustrip.service.OperationService;
import com.ustrip.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JacksonJsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Service
@Path("/user")
@SuppressWarnings("all")
public class RestUserService {
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
    private TransactionDelegate transactionDelegate;
    @Autowired
    private OperationService operationService;

    private Logger logger = LogManager.getLogger(this.getClass().getName());

    @POST
    @Path("/login")
    @Produces("application/json;charset=utf-8")
    public Response login(Map<String, Object> paramMap) throws IOException {
        try {
            Map<String, Object> authMap = (Map<String, Object>) paramMap.get("auth");
            String username = (String) authMap.get("username");
            String password = (String) authMap.get("password");
            boolean flag = username != null && username.trim().length() > 0 && password != null && password.trim().length() > 0;
            User user = null;
            if (flag) {
                user = userService.selectUserByUsernameAndPwd(username, password);
                if (user != null) {
                    redisTemplate.opsForValue().set("eb_user:" + username, user, 120, TimeUnit.MINUTES);
                    RequestData.setUserId(user.getUserId());
                    RequestData.setRole(user.getRole());

                    return Response.status(Status.OK).entity(user.getMapData()).build();
                }
            }
            throw new RuntimeException("user does not exist!");
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1501, ErrorCodeEnum.ER1501.getMsg());
        }
    }

    @POST
    @Path("/logout")
    @Produces("application/json;charset=utf-8")
    public Response logout(Map<String, Object> paramMap) throws IOException {
        try {
            Map<String, Object> authMap = (Map<String, Object>) paramMap.get("auth");
            String username = (String) authMap.get("username");
            cleanRedisAndLocalData(username);

            Map<String, String> resultMap = new HashMap<String, String>();
            resultMap.put("status", "success");
            return Response.status(Status.OK).entity(resultMap).build();
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1502, ErrorCodeEnum.ER1502.getMsg());
        }
    }

    @POST
    @Path("/selectById")
    @Produces("application/json;charset=utf-8")
    public Response selectUserById() throws IOException {
        try {
            Integer userId = (Integer) RequestData.getJSONData().get("userId");
            User user = userService.selectUserById(userId);
            return Response.status(Status.OK).entity(user.getMapData()).build();
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1503, ErrorCodeEnum.ER1503.getMsg());
        }
    }

    @POST
    @Path("/selectByNameApiPwd")
    @Produces("application/json;charset=utf-8")
    public Response selectUserByUsernameAndApiPwd() throws IOException {
        try {
            String username = (String) RequestData.getJSONData().get("username");
            String apiPassword = (String) RequestData.getJSONData().get("password");
            User user = userService.selectUserByUsernameAndApiPwd(username, apiPassword);
            return Response.status(Status.OK).entity(user.getMapData()).build();
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1503, ErrorCodeEnum.ER1503.getMsg());
        }
    }

    @POST
    @Path("/selectByCondition")
    @Produces("application/json;charset=utf-8")
    public Response selectUserByCondition() throws IOException {
        try {
            JSONObject conditionData = RequestData.getJSONData();
            List<User> users = userService.selectUserByCondition(conditionData);
            List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
            for (User user : users) {
                resultList.add(user.getMapData());
            }
            return Response.status(Status.OK).entity(resultList).build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1503, ErrorCodeEnum.ER1503.getMsg());
        }
    }

    @POST
    @Path("/update")
    @Produces("application/json;charset=utf-8")
    public Response update() {
        try {
            JSONObject jsonData = RequestData.getJSONData();
            User user = EBUtil.jsonToBeanDateSerializer(jsonData.toString(), User.class, UsiTripConstant.DATE_PATTERN);
            String oldUsername = jsonData.get("oldUsername").toString();
            Integer integer = transactionDelegate.transactionUpdateUserByUsername(user, oldUsername);
            cleanRedisAndLocalData(oldUsername);

            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("status", integer);
            return Response.status(Status.OK).entity(resultMap).build();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1504, ErrorCodeEnum.ER1504.getMsg());
        }
    }

    @POST
    @Path("/delete")
    @Produces("application/json;charset=utf-8")
    public Response delete() {
        try {
            String delUsername = (String) RequestData.getJSONData().get("username");
            String delApiPassword = (String) RequestData.getJSONData().get("password");
            Integer integer = transactionDelegate.transactionDeleteUserByUsernameAndPwd(delUsername, delApiPassword);
            cleanRedisAndLocalData(delUsername);

            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("status", integer);
            return Response.status(Status.OK).entity(resultMap).build();
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1504, ErrorCodeEnum.ER1504.getMsg());
        }
    }

    @POST
    @Path("/resetPwd")
    @Produces("application/json;charset=utf-8")
    public Response resetPassword() {
        try {
            String username = (String) RequestData.getJSONData().get("username");
            Integer integer = transactionDelegate.transactionResetPwdByUsername(username);

            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("status", integer);
            return Response.status(Status.OK).entity(resultMap).build();
        } catch (JSONException e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1505, ErrorCodeEnum.ER1505.getMsg());
        }
    }

    @POST
    @Path("/retrievePwd")
    @Produces("application/json;charset=utf-8")
    public Response retrievePassword(Map<String, Object> paramMap) {
        try {
            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
            String username = (String) dataMap.get("username");
            Map<String, String> resultMap = new HashMap<String, String>();
            resultMap.put("username", username);
            resultMap.put("token", EBUtil.md5("username"));
            log(RequestData.getUserId(), "retrievePassword", dataMap.toString(), resultMap.toString());
            return Response.status(Status.OK).entity(resultMap).build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1506, ErrorCodeEnum.ER1506.getMsg());
        }
    }

    @POST
    @Path("/updatePwdByToken")
    @Produces("application/json;charset=utf-8")
    public Response updatePasswordByToken(Map<String, Object> paramMap) {
        try {
            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
            String username = (String) dataMap.get("username");
            String password = (String) dataMap.get("password");
            String token = (String) dataMap.get("token");
            Map<String, Object> resultMap = new HashMap<String, Object>();
            if (Objects.equals(EBUtil.md5("username"), token)) {
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                Integer integer = transactionDelegate.transactionUpdateUserByUsername(user, username);
                resultMap.put("status", integer);
            } else {
                resultMap.put("status", "unauthorized token");
            }
            log(RequestData.getUserId(), "updatePasswordByToken", dataMap.toString(), resultMap.toString());
            return Response.status(Status.OK).entity(resultMap).build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1504, ErrorCodeEnum.ER1504.getMsg());
        }
    }

    private void cleanRedisAndLocalData(String username) {
        redisTemplate.delete("eb_user:" + username);
        RequestData.setUserId(null);
        RequestData.setRole(null);
    }

    private void log(Integer userId, String method, String request, String Response) {
        logger.info("---USER:" + userId + "---Class:" + this.getClass().getName() + "---Method:" + method + "---Return:" + Response);

        Operation operation = new Operation();
        operation.setUserId(userId);
        operation.setDate(new Date());
        operation.setMethod(this.getClass().getName() + ": " + method);
        operation.setRequest(request);
        operation.setResponse(Response);
        operationService.insertOperation(operation);
    }


    @Autowired
    private HotelDao hotelDao;

    @POST
    @Path("/test")
    @Produces("application/json;charset=utf-8")
    public void test() {
    /*    Dict dict = new Dict();
        dict.setHotelId(789);
        dict.setType(UsiTripConstant.ROOMTYPE);
        dict.setTypeName("roomType789");
        Integer integer = transactionDelegate.transactionInsertType(dict);
        System.out.println(integer);

        Dict dict2 = new Dict();
        dict2.setHotelId(789);
        dict2.setType(UsiTripConstant.ROOMTYPE);
        dict2.setTypeName("roomType789789");*/

        System.out.println(hotelDao);
        List<Hotel> eBooking = hotelDao.selectHotelByProvide("EBooking");
        System.out.println(eBooking.size());
    }
}
