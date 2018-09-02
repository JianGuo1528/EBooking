package com.ustrip.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoomDao {

	Integer selectCountByRoomTypeIdAndHotelId(Map<String, Object> map);

	Integer addMappingByHotelAndRoomType(Map<String, Object> map);

	Integer disableHotelRoomType(Map<String, Object> map);

	List<Map<String, Object>> queryRoomTypes(List<Map<String, Object>> hotelList);

	Map<String, Object> queryRoomTypesByHotelId(Integer hotelId);

	Map<String, Object> queryRateDetailByPlanId(Integer planId);

	List<Map<String, Object>> queryRateByPlanId(Integer planId);

	List<Map<String, Object>> selectPlanDetailsByPushStatus(@Param("pushStatus") Integer pushStatus);

	int updatePushStatus(Integer planId);

	List<Map<String, Object>> selectPlanDetailsByDate(@Param("plan_id")String planId, @Param("check_in")String checkIn,@Param("check_out")String checkOut);
}
