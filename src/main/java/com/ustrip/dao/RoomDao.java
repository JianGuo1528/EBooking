package com.ustrip.dao;

import java.util.List;
import java.util.Map;

public interface RoomDao {

	Integer selectCountByRoomTypeIdAndHotelId(Map<String, Object> map);

	Integer addMappingByHotelAndRoomType(Map<String, Object> map);

	Integer disableHotelRoomType(Map<String, Object> map);

	List<Map<String, Object>> queryBedListByHotelIdAndRoomTypeId(Map<String, Object> map);

	List<Map<String, Object>> queryRoomTypes(List<Map<String, Object>> hotelList);

}
