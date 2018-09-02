package com.ustrip.delegate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.ustrip.common.DateUtil;
import com.ustrip.common.ErrorCodeEnum;
import com.ustrip.common.MiniException;
import com.ustrip.common.UsiTripConstant;
import com.ustrip.entity.Partner;
import com.ustrip.entity.PlanDetails;
import com.ustrip.entity.PlanDetailsRequestBean;
import com.ustrip.entity.PlanDetailsRequestBean.DateArray;
import com.ustrip.entity.PlanDetailsResponseBean;
import com.ustrip.service.EbookingService;

@Service
public class EbookingServiceDelegate {
	@Autowired
	private RedisTemplate<String,String> redisTemplate;
	@Autowired
	private EbookingService ebookingService;
	@Autowired
	private TransactionDelegate transactionDelegate;
	private static Logger logger = LogManager.getLogger(EbookingServiceDelegate.class.getName());
		
	public void buildPlanDetails(Integer hotelId, Integer planId, Integer buildDays){
		Date lastDate = ebookingService.selectLastDateByPlanId(planId);
		Date now = new Date();
		if(lastDate==null)lastDate=DateUtil.addDate(now, -1);
		if(buildDays==null||buildDays==0)buildDays=100;
		int weekDay = DateUtil.getDayOfWeek2(lastDate);
		List<PlanDetails> planDetailsInsertList = new ArrayList<PlanDetails>();
		for(int i=1;i<=buildDays;i++){
			Date date = DateUtil.addDate(lastDate, i);
			weekDay++;
			if(weekDay>=7)weekDay=0;
			PlanDetails planDetails = new PlanDetails();
			planDetails.setHotelId(hotelId);
			planDetails.setPlan_id(planId);
			planDetails.setSale_date(date);
			planDetails.setDay_of_week(weekDay);
			planDetails.setUpdated_at(now);
			planDetailsInsertList.add(planDetails);
		}
		
		ebookingService.insertPlanDetails(planDetailsInsertList);
	}
	
	public PlanDetailsResponseBean queryPlanDetailsByDate(JSONObject reqData){
		if(!reqData.has("planId")||!reqData.has("dateArray")){
			throw new MiniException(UsiTripConstant.ERRORCODE_ER1002, ErrorCodeEnum.ER1002.getMsg());
		}
		int planId = reqData.getInt("planId");
		Map<String, Object> breakfastNames = ebookingService.queryBreakfastByPlanId(planId);
		PlanDetailsResponseBean planDetailsResponseBean = new PlanDetailsResponseBean();
		planDetailsResponseBean.setPlanId(planId);
		planDetailsResponseBean.setBreakfastType(breakfastNames.get("type_name").toString());
		String nameZh = breakfastNames.get("type_name_zh")==null?"":breakfastNames.get("type_name_zh").toString();
		planDetailsResponseBean.setBreakfastTypeCn(nameZh);
		JSONArray dateArray = reqData.getJSONArray("dateArray");
		List<String> dateList = new ArrayList<String>();
		for(int i=0;i<dateArray.length();i++){
			dateList.add(dateArray.getJSONObject(i).getString("date"));
		}
		List<PlanDetails> planDetails = ebookingService.queryPlanDetailsByDate(planId,dateList);
		if(planDetails==null||planDetails.size()==0){
			return planDetailsResponseBean;			
		}
		planDetailsResponseBean.setContractPrice(planDetails.get(0).getContract_price());
		planDetailsResponseBean.setSupplementPrice(planDetails.get(0).getSupplement_price());
		planDetailsResponseBean.setContractAvailableAmount(planDetails.get(0).getContract_available_amount());
		planDetailsResponseBean.setSupplementAvailableAmount(planDetails.get(0).getSupplement_available_amount());
		planDetailsResponseBean.setContractSoldAmount(planDetails.get(0).getContract_sold_amount());
		planDetailsResponseBean.setSupplementSoldAmount(planDetails.get(0).getSupplement_sold_amount());
		planDetailsResponseBean.setAheadOfCheckin(planDetails.get(0).getAhead_of_checkin());
		planDetailsResponseBean.setMinimumLengthOfStay(planDetails.get(0).getMinimum_length_of_stay());
		planDetailsResponseBean.setCancellationStatus(planDetails.get(0).getCancellation_status());
		planDetailsResponseBean.setCancellationDay(planDetails.get(0).getCancellation_day());
		List<PlanDetailsResponseBean.PlanDetails> planDetailList = new ArrayList<PlanDetailsResponseBean.PlanDetails>();
		
		for(int i=0;i<planDetails.size();i++){
			if(planDetailsResponseBean.getContractPrice()!=null){
				if(planDetailsResponseBean.getContractPrice()!=planDetails.get(i).getContract_price())planDetailsResponseBean.setContractPrice(null);
			}
			if(planDetailsResponseBean.getSupplementPrice()!=null){
				if(planDetailsResponseBean.getSupplementPrice()!=planDetails.get(i).getSupplement_price())planDetailsResponseBean.setSupplementPrice(null);
			}
			if(planDetailsResponseBean.getContractAvailableAmount()!=null){
				if(planDetailsResponseBean.getContractAvailableAmount()!=planDetails.get(i).getContract_available_amount())planDetailsResponseBean.setContractAvailableAmount(null);
			}
			if(planDetailsResponseBean.getSupplementAvailableAmount()!=null){
				if(planDetailsResponseBean.getSupplementAvailableAmount()!=planDetails.get(i).getSupplement_available_amount())planDetailsResponseBean.setSupplementAvailableAmount(null);
			}
			if(planDetailsResponseBean.getContractSoldAmount()!=null){
				if(planDetailsResponseBean.getContractSoldAmount()!=planDetails.get(i).getContract_sold_amount())planDetailsResponseBean.setContractSoldAmount(null);
			}
			if(planDetailsResponseBean.getSupplementSoldAmount()!=null){
				if(planDetailsResponseBean.getSupplementSoldAmount()!=planDetails.get(i).getSupplement_sold_amount())planDetailsResponseBean.setSupplementSoldAmount(null);
			}	
			if(planDetailsResponseBean.getAheadOfCheckin()!=null){
				if(planDetailsResponseBean.getAheadOfCheckin()!=planDetails.get(i).getAhead_of_checkin())planDetailsResponseBean.setAheadOfCheckin(null);
			}
			if(planDetailsResponseBean.getMinimumLengthOfStay()!=null){
				if(planDetailsResponseBean.getMinimumLengthOfStay()!=planDetails.get(i).getMinimum_length_of_stay())planDetailsResponseBean.setMinimumLengthOfStay(null);
			}
			if(planDetailsResponseBean.getCancellationStatus()!=null){
				if(planDetailsResponseBean.getCancellationStatus()!=planDetails.get(i).getCancellation_status())planDetailsResponseBean.setCancellationStatus(null);
			}
			if(planDetailsResponseBean.getCancellationDay()!=null){
				if(planDetailsResponseBean.getCancellationDay()!=planDetails.get(i).getCancellation_day())planDetailsResponseBean.setCancellationDay(null);
			}
			PlanDetailsResponseBean.PlanDetails planDetail = new PlanDetailsResponseBean.PlanDetails();
			planDetail.setDate(DateUtil.formateUTC2Date3(planDetails.get(i).getSale_date()));
			planDetail.setContractPrice(planDetails.get(i).getContract_price());
			planDetail.setSupplementPrice(planDetails.get(i).getSupplement_price());
			planDetail.setContractAvailableAmount(planDetails.get(i).getContract_available_amount());
			planDetail.setSupplementAvailableAmount(planDetails.get(i).getSupplement_available_amount());
			planDetail.setContractSoldAmount(planDetails.get(i).getContract_sold_amount());
			planDetail.setSupplementSoldAmount(planDetails.get(i).getSupplement_sold_amount());
			planDetail.setAheadOfCheckin(planDetails.get(i).getAhead_of_checkin());
			planDetail.setMinimumLengthOfStay(planDetails.get(i).getMinimum_length_of_stay());
			planDetail.setCancellationStatus(planDetails.get(i).getCancellation_status());
			planDetail.setCancellationDay(planDetails.get(i).getCancellation_day());
			planDetailList.add(planDetail);
		}
		planDetailsResponseBean.setPlanDetails(planDetailList);
		return planDetailsResponseBean;
	}
	
	public Map<String,Object> updatePlanDetailsByDate(JSONObject reqData){
		Map<String,Object> result = new HashMap<String,Object>();
		result = transactionDelegate.updatePlanDetailsByDate(reqData);
		return result;
	}
}
