package com.ustrip.service;

import com.taobao.api.TaobaoClient;
import com.ustrip.entity.AliHotelRoomsResponse;
import com.ustrip.entity.Hotel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public interface HotelService {

    List<Hotel> selectHotelByProvider(String provider);
    Hotel selectHotelByHotelId(int hotelId);

    void pushHotelContent2Ctrip(Hotel hotel, Properties templateProps) throws Exception;

    void retrieveStatusFromCtrip(Integer hotelId, Properties templateProps) throws Exception;
	List<Map<String,Object>> selectPlansByHotelId(int max_person,List<Integer> hotelIds);
	List<Map<String,Object>> selectPlansByDate(int plan_id,int room_number,int day_number,String check_in,String check_out,int ahead_of_checkin);
	List<HashMap<String,Object>> getHotelNameFromHotel(List<Integer> hotelIds, String provider);

    Map<String,Object> selectPlanByPlanId(Integer planId);

    Map<String,Object> selectTypeById(Integer id);

    String pushHotelContent2Ali(TaobaoClient client, Hotel hotel) throws Exception;

    Long getCityIdFromAli(TaobaoClient client, Hotel hotel) throws Exception;

    List<Hotel> selectHotelsWithPlansByHotelIds(int max_person, List<String> hotelIds, String ratePlanId);
    
    List<Map<String,Object>> queryRoomTypeList(String hotelCode, String roomTypeId);
    
	Map<String, Object> queryRateName(Integer valueOf);

    List<String> selectHotelByCityCode(String cityCode);
}
