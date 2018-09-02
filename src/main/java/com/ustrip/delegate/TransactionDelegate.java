package com.ustrip.delegate;
import com.google.gson.Gson;
import com.ustrip.common.DateUtil;
import com.ustrip.common.ErrorCodeEnum;
import com.ustrip.common.MiniException;
import com.ustrip.common.UsiTripConstant;
import com.ustrip.entity.Dict;
import com.ustrip.entity.PlanDetails;
import com.ustrip.entity.PlanDetailsRequestBean;
import com.ustrip.entity.User;
import com.ustrip.entity.PlanDetailsRequestBean.DateArray;
import com.ustrip.service.DictService;
import com.ustrip.service.UserService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustrip.service.EbookingService;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TransactionDelegate {		

	@Autowired
	private EbookingService ebookingService;

	@Autowired
	private UserService userService;

	@Autowired
	private DictService dictService;

	@Autowired
	private EbookingServiceDelegate ebookingServiceDelegate;
	private static Logger logger = LogManager.getLogger(TransactionDelegate.class.getName());

	public Integer transactionDeleteUserByUsernameAndPwd(String delUsername, String delApiPassword) {
		return userService.deleteUserByUsernameAndPwd(delUsername, delApiPassword);
	}

	public Integer transactionUpdateUserById(User user) {
		return userService.updateUserById(user);
	}

    public Integer transactionUpdateUserByUsername(User user, String oldUsername) {
        return userService.updateUserByUsername(user, oldUsername);
    }

    public Integer transactionResetPwdByUsername(String username) {
        return userService.resetPwdByUsername(username);
    }

    public int transactionSetPlanSaleFlag(Map<String, Object> map) {
        return ebookingService.setPlanSaleFlag(map);
    }

	public int transactionInsertPlan(Map<String, Object> map) {
		return ebookingService.insertPlan(map);
	}
	
	public int transactionUpdatePlan(Map<String, Object> map) {
		return ebookingService.updatePlan(map);
	}
	
	public Dict selectTypeById(Integer id) {
		return dictService.selectByPrimaryKey(id);
	}

	public Integer transactionUpdateTypeById(Dict dict) {
		return dictService.updateByPrimaryKey(dict);
	}

	public List<Dict> selectAllTypeByHotelId(String type, Integer hotelId, Boolean... onlySpecificHotel) {
		return dictService.selectAllTypeByHotelId(type, hotelId, onlySpecificHotel);
	}

	public Dict selectTypeByHotelIdAndId(Integer id, Integer hotelID) {
		return dictService.selectTypeByHotelIdAndId(id, hotelID);
	}

	public Integer transactionUpdateDictByHotelIdAndId(Dict dict, Integer id, Integer hotelID) {
		return dictService.updateDictByHotelIdAndId(dict, id, hotelID);
	}

	public Integer transactionInsertType(Dict dict) {
		return dictService.insertType(dict);
	}
	
	public Map<String,Object> updatePlanDetailsByDate(JSONObject reqData){
		Map<String,Object> result = new HashMap<String,Object>();
		Gson gson = new Gson();
		PlanDetailsRequestBean planDetailsRequestBean =  gson.fromJson(reqData.toString(), PlanDetailsRequestBean.class);
		List<DateArray> dateArray = planDetailsRequestBean.getDateArray();
		List<String> dateList = new ArrayList<String>();
		for(int i=0;i<dateArray.size();i++){
			dateList.add(dateArray.get(i).getDate());
		}
		Date maxDate = DateUtil.parseDate(dateList.get(dateList.size()-1));
		int planId = reqData.getInt("planId");
		int hotelId = ebookingService.queryHotelIdByPlanId(planId);
		Date lastDate = ebookingService.selectLastDateByPlanId(planId);
		while(lastDate==null||DateUtil.dateSimpleCompare(maxDate, lastDate)==-1){
			ebookingServiceDelegate.buildPlanDetails(hotelId, planId, 100);
			lastDate = ebookingService.selectLastDateByPlanId(planId);
		}
		int ignoreDiff = reqData.getInt("ignoreDiff");
		if (ignoreDiff == 0) {
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("plan_id", planId);
			if (planDetailsRequestBean.getContractPrice() != null) {
				map.put("contract_price", planDetailsRequestBean.getContractPrice());
			}
			if (planDetailsRequestBean.getContractAvailableAmount() != null) {
				map.put("contract_available_amount", planDetailsRequestBean.getContractAvailableAmount());
			}
			if (planDetailsRequestBean.getSupplementPrice() != null) {
				map.put("supplement_price", planDetailsRequestBean.getSupplementPrice());
			}
			if (planDetailsRequestBean.getSupplementAvailableAmount() != null) {
				map.put("supplement_available_amount", planDetailsRequestBean.getSupplementAvailableAmount());
			}
			if (planDetailsRequestBean.getAheadOfCheckin() != null) {
				map.put("ahead_of_checkin", planDetailsRequestBean.getAheadOfCheckin());				
			}
			if (planDetailsRequestBean.getMinimumLengthOfStay() != null) {
				map.put("minimum_length_of_stay", planDetailsRequestBean.getMinimumLengthOfStay());
			}
			if (planDetailsRequestBean.getCancellationStatus() != null) {
				map.put("cancellation_status", planDetailsRequestBean.getCancellationStatus());
			}
			if (planDetailsRequestBean.getCancellationDay() != null) {
				map.put("cancellation_day", planDetailsRequestBean.getCancellationDay());
			}
			map.put("dateList", dateList);
			int hasDiff = ebookingService.countPlanDetailsDiff(map);
			if(hasDiff>1){
				logger.info("Warnning! The values are not consistent in selected dates.");
				throw new MiniException(UsiTripConstant.ERRORCODE_ER1401, ErrorCodeEnum.ER1401.getMsg());
			}
		}
		Map<String,Object> planDetailsUpdateMap = new HashMap<String,Object>();
		planDetailsUpdateMap.put("dateList", dateList);
		planDetailsUpdateMap.put("plan_id", planId);
		if (planDetailsRequestBean.getContractPrice() != null) {
			planDetailsUpdateMap.put("contract_price", planDetailsRequestBean.getContractPrice());
		}
		if (planDetailsRequestBean.getContractAvailableAmount() != null) {
			planDetailsUpdateMap.put("contract_available_amount", planDetailsRequestBean.getContractAvailableAmount());
		}		
		if (planDetailsRequestBean.getSupplementPrice() != null) {
			planDetailsUpdateMap.put("supplement_price", planDetailsRequestBean.getSupplementPrice());
		}
		if (planDetailsRequestBean.getSupplementAvailableAmount() != null) {
			planDetailsUpdateMap.put("supplement_available_amount", planDetailsRequestBean.getSupplementAvailableAmount());
		}
		if (planDetailsRequestBean.getAheadOfCheckin() != null) {
			planDetailsUpdateMap.put("ahead_of_checkin", planDetailsRequestBean.getAheadOfCheckin());				
		}
		if (planDetailsRequestBean.getMinimumLengthOfStay() != null) {
			planDetailsUpdateMap.put("minimum_length_of_stay", planDetailsRequestBean.getMinimumLengthOfStay());
		}
		if (planDetailsRequestBean.getCancellationStatus() != null) {
			planDetailsUpdateMap.put("cancellation_status", planDetailsRequestBean.getCancellationStatus());
		}
		if (planDetailsRequestBean.getCancellationDay() != null) {
			planDetailsUpdateMap.put("cancellation_day", planDetailsRequestBean.getCancellationDay());
		}
		ebookingService.updatePlanDetailsByDate(planDetailsUpdateMap);
		result.put("success", true);
		return result;
	}
}

