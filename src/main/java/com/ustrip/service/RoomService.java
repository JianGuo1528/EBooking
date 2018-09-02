package com.ustrip.service;

import java.util.List;
import java.util.Map;

public interface RoomService {
	public Integer selectCountByRoomTypeIdAndHotelId(Map<String, Object> m);

	public Integer addMappingByHotelAndRoomType(Map<String, Object> map);

	public Integer disableHotelRoomType(Map<String, Object> map);

	public List<Map<String, Object>> queryBedListByHotelIdAndRoomTypeId(Map<String, Object> map);

	public List<Map<String, Object>> queryRoomTypes(List<Map<String, Object>> hotelList);

 
}
