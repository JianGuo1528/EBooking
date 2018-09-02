package com.ustrip.alitrip;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.ustrip.common.ErrorCodeEnum;
import com.ustrip.common.MiniException;
import com.ustrip.common.PropertyUtil;
import com.ustrip.common.UsiTripConstant;
import com.ustrip.entity.Hotel;
import com.ustrip.service.HotelService;
import com.ustrip.service.RoomService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Service
@Path("/alitrip")
public class RestAlitripStaticService {
    private Logger logger = LogManager.getLogger(this.getClass().getName());

    @Autowired
    private HotelService hotelService;

    @Autowired
    private RoomService roomService;

    @POST
    @Path("/pushHotelContentByProvider")
    @Produces("application/json;charset=utf-8")
    public Response pushHotelContentByProvider(Map<String, Object> paramMap) {
        try {
            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
            String provider = String.valueOf(dataMap.get("provider"));
            List<Hotel> hotels = hotelService.selectHotelByProvider(provider);
            Properties templateProps = PropertyUtil.getTemplateProps();

            TaobaoClient client = new DefaultTaobaoClient(UsiTripConstant.ALI_SERVICE_URL, UsiTripConstant.ALI_APP_KEY, UsiTripConstant.ALI_APP_SECRECT);
            for (Hotel hotel : hotels) {
                hotelService.pushHotelContent2Ali(client, hotel);
                Thread.sleep(500);
            }
            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("status", "success");
            return Response.status(Response.Status.OK).entity(resultMap).build();
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }

    @POST
    @Path("/pushHotelContentByHotelId")
    @Produces("application/json;charset=utf-8")
    public Response pushHotelContentByHotelId(Map<String, Object> paramMap) {
        try {
            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
            Integer hotelId = Integer.parseInt((String) dataMap.get("hotelId"));
            Hotel hotel = hotelService.selectHotelByHotelId(hotelId);

            TaobaoClient client = new DefaultTaobaoClient(UsiTripConstant.ALI_SERVICE_URL, UsiTripConstant.ALI_APP_KEY, UsiTripConstant.ALI_APP_SECRECT);
            hotelService.pushHotelContent2Ali(client, hotel);
            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("status", "success");
            return Response.status(Response.Status.OK).entity(resultMap).build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }

    @POST
    @Path("/pushHotelContentByHotelIds")
    @Produces("application/json;charset=utf-8")
    public Response pushHotelContentByHotelIds(Map<String, Object> paramMap) {
        try {
            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
            String hotelIds = (String) dataMap.get("hotelIds");
            String[] ids = hotelIds.split(",");

            Properties templateProps = PropertyUtil.getTemplateProps();
            TaobaoClient client = new DefaultTaobaoClient(UsiTripConstant.ALI_SERVICE_URL, UsiTripConstant.ALI_APP_KEY, UsiTripConstant.ALI_APP_SECRECT);
            for (String id : ids) {
                if (null != id && !id.trim().isEmpty()) {
                    Integer hotelId = Integer.parseInt(id.trim());
                    Hotel hotel = hotelService.selectHotelByHotelId(hotelId);
                    hotelService.pushHotelContent2Ali(client, hotel);
                    Thread.sleep(500);
                }
            }
            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("status", "success");
            return Response.status(Response.Status.OK).entity(resultMap).build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }

    @POST
    @Path("/rateUpdate")
    @Produces("application/json;charset=utf-8")
    public Response rateUpdate(Map<String, Object> paramMap) {
        try {
            // TOP服务地址，正式环境需要设置为http://gw.api.taobao.com/router/rest
            String serverUrl = "http://gw.api.tbsandbox.com/router/rest";
            String appKey = "test"; // 可替换为您的沙箱环境应用的AppKey
            String appSecret = "test"; // 可替换为您的沙箱环境应用的AppSecret
            String sessionKey = "test"; // 必须替换为沙箱账号授权得到的真实有效SessionKey

//    		TaobaoClient client = new DefaultTaobaoClient(serverUrl, appKey, appSecret);
//    		ItemSellerGetRequest req = new ItemSellerGetRequest();
//    		req.setFields("num_iid,title,nick,price,num");
//    		req.setNumIid(123456789L);
//    		ItemSellerGetResponse rsp = client.execute(req, sessionKey);
//    		System.out.println(rsp.getBody());
//    		if (rsp.isSuccess()) {
//    			System.out.println(rsp.getItem().getTitle());
//    		}
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }

    @POST
    @Path("/pushRoomTypeByHotelId")
    @Produces("application/json;charset=utf-8")
    public Response pushRoomTypeByHotelId(Map<String, Object> paramMap) {
        try {
            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
            if (dataMap == null || dataMap.get("hotelId") == null) {
                throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() + " HOTEL ID cannot be empty.");
            }
            Integer hotelId = Integer.parseInt((String) dataMap.get("hotelId"));
            Map<String, Object> roomTypeMap = roomService.queryRoomTypesByHotelId(hotelId);
            if (roomTypeMap == null) {
                throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, "未查询到无数据");
            }
            TaobaoClient client = new DefaultTaobaoClient(UsiTripConstant.ALI_SERVICE_URL, UsiTripConstant.ALI_APP_KEY, UsiTripConstant.ALI_APP_SECRECT);
            String msg = roomService.pushRoomTypeToAli(client, roomTypeMap, UsiTripConstant.ALI_SESSION_KEY);
            JSONObject json = JSON.parseObject(msg);
            if (json.isEmpty()) {
                return Response.status(Response.Status.NO_CONTENT).entity("No Content").build();
            }
            if (json.containsKey("error_response")) {
                return Response.status(Response.Status.BAD_REQUEST).entity(json).build();
            }
            return Response.status(Response.Status.OK).entity(json).build();

        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }


    @POST
    @Path("/pushRateUpdate")
    @Produces("application/json;charset=utf-8")
    public Response pushRateUpdate(Map<String, Object> paramMap) {
        try {
            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
            if (dataMap == null || dataMap.get("planId") == null) {
                throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() + " PLAN ID cannot be empty.");
            }
            Integer planId = Integer.parseInt((String) dataMap.get("planId"));

            Map<String, Object> rateDetailMap = roomService.queryRateDetailByPlanId(planId);
            List<Map<String, Object>> planList = roomService.queryRateByPlanId(planId);
            if (rateDetailMap == null || planList == null || planList.size() == 0) {
                throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, "未查询到数据");
            }
            TaobaoClient client = new DefaultTaobaoClient(UsiTripConstant.ALI_SERVICE_URL, UsiTripConstant.ALI_APP_KEY, UsiTripConstant.ALI_APP_SECRECT);

            String msg = roomService.pushRateUpdateToAli(client, rateDetailMap, planList, UsiTripConstant.ALI_SESSION_KEY);
            JSONObject json = JSON.parseObject(msg);
            if (json.isEmpty()) {
                return Response.status(Response.Status.NO_CONTENT).entity("No Content").build();
            }
            if (json.containsKey("error_response")) {
                return Response.status(Response.Status.BAD_REQUEST).entity(json).build();
            }

            roomService.updatePushStatus(planId);
            return Response.status(Response.Status.OK).entity(json).build();

        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }

    @POST
    @Path("/pushRatesUpdate")
    @Produces("application/json;charset=utf-8")
    public Response pushRatesUpdate() {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            TaobaoClient client = new DefaultTaobaoClient(UsiTripConstant.ALI_SERVICE_URL, UsiTripConstant.ALI_APP_KEY, UsiTripConstant.ALI_APP_SECRECT);
            List<Map<String, Object>> planDetails = roomService.selectPlanDetailsByPushStatus(0);
            if (planDetails == null || planDetails.size() == 0) {
                resultMap.put("status", "Could not fetch any available data.");
            } else {
                String msg = roomService.pushRatesUpdate2Ali(client, planDetails);
                resultMap.put("status", msg);
                //TODO
//                roomService.updatePushStatus(null);
            }
            return Response.status(Response.Status.OK).entity(resultMap).build();
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }
}
