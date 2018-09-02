package com.ustrip.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ustrip.entity.Partner;
import com.ustrip.entity.PlanDetails;

public interface EbookingService {
	Partner selectPartnerByEmail(String email);

	public Date selectLastDateByPlanId(@Param("plan_id") int plan_id);
	void insertPlanDetails(List<PlanDetails> planDetailsInsertList);
	public List<PlanDetails> queryPlanDetailsByDate(int plan_id, List<String> dateList);
	void updatePlanDetailsByDate(Map<String, Object> map);
	public Map<String, Object> queryBreakfastByPlanId(int plan_id);
	
	public List<Map<String, Object>> queryHotelRooms(Map<String, Object> map);
	public List<Map<String, Object>> queryRoomTypes(List<Map<String, Object>> list);
	public List<Map<String, Object>> queryPlans(List<Map<String, Object>> list);
	public List<Map<String, Object>> queryPlan(Map<String, Object> map);
	int setPlanSaleFlag(Map<String, Object> map);
	public int insertPlan(Map<String, Object> map);
	public int updatePlan(Map<String, Object> map);
	public int queryHotelIdByPlanId(@Param("plan_id") int plan_id);
	public int countPlanDetailsDiff(Map<String, Object> map);
}
