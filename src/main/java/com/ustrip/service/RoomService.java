package com.ustrip.service;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoClient;

import java.util.List;
import java.util.Map;

public interface RoomService {
	public Integer selectCountByRoomTypeIdAndHotelId(Map<String, Object> m);

	public Integer addMappingByHotelAndRoomType(Map<String, Object> map);

	public Integer disableHotelRoomType(Map<String, Object> map);

	public List<Map<String, Object>> queryRoomTypes(List<Map<String, Object>> hotelList);

	Map<String, Object> queryRoomTypesByHotelId(Integer hotelId);

	String pushRoomTypeToAli(TaobaoClient client, Map<String, Object> roomTypeMap,String sessionKey) throws Exception;

	public List<Map<String, Object>> queryRateByPlanId(Integer planId);

	public String pushRateUpdateToAli(TaobaoClient client, Map<String, Object> rateDetailMap, List<Map<String, Object>> planList, String aliSessionKey)  throws Exception;

	public Map<String, Object> queryRateDetailByPlanId(Integer planId);


	List<Map<String, Object>> selectPlanDetailsByPushStatus(Integer pushStatus);

	String pushRatesUpdate2Ali(TaobaoClient client, List<Map<String, Object>> planDetails) throws ApiException;

	public int updatePushStatus(Integer planId);

	List<Map<String, Object>> selectPlanDetailsByDate(String planId, String checkIn, String checkOut);
}
