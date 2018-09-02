package com.ustrip.dao;

import com.ustrip.entity.AliHotelRoomsResponse.Hotel.RoomTypes;
import com.ustrip.entity.Hotel;
import com.ustrip.entity.Partner;
import com.ustrip.entity.PlanDetails;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HotelDao {
    Partner selectPartnerByEmail(@Param("email") String email);

    public List<Map<String, Object>> queryHotelRooms(Map<String, Object> map);

    public List<Map<String, Object>> queryRoomTypes(List<Map<String, Object>> list);

    public List<Map<String, Object>> queryPlans(List<Map<String, Object>> list);

    public List<Map<String, Object>> queryPlan(Map<String, Object> map);

    public int setPlanSaleFlag(Map<String, Object> map);

    public int insertPlan(Map<String, Object> map);

    public int updatePlan(Map<String, Object> map);

    public Date selectLastDateByPlanId(@Param("plan_id") int plan_id);

    void insertPlanDetails(@Param("planDetailsInsertList") List<PlanDetails> planDetailsInsertList);

    public List<PlanDetails> queryPlanDetailsByDate(@Param("plan_id") int plan_id,
                                                    @Param("dateList") List<String> dateList);

    void updatePlanDetailsByDate(Map<String, Object> map);

    public Map<String, Object> queryBreakfastByPlanId(@Param("plan_id") int plan_id);

    public int queryHotelIdByPlanId(@Param("plan_id") int plan_id);

    public int countPlanDetailsDiff(Map<String, Object> map);

    Hotel selectHotelByHotelId(@Param("hotelId") int hotelId);

    List<Hotel> selectHotelByProvide(@Param("provider") String provider);

    List<Map<String, Object>> selectPlansByHotelId(@Param("max_person") int max_person, @Param("hotelIds") List<Integer> hotelIds);

    List<Map<String, Object>> selectPlansByDate(@Param("plan_id") int plan_id, @Param("room_number") int room_number, @Param("day_number") int day_number, @Param("check_in") String check_in, @Param("check_out") String check_out, @Param("ahead_of_checkin") int ahead_of_checkin);

    List<HashMap<String, Object>> getHotelNameFromHotel(@Param("hotelIds") List<Integer> hotelIds, @Param("provider") String provider);

    Map<String, Object> selectPlanByPlanId(@Param("planId") Integer planId);

    Map<String, Object> selectTypeById(@Param("id") Integer id);

    Map<String, Object> selectPorderByOrderId(String orderId);

    List<Hotel> selectHotelsWithPlansByHotelIds(@Param("max_person") int max_person, @Param("hotelIds") List<String> hotelIds, @Param("ratePlanId") String ratePlanId);

    List<Map<String, Object>> queryRoomTypeList(@Param("hotelId") String hotelId, @Param("roomTypeId") String roomTypeId);

    Map<String, Object> queryRateName(Integer planId);
}