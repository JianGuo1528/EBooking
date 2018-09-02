package com.ustrip.impl;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.taobao.api.ApiException;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.XhotelRateUpdateRequest;
import com.taobao.api.request.XhotelRatesUpdateRequest;
import com.taobao.api.request.XhotelRoomtypeAddRequest;
import com.taobao.api.response.XhotelRateUpdateResponse;
import com.taobao.api.response.XhotelRatesUpdateResponse;
import com.taobao.api.response.XhotelRoomtypeAddResponse;
import com.ustrip.common.UsiTripConstant;
import com.ustrip.dao.RoomDao;
import com.ustrip.entity.AliRate;
import com.ustrip.service.RoomService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public List<Map<String, Object>> queryRoomTypes(List<Map<String, Object>> hotelList) {
        return roomDao.queryRoomTypes(hotelList);
    }

    @Override
    public Map<String, Object> queryRoomTypesByHotelId(Integer hotelId) {
        return roomDao.queryRoomTypesByHotelId(hotelId);
    }

    @Override
    public String pushRoomTypeToAli(TaobaoClient client, Map<String, Object> map, String sessionKey) throws Exception {
        XhotelRoomtypeAddRequest req = new XhotelRoomtypeAddRequest();
        req.setOuterId((String) map.get("room_type_id"));
        req.setName((map.get("room_type_name_zh") == null || "".equals(map.get("room_type_name_zh"))) ? (String) map.get("room_type_name") : (String) map.get("room_type_name_zh"));
        req.setMaxOccupancy((Long) map.get("max_person"));
        req.setBedType((String) map.get("ali_bed"));
        req.setOutHid((String) map.get("hotelId"));
//		req.setPics("[{\"url\":\"http://taobao.com/123.jpg\",\"ismain\":\"true\"},{\"url\":\"http://taobao.com/456.jpg\",\"ismain\":\"false\"},{\"url\":\"http://taobao.com/789.jpg\",\"ismain\":\"false\"}]");
        req.setNameE((String) map.get("room_type_name"));
        req.check();
        XhotelRoomtypeAddResponse rsp = client.execute(req, sessionKey);
        return rsp.getBody();
    }

    @Override
    public Map<String, Object> queryRateDetailByPlanId(Integer planId) {
        return roomDao.queryRateDetailByPlanId(planId);
    }

    @Override
    public List<Map<String, Object>> queryRateByPlanId(Integer planId) {
        return roomDao.queryRateByPlanId(planId);
    }

    @Override
    public String pushRateUpdateToAli(TaobaoClient client, Map<String, Object> rateDetailMap, List<Map<String, Object>> planList, String sessionKey) throws Exception {
        XhotelRateUpdateRequest req = new XhotelRateUpdateRequest();
        Map<String, Object> map = new HashMap<>();
        map.put("use_room_inventory", false);
        map.put("inventory_price", planList);
        String jString = JSON.toJSONString(map);
        req.setInventoryPrice(jString);
        req.setRateplanCode((String) rateDetailMap.get("plan_id"));
        req.setOutRid((String) rateDetailMap.get("room_type_id"));
        req.check();
        XhotelRateUpdateResponse rsp = client.execute(req, sessionKey);
        return rsp.getBody();
    }

    @Override
    public List<Map<String, Object>> selectPlanDetailsByPushStatus(Integer pushStatus) {
        return roomDao.selectPlanDetailsByPushStatus(pushStatus);
    }

    @Override
    public String pushRatesUpdate2Ali(TaobaoClient client, List<Map<String, Object>> planDetails) throws ApiException {
        List<AliRate> list = new ArrayList<AliRate>();
        Integer planId = Integer.valueOf(String.valueOf(planDetails.get(0).get("plan_id")));
        Integer bedId = Integer.valueOf(String.valueOf(planDetails.get(0).get("room_type_id")));
        AliRate aliRate = new AliRate();
        AliRate.DataBean dataBean = new AliRate.DataBean();
        List<AliRate.DataBean.InventoryPriceBean> inventoryPriceBeans = new ArrayList<AliRate.DataBean.InventoryPriceBean>();
        int dataCount = 0;
        for (Map<String, Object> planDetail : planDetails) {
            Integer tempPlanId = Integer.valueOf(String.valueOf(planDetail.get("plan_id")));
            if (!Objects.equals(planId, tempPlanId)) {
                aliRate.setOut_rid(String.valueOf(bedId));
                aliRate.setRateplan_code(String.valueOf(planId));
                dataBean.setUse_room_inventory(false);
                dataBean.setInventory_price(inventoryPriceBeans);
                aliRate.setData(dataBean);
                list.add(aliRate);

                bedId = Integer.valueOf(String.valueOf(planDetail.get("room_type_id")));
                planId = tempPlanId;
                aliRate = new AliRate();
                dataBean = new AliRate.DataBean();
                inventoryPriceBeans = new ArrayList<AliRate.DataBean.InventoryPriceBean>();
                dataCount = 0;
            }
            if (dataCount++ >= 180) {
                continue;
            }
            AliRate.DataBean.InventoryPriceBean inventoryPriceBean = new AliRate.DataBean.InventoryPriceBean();
            inventoryPriceBean.setDate(String.valueOf(planDetail.get("date")));
            inventoryPriceBean.setPrice(Integer.parseInt(String.valueOf(planDetail.get("price"))));
            inventoryPriceBean.setQuota(Integer.parseInt(String.valueOf(planDetail.get("quota"))));
            inventoryPriceBean.setStatus(1);
            inventoryPriceBeans.add(inventoryPriceBean);
        }
        aliRate.setOut_rid(String.valueOf(bedId));
        aliRate.setRateplan_code(String.valueOf(planId));
        dataBean.setUse_room_inventory(false);
        dataBean.setInventory_price(inventoryPriceBeans);
        aliRate.setData(dataBean);
        list.add(aliRate);

        Gson gson = new GsonBuilder().create();
        String jsonRates = gson.toJson(list);

        XhotelRatesUpdateRequest req = new XhotelRatesUpdateRequest();
        req.setRateInventoryPriceMap(jsonRates);
        req.check();
        XhotelRatesUpdateResponse rsp = client.execute(req, UsiTripConstant.ALI_SESSION_KEY);
        return rsp.getBody();
//        return jsonRates;
    }

	@Override
	public int updatePushStatus(Integer planId) {
        return roomDao.updatePushStatus(planId);
	}

	@Override
    public List<Map<String, Object>> selectPlanDetailsByDate(String planId, String checkIn, String checkOut) {
        return roomDao.selectPlanDetailsByDate(planId, checkIn, checkOut);
    }
}
