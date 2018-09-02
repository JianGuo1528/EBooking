package com.ustrip.rest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustrip.common.ErrorCodeEnum;
import com.ustrip.common.MiniException;
import com.ustrip.common.RequestData;
import com.ustrip.common.UsiTripConstant;
import com.ustrip.service.OrderService;

@Service
@Path("/order")
public class RestOrderService {
 
	@Autowired
	private OrderService horderService;
	
	private Logger logger = LogManager.getLogger(this.getClass().getName());

	@POST
	@Path("/queryOrder")
	@Produces("application/json;charset=UTF-8")
	public Response queryOrder() throws Exception {
		JSONObject jsonData = RequestData.getJSONData();
		Map<String, Object> renMap = new HashMap<String, Object>();

	    Map<String, Object> map = new HashMap<String, Object>();
	    Iterator ite = jsonData.keys();
	    while (ite.hasNext()) {
	        String key = ite.next().toString();
	        String value = jsonData.get(key).toString();
	        map.put(key, value);
	    }
	    map.put("flag", "queryOrder");
 
	    List<Map<String, Object>> list = horderService.queryOrder(map);
		renMap.put("orderList", list);
		return Response.status(Status.OK).entity(renMap).build();
	}
	
	@POST
	@Path("/queryOrderByUserId")
	@Produces("application/json;charset=UTF-8")
	public Response queryOrderByUserId() throws Exception {
		JSONObject jsonData = RequestData.getJSONData();
 	    Map<String, Object> m = new HashMap<String, Object>();
	    Iterator ite = jsonData.keys();
	    while (ite.hasNext()) {
	        String key = ite.next().toString();
	        String value = jsonData.get(key).toString();
	        m.put(key, value);
	    }
	    m.put("userId", RequestData.getUserId());
	    m.put("flag", "queryOrderByUserId");

		List<Map<String, Object>> list = horderService.queryOrder(m);
		Map<String, Object> renMap = new HashMap<String, Object>();
		renMap.put("orderList", list);
		return Response.status(Status.OK).entity(renMap).build();
	}
	
	
	@POST
	@Path("/queryOrderByHotelId")
	@Produces("application/json;charset=UTF-8")
	public Response queryOrderByHotelId() throws Exception {
		
		JSONObject jsonData = RequestData.getJSONData();
		Map<String, Object> m = new HashMap<String, Object>();
		if(jsonData.isNull("hotelId") || jsonData.get("hotelId") == null || "".equals(jsonData.get("hotelId").toString())) {
			throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() +" HOTEL ID cannot be empty.");
		}
	    Iterator ite = jsonData.keys();
	    while (ite.hasNext()) {
	        String key = ite.next().toString();
	        String value = jsonData.get(key).toString();
	        m.put(key, value);
	    }
		m.put("userId", RequestData.getUserId());
//		m.put("hotelId", jsonData.get("hotelId").toString());
		m.put("flag", "queryOrderByHotelId");
		
		List<Map<String, Object>> list = horderService.queryOrder(m);
		Map<String, Object> renMap = new HashMap<String, Object>();
		renMap.put("orderList", list);
		return Response.status(Status.OK).entity(renMap).build();
	}
	
	@POST
	@Path("/queryOrderByID")
	@Produces("application/json;charset=UTF-8")
	public Response queryOrderByID() throws Exception {
		
		JSONObject jsonData = RequestData.getJSONData();
	    Map<String, Object> m = new HashMap<String, Object>();
        if(jsonData.isNull("id") || jsonData.get("id") == null || "".equals(jsonData.get("id").toString())) {
			throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() +" ORDER ID cannot be empty.");
        }
	    m.put("id", jsonData.get("id").toString());
	    m.put("flag", "queryOrderByID");

		List<Map<String, Object>> list = getOrderInfo(m);
		Map<String, Object> map = new HashMap<String, Object>();
		if(list !=null && list.size() > 0) { 
			map = list.get(0);
		}
		return Response.status(Status.OK).entity(map).build();
	}
	
	public List<Map<String, Object>> getOrderInfo(Map<String, Object> map) throws Exception{
		//查询horder
	    List<Map<String, Object>> list = horderService.queryOrder(map);
		if(list !=null && list.size() > 0) {
			//通过orderList中的 orderReference 查询对应的roomList
			List<Map<String, Object>> listRooms = horderService.queryOrderRoom(list);
			
			//rejected order info
			List<Map<String, Object>> listRejections = horderService.queryRejectedOrder(list);

			if(listRooms !=null && listRooms.size() > 0) {
				
				//通过roomList中的 orderReference and (id)roomIndex 查询对应的personList
				List<Map<String, Object>> listPerson = horderService.queryOrderRoomPerson(listRooms);
				
				//把personList 添加到 room 中
				for (Map<String, Object> r : listRooms) {
					List<Map<String, Object>> listPersonOfRoom = new ArrayList<>();
					if(r != null && (String) r.get("orderReference") != null) {
						for (Map<String, Object> p : listPerson) {
							if(((String) r.get("orderReference")).equals(((String) p.get("orderReference"))) && ((int) r.get("id")) == ((int) p.get("roomIndex"))) {
								p.remove("orderReference");
								p.remove("roomIndex");
								listPersonOfRoom.add(p);
							}
						}
						r.put("ListPerson", listPersonOfRoom);
					}
				}
			}
			
			//把roomList 添加到 order 中
			for (Map<String, Object> m : list) {
				List<Map<String, Object>> listRoomsOfOrder = new ArrayList<>();
				List<Map<String, Object>> listRejectedOfOrder = new ArrayList<>();
				if(m != null && (String) m.get("orderReference") != null) {
					for (Map<String, Object> r : listRooms) {
						if(((String) m.get("orderReference")).equals(((String) r.get("orderReference")))) {
							r.remove("orderReference");
							listRoomsOfOrder.add(r);
						}
					}
					m.put("ListRooms", listRoomsOfOrder);
		 
					for (Map<String, Object> r : listRejections) {
						if(m!= null && r != null &&  String.valueOf(m.get("id")).equals(String.valueOf(r.get("orderId")))) {
							r.remove("orderId");
							listRejectedOfOrder.add(r);
						}
					}
					m.put("ListReasons", listRejectedOfOrder);
				}
			}
		}
		return list;
	}
	
	@POST
	@Path("/confirmOrder")
	@Produces("application/json;charset=UTF-8")
	public Response confirmOrder() throws Exception {
 
		JSONObject jsonData = RequestData.getJSONData();
        if(jsonData.isNull("orderId") || jsonData.get("orderId") == null || "".equals(jsonData.get("orderId").toString())) {
        	throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() +" ORDERID cannot be empty.");
        }
		
	    Map<String, Object> m = new HashMap<String, Object>();
	    m.put("orderId", jsonData.getInt("orderId"));
	    m.put("userId", RequestData.getUserId());
	    
	    Integer count = horderService.confirmOrder(m);
		Map<String, Object> renMap = new HashMap<String, Object>();
		Date myDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String myDateString = sdf.format(myDate);
		renMap.put("dateStamp", myDateString);
		renMap.put("count", count);
  		return Response.status(Status.OK).entity(renMap).build();
	}

	@POST
	@Path("/confirmOrderVoucherNum")
	@Produces("application/json;charset=UTF-8")
	public Response confirmOrderVoucherNum() throws Exception {
 
		JSONObject jsonData = RequestData.getJSONData();
        if(jsonData.isNull("vcoucherNum") || jsonData.get("vcoucherNum") == null || "".equals(jsonData.get("vcoucherNum").toString())) {
			throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() +" VOUCHER NUMBER cannot be empty.");
        }
        if(jsonData.isNull("orderId") || jsonData.get("orderId") == null || "".equals(jsonData.get("orderId").toString())) {
        	throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() +" ORDERID cannot be empty.");
        }
		
	    Map<String, Object> m = new HashMap<String, Object>();
	    m.put("vcoucherNum", jsonData.get("vcoucherNum"));
	    m.put("orderId", jsonData.getInt("orderId"));
	    m.put("userId", RequestData.getUserId());
	    
	    Integer count = horderService.confirmOrderVoucherNum(m);
		Map<String, Object> renMap = new HashMap<String, Object>();
		Date myDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String myDateString = sdf.format(myDate);
		renMap.put("dateStamp", myDateString);
		renMap.put("count", count);
  		return Response.status(Status.OK).entity(renMap).build();
	}
	
	@POST
	@Path("/rejectOrder")
	@Produces("application/json;charset=UTF-8")
	public Response rejectOrder() throws Exception {
		
		JSONObject jsonData = RequestData.getJSONData();
		if(jsonData.isNull("orderId") || jsonData.get("orderId") == null || "".equals(jsonData.get("orderId").toString())) {
			throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() +" ORDERID cannot be empty.");
		}
		
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("reason", jsonData.get("reason"));
		m.put("orderId", jsonData.getInt("orderId"));
		m.put("userId", RequestData.getUserId());

		Integer count = horderService.rejectOrder(m);
		Map<String, Object> renMap = new HashMap<String, Object>();
		Date myDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String myDateString = sdf.format(myDate);
		renMap.put("dateStamp", myDateString);
		renMap.put("count", count);
		return Response.status(Status.OK).entity(renMap).build();
	}

}
