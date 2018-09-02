package com.ustrip.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.ws.Endpoint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jboss.resteasy.spi.HttpRequest;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.test.webservice.HelloWorldImpl;

import com.ustrip.common.ErrorCodeEnum;
import com.ustrip.common.MiniException;
import com.ustrip.common.RequestData;
import com.ustrip.common.UsiTripConstant;
import com.ustrip.delegate.EbookingServiceDelegate;
import com.ustrip.delegate.TransactionDelegate;
import com.ustrip.entity.Dict;
import com.ustrip.entity.PlanDetailsResponseBean;
import com.ustrip.entity.RequestBean;
import com.ustrip.service.EbookingService;

@Service
@Path("/ebooking")
public class RestEbookingService {
	@Autowired
	private TransactionDelegate transactionDelegate;
	@Autowired
	private EbookingServiceDelegate ebookingServiceDelegate;
	@Autowired
	private EbookingService ebookingService;
	private Logger logger = LogManager.getLogger(this.getClass().getName());

	@POST
	@Path("/cancel")
	@Produces("application/json;charset=utf-8")
	public Response cancel(@Context HttpRequest request) throws Exception {
		// for test 2
		System.out.println("!!!!!!!!!");
		return Response.status(Status.OK).entity(new RequestBean()).build();
	}

	@POST
	@Path("/publish")
	@Produces("application/json;charset=utf-8")
	public Response publish(@Context HttpRequest request) throws Exception {
		// for test JWS
		Endpoint.publish("http://0.0.0.0:8081/WS/HelloWorld",new HelloWorldImpl());
		System.out.println("JWS Server Started!");
		return Response.status(Status.OK).entity(new RequestBean()).build();
	}

	/**
	 * Query Hotel Rooms By UserId
	 * @return Hotel Rooms List
	 * @throws MiniException
	 */
	@POST
	@Path("/hotel/queryHotelRooms")
	@Produces("application/json;charset=utf-8")
	public Response queryHotelRooms() throws Exception {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", RequestData.getUserId());
		map.put("roleId", RequestData.getRole());
		List<Map<String, Object>> rtv = ebookingService.queryHotelRooms(map);
		if (rtv != null && rtv.size() > 0) {
			List<Map<String, Object>> roomTypes = ebookingService.queryRoomTypes(rtv);
			if (roomTypes != null && roomTypes.size() > 0) {
				List<Map<String, Object>> plans = ebookingService.queryPlans(rtv);
				if (plans != null && plans.size() > 0) {
					for (Map<String, Object> roomType : roomTypes) {
						List<Map<String, Object>> roomTypeplans = new ArrayList<>();
						for (Map<String, Object> plan : plans) {
							if (((int) roomType.get("hotelId")) == ((int) plan.get("hotelId")) && ((int) roomType.get("room_type_id")) == ((int) plan.get("room_type_id"))) {
								roomTypeplans.add(plan);
							}
						}
						roomType.put("roomTypeplans", roomTypeplans);
					}
				}

				
				for (Map<String, Object> hotel : rtv) {
					List<Map<String, Object>> hotelRoomTypes = new ArrayList<>();
					List<Dict> roomTypesList = new ArrayList<>();
					for (Map<String, Object> roomType : roomTypes) {
						if (((int) hotel.get("hotelId")) == ((int) roomType.get("hotelId"))) {
							hotelRoomTypes.add(roomType);
						}

						Dict d = new Dict();
						d.setId( (Integer) roomType.get("room_type_id"));
						d.setType("room");
						d.setHotelId((Integer) roomType.get("hotelId"));
						d.setTypeName((String) roomType.get("room_type_name"));
						d.setTypeNameZh((String) roomType.get("room_type_name_zh"));
						roomTypesList.add(d);
					}
 
					hotel.put("hotelRoomTypes", hotelRoomTypes);
					hotel.put("bedTypes", transactionDelegate.selectAllTypeByHotelId(UsiTripConstant.BEDTYPE, (Integer)hotel.get("hotelId")));
					hotel.put("boardTypes", transactionDelegate.selectAllTypeByHotelId(UsiTripConstant.BOARDTTYPE, (Integer)hotel.get("hotelId")));
					hotel.put("roomTypes", roomTypesList);
//					hotel.put("roomTypes", transactionDelegate.selectAllTypeByHotelId(UsiTripConstant.ROOMTYPE, (Integer)hotel.get("hotelId")));
//					System.out.println(hotel.get("roomTypes"));
				}
			}
		}

		return Response.status(Status.OK).entity(rtv).build();
	}
	
	@POST
	@Path("/hotel/queryPlan")
	@Produces("application/json;charset=utf-8")
	public Response queryPlan() throws Exception {

		JSONObject reqData = RequestData.getJSONData();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("plan_id", reqData.getInt("plan_id"));
		logger.debug(reqData.getInt("plan_id"));
		List<Map<String, Object>> planList = ebookingService.queryPlan(map);
		Map<String, Object> hotel=null;
		if(planList != null && planList.size() > 0) {
			hotel=planList.get(0);
			logger.debug(hotel.get("hotelId"));
			hotel.put("bedTypes", transactionDelegate.selectAllTypeByHotelId(UsiTripConstant.BEDTYPE, (Integer)hotel.get("hotelId")));
			hotel.put("boardTypes", transactionDelegate.selectAllTypeByHotelId(UsiTripConstant.BOARDTTYPE, (Integer)hotel.get("hotelId")));
			hotel.put("roomTypes", transactionDelegate.selectAllTypeByHotelId(UsiTripConstant.ROOMTYPE, (Integer)hotel.get("hotelId")));
		}

		return Response.status(Status.OK).entity(hotel).build();
	}
	/**
	 * Set Plan Sale Flag
	 * @return Plan Info.
	 * @throws MiniException
	 */
	@POST
	@Path("/hotel/setPlanSaleFlag")
	@Produces("application/json;charset=utf-8")
	public Response setPlanSaleFlag() throws Exception {

		JSONObject reqData = RequestData.getJSONData();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("planId", reqData.getInt("planId"));
		map.put("status", reqData.getInt("status"));

		int i=transactionDelegate.transactionSetPlanSaleFlag(map);
		
		Map<String, Object> rtv = new HashMap<>();
		if(i>0){
			rtv.put("updated", i);
			rtv.put("success", "true");
		}
		return Response.status(Status.OK).entity(rtv).build();
	}	
	
	/**
	 * Delete Plan
	 * @return Plan Info.
	 * @throws MiniException
	 */
	@POST
	@Path("/hotel/deletePlan")
	@Produces("application/json;charset=utf-8")
	public Response deletePlan() throws Exception {

		JSONObject reqData = RequestData.getJSONData();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("planId", reqData.getInt("planId"));
		map.put("status", 2);

		int i=transactionDelegate.transactionSetPlanSaleFlag(map);
		
		Map<String, Object> rtv = new HashMap<>();
		if(i>0){
			rtv.put("updated", i);
			rtv.put("success", "true");
		}
		return Response.status(Status.OK).entity(rtv).build();
	}	
	
	@POST
	@Path("/hotel/addRoomTypePlan")
	@Produces("application/json;charset=utf-8")
	public Response addRoomTypePlan() throws Exception {

		JSONObject reqData = RequestData.getJSONData();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("plan_name", reqData.getString("plan_name"));
		map.put("hotelId", reqData.getInt("hotelId"));
		map.put("room_type_id", reqData.getInt("room_type_id"));
		map.put("bed_type_id", reqData.getInt("bed_type_id"));
		map.put("breakfast_type_id", reqData.getInt("breakfast_type_id"));
		map.put("max_person", reqData.getInt("max_person"));
		map.put("status", reqData.getInt("status"));

		int i=transactionDelegate.transactionInsertPlan(map);
		int id  = (int)map.get("id");
		
		ebookingServiceDelegate.buildPlanDetails(reqData.getInt("hotelId"),id , 100);
		
		Map<String, Object> rtv = new HashMap<>();
		if(i>0){
			rtv.put("updated", i);
			rtv.put("success", "true");
			rtv.put("new_plan_id", id);
		}
		return Response.status(Status.OK).entity(rtv).build();
	}	
	
	@POST
	@Path("/hotel/updateRoomTypePlan")
	@Produces("application/json;charset=utf-8")
	public Response updateRoomTypePlan() throws Exception {

		JSONObject reqData = RequestData.getJSONData();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("plan_id", reqData.getInt("plan_id"));
		map.put("plan_name", reqData.getString("plan_name"));
		map.put("hotelId", reqData.getInt("hotelId"));
		map.put("room_type_id", reqData.getInt("room_type_id"));
		map.put("bed_type_id", reqData.getInt("bed_type_id"));
		map.put("breakfast_type_id", reqData.getInt("breakfast_type_id"));
		map.put("max_person", reqData.getInt("max_person"));
		map.put("status", reqData.getInt("status"));

		int i=transactionDelegate.transactionUpdatePlan(map);
		
		Map<String, Object> rtv = new HashMap<>();
		if(i>0){
			rtv.put("updated", i);
			rtv.put("success", "true");
		}
		return Response.status(Status.OK).entity(rtv).build();
	}	
	@POST
	@Path("/generatePlanDetails")
	@Produces("application/json;charset=utf-8")
	public Response generatePlanDetails(@Context HttpRequest request) throws Exception {
		JSONObject reqData = RequestData.getJSONData();
		int hotelId=0;
		int planId=0;
		int buildDays=0;
		try {
			hotelId = reqData.getInt("hotelId");
			planId = reqData.getInt("planId");
			buildDays = reqData.getInt("buildDays");
		} catch (Exception e) {
			//e.printStackTrace();
			logger.fatal("generatePlanDetails error:"+e.getMessage(),e);
			throw new MiniException(UsiTripConstant.ERRORCODE_ER1002, ErrorCodeEnum.ER1002.getMsg());	
		}
		ebookingServiceDelegate.buildPlanDetails(hotelId, planId, buildDays);
		return Response.status(Status.OK).entity("Done!").build();
	}
	
	@POST
	@Path("/queryPlanDetailsByDate")
	@Produces("application/json;charset=utf-8")
	public Response queryPlanDetailsByDate() throws Exception {		
		JSONObject reqData = RequestData.getJSONData();
		PlanDetailsResponseBean planDetailsResponseBean = ebookingServiceDelegate.queryPlanDetailsByDate(reqData);
		return Response.status(Status.OK).entity(planDetailsResponseBean).build();
	}
	
	@POST
	@Path("/updatePlanDetailsByDate")
	@Produces("application/json;charset=utf-8")
	public Response updatePlanDetailsByDate() throws Exception {		
		JSONObject reqData = RequestData.getJSONData();
		Map<String, Object> map = ebookingServiceDelegate.updatePlanDetailsByDate(reqData);
		return Response.status(Status.OK).entity(map).build();
	}
}
