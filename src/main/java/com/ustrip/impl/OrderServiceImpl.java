package com.ustrip.impl;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustrip.dao.OrderDao;
import com.ustrip.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	private Logger logger = LogManager.getLogger(this.getClass().getName());

	@Autowired
	private OrderDao orderDao;

	@Override
	public List<Map<String, Object>> queryOrder(Map<String, Object> map) {
		return orderDao.queryOrder(map);
	}
 
	@Override
	public List<Map<String, Object>> queryOrderRoom(List<Map<String, Object>> list) {
		return orderDao.queryOrderRoom(list);
	}

	@Override
	public List<Map<String, Object>> queryOrderRoomPerson(List<Map<String, Object>> listRooms) {
		return orderDao.queryOrderRoomPerson(listRooms);
	}
	
	@Override
	public Integer confirmOrder(Map<String, Object> map) {
		return orderDao.confirmOrder(map);
	}
	
	@Override
	public Integer confirmOrderVoucherNum(Map<String, Object> map) {
		return orderDao.confirmOrderVoucherNum(map);
	}

	@Override
	public Integer rejectOrder(Map<String, Object> map) {
		return orderDao.rejectOrder(map);
	}

	@Override
	public List<Map<String, Object>> queryRejectedOrder(List<Map<String, Object>> listRejections) {
		return orderDao.queryRejectedOrder(listRejections);
	}



	
}
