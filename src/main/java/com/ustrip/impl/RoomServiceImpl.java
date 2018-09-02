package com.ustrip.impl;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustrip.dao.RoomDao;
import com.ustrip.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {
	private Logger logger = LogManager.getLogger(this.getClass().getName());

	@Autowired
	private RoomDao roomDao;

	@Override
	public Integer selectCountByRoomTypeIdAndHotelId(Map<String, Object> map) {
		return roomDao.selectCountByRoomTypeIdAndHotelId(map);
	}

	@Override
	public Integer addMappingByHotelAndRoomType(Map<String, Object> map) {
		return roomDao.addMappingByHotelAndRoomType(map);

	}
 
	@Override
	public Integer disableHotelRoomType(Map<String, Object> map) {
		return roomDao.disableHotelRoomType(map);

	}

	@Override
	public List<Map<String, Object>> queryBedListByHotelIdAndRoomTypeId(Map<String, Object> map) {
		return roomDao.queryBedListByHotelIdAndRoomTypeId(map);
	}

	@Override
	public List<Map<String, Object>> queryRoomTypes(List<Map<String, Object>> hotelList) {
		return roomDao.queryRoomTypes(hotelList);
	}




	
}
