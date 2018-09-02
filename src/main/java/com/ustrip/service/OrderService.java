package com.ustrip.service;

import java.util.List;
import java.util.Map;

public interface OrderService {

	public List<Map<String, Object>> queryOrder(Map<String, Object> map);
	
	public List<Map<String, Object>> queryOrderRoom(List<Map<String, Object>> list);

	public List<Map<String, Object>> queryOrderRoomPerson(List<Map<String, Object>> listRooms);

	public Integer confirmOrderVoucherNum(Map<String, Object> map);

	public Integer rejectOrder(Map<String, Object> map);

	public List<Map<String, Object>> queryRejectedOrder(List<Map<String, Object>> list);

	public Integer confirmOrder(Map<String, Object> map);
 
}
