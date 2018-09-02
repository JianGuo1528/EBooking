package com.ustrip.common;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.paypal.base.rest.JSONFormatter;
import com.ustrip.entity.Partner;
import com.ustrip.entity.RedisPartner;
import com.ustrip.entity.RequestBean;
import com.ustrip.service.EbookingService;


@Component
public class CheckAuthAspectOld {
	//@Autowired
	//private LogUtil logger;
	@Autowired
	private RedisTemplate<String,String> redisTemplate;
	@Autowired
	private EbookingService ebookingService;
	long t1 = 0;
	long t2 = 0;
	private Logger logger = LogManager.getLogger("test");
	private Logger loggerPayment = LogManager.getLogger("payment");
	//@Value("${INVALID_REST_CLASS}")
	//private String INVALID_REST_CLASS;
	public void pointCut() {
	};
	public void before(JoinPoint point) throws Exception {
		HttpServletRequest request = ResteasyProviderFactory
				.getContextData(HttpServletRequest.class);
		String jsonRequest = new POSTREST().getRaw(request);
		JSONObject jsonInput = new JSONObject(jsonRequest);
		logger.info(jsonInput);
	    Gson gson = new Gson();
	    RequestBean rb = gson.fromJson(jsonInput.toString(), RequestBean.class);

	    JSONObject jsonAuth  =  jsonInput.getJSONObject("auth");
	    JSONObject jsonData  =  jsonInput.getJSONObject("data");
	    String email = jsonAuth.getString("username");
		String password = jsonAuth.getString("password");
		Partner partner;
		if(null != redisTemplate.opsForValue().get("PARTNER:"+email))
		{
			String partner_json = redisTemplate.opsForValue().get("PARTNER:"+email);
			partner=new RedisPartner().JSONToPartner(partner_json);
		}else{
				partner = ebookingService.selectPartnerByEmail(email);
				//partner to json
				String partner_json_string = new RedisPartner().PartnerToJSON(partner);
				redisTemplate.opsForValue().set("PARTNER:"+email, partner_json_string, 60, TimeUnit.MINUTES);
		}
		//Partner partner = hotelService.selectPartnerByEmail(email);

		/*
		 Enumeration<String> headerNames = request.getHeaderNames();

	        if (headerNames != null) {
	                while (headerNames.hasMoreElements()) {
	                        System.out.println("Header: " + request.getHeader(headerNames.nextElement()));
	                }
	        }
	      */
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		//logger.info("a:"+ipAddress);

	       if (ipAddress == null) {
	         ipAddress = request.getRemoteAddr();
	   }

		// System.out.println(target.toString());
		String method = point.getSignature().getName();
//		PartnerRatio partnerRatio = new PartnerRatio();
//		if ("book".equals(method)) {
//			partnerRatio.setBook_times(1);
//		}else{
//			partnerRatio.setBook_times(0);
//		}
//		partnerRatio.setPartner_id(partner==null?Integer.valueOf(ipAddress):partner.getId());
//		partnerRatio.setRequest_times(1);
//		partnerRatio.setRequested_at(new Date());
//		new PartnerRatioThread(ebookingService,partnerRatio).start();
		//hotelService.insertPartnerRatio(partnerRatio);
		if(partner!=null&&password.equals(partner.getApi_password())&&(partner.getActive()==1||partner.getActive()==2))
		{
			Partners.putPartner(partner);
			RequestData.putData(rb.getData());
			RequestData.getData().setIpAddress(ipAddress);
			RequestData.getData().setOriginalRequest(jsonInput.toString());
			logger.info("---Partner:" + partner.getId() + "---IP:" + ipAddress + "---URI:"
					+ request.getRequestURI() + "---PARAMETERS:" + jsonData);
		}
		else
		{
			throw new MiniException(UsiTripConstant.ERRORCODE_ER1003, ErrorCodeEnum.ER1003.getMsg());
		}
	}
	public void after(JoinPoint point) throws IOException {
	}

	public void log(JoinPoint point, Object returnVal) {
		ServerResponse response = (ServerResponse) returnVal;
		//Gson gson = new Gson();
		//Token token = new Token();
		//String uid = "";
		//Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod()
		//		.getParameterTypes();
		//Object[] obj = point.getArgs();
		Object target = point.getTarget();
		// System.out.println(target.toString());
		//String method = point.getSignature().getName();
		Class<?> classz = target.getClass();
/*		if ("getIndexInfo".equals(method) || "showCategory".equals(method)
				|| "getShippingList".equals(method)) {
		} else {
				try {
						Method m = classz.getMethod(method, parameterTypes);
						// System.out.println(m.getName());
						Annotation[][] annotations = m.getParameterAnnotations();
						a: for (int i = 0; i < annotations.length; i++) 
						{
							for (Annotation annotation : annotations[i]) 
							{
								if (!(annotation instanceof QueryParam))
									continue;
								QueryParam param = (QueryParam) annotation;
								if (("token").equals(param.value())) 
								{
									//token = gson.fromJson(StringUtil.decode((String) obj[i]), Token.class);
									//uid = token.getData();
									break a;
								}
							}
						}
					} catch (Exception e) {
					}
				}*/
		Partner partner = Partners.getPartner();
//	if(!point.getSignature().getName().equals("searchHotels")&&!point.getSignature().getName().equals("searchCacheHotels"))
//	{
		if (classz.equals(com.ustrip.rest.RestEbookingService.class)) {
			loggerPayment.info("---Partner:" + partner.getId() + "---returnMethod:" + point.getSignature().getName()
					+ "---returnVal:" + JSONFormatter.toJSON(response.getEntity()));			
		}else{
			logger.info("---USER:" + partner.getId() + "---returnMethod:" + point.getSignature().getName()
					+ "---returnVal:" + JSONFormatter.toJSON(response.getEntity()));			
		}
//	}else{
//		SearchHotelResponseBean searchHotelResponse = (SearchHotelResponseBean)response.getEntity();
//		logger.info("---Partner:" + partner.getId() + "---returnMethod:" + point.getSignature().getName()
//				+ "---returnVal(Count):" + JSONFormatter.toJSON(searchHotelResponse.getData().getCount())
//				+ "---(Session):" + JSONFormatter.toJSON(searchHotelResponse.getData().getSessionKey()));
//	}

	}
}

