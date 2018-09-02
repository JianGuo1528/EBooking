package com.ustrip.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrderDao {

	public List<Map<String, Object>> queryOrder(Map<String, Object> map);

	public List<Map<String, Object>> queryOrderRoom(List<Map<String, Object>> list);

	public List<Map<String, Object>> queryOrderRoomPerson(List<Map<String, Object>> listRooms);

	public Integer confirmOrder(Map<String, Object> map);
	
	public Integer confirmOrderVoucherNum(Map<String, Object> map);

	public Integer rejectOrder(Map<String, Object> map);

	public List<Map<String, Object>> queryRejectedOrder(List<Map<String, Object>> listRejections);
}
