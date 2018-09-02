package com.ustrip.impl;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ustrip.dao.HotelDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustrip.entity.Partner;
import com.ustrip.entity.PlanDetails;
import com.ustrip.service.EbookingService;
@Service
public class EbookingServiceImpl implements EbookingService{
	private Logger logger = LogManager.getLogger(this.getClass().getName());
	
	@Autowired
	private HotelDao hotelDao;
	@Override
	public Partner selectPartnerByEmail(String email) {
		return hotelDao.selectPartnerByEmail(email);
	}
	@Override
	public List<PlanDetails> queryPlanDetailsByDate(int plan_id, List<String> dateList) {
		return hotelDao.queryPlanDetailsByDate(plan_id, dateList);
	}
	@Override
	public void updatePlanDetailsByDate(Map<String, Object> map) {
		hotelDao.updatePlanDetailsByDate(map);
	}
	@Override
	public List<Map<String, Object>> queryHotelRooms(Map<String, Object> map) {
		return hotelDao.queryHotelRooms(map);
	}
	@Override
	public List<Map<String, Object>> queryRoomTypes(List<Map<String, Object>> list) {
		return hotelDao.queryRoomTypes(list);
	}
	@Override
	public List<Map<String, Object>> queryPlans(List<Map<String, Object>> list) {
		return hotelDao.queryPlans(list);
	}
	@Override
	public int setPlanSaleFlag(Map<String, Object> map) {
		return hotelDao.setPlanSaleFlag(map);
	}
	@Override
	public void insertPlanDetails(List<PlanDetails> planDetailsInsertList) {
		hotelDao.insertPlanDetails(planDetailsInsertList);		
	}
	@Override
	public Date selectLastDateByPlanId(int plan_id) {
		return hotelDao.selectLastDateByPlanId(plan_id);
	}
	@Override
	public Map<String, Object> queryBreakfastByPlanId(int plan_id) {
		return hotelDao.queryBreakfastByPlanId(plan_id);
	}
	@Override
	public int queryHotelIdByPlanId(int plan_id) {
		return hotelDao.queryHotelIdByPlanId(plan_id);
	}
	@Override
	public int countPlanDetailsDiff(Map<String, Object> map) {
		return hotelDao.countPlanDetailsDiff(map);
	}
	@Override
	public int insertPlan(Map<String, Object> map) {
		return hotelDao.insertPlan(map);
	}
	@Override
	public List<Map<String, Object>> queryPlan(Map<String, Object> map) {
		return hotelDao.queryPlan(map);
	}
	@Override
	public int updatePlan(Map<String, Object> map) {
		return hotelDao.updatePlan(map);
	}

	
}
