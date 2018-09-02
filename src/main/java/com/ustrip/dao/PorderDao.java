package com.ustrip.dao;

import com.ustrip.entity.Porder;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Arthur
 */

public interface PorderDao 
{
	
	void insertPorder(@Param("day_number") int day_number, @Param("room_number") int room_number, @Param("partnerId") int partnerId, @Param("provider") String provider, @Param("orderReference") String orderReference, @Param("orderPReference") String orderPReference, @Param("hotelId") int hotelId, @Param("hotelName") String hotelName, @Param("hotelName_zh") String hotelName_zh,
                      @Param("bookerFirstName") String bookerFirstName, @Param("bookerLastName") String bookerLastName, @Param("bookerEmail") String bookerEmail, @Param("bookerPhone") String bookerPhone, @Param("checkinDate") String checkinDate, @Param("checkoutDate") String checkoutDate, @Param("totalPrice") double totalPrice,
                      @Param("totalNetPrice") double totalNetPrice, @Param("totalOriginalNetPrice") double totalOriginalNetPrice, @Param("status") String status, @Param("currencyCode") String currencyCode, @Param("creationTime") String creationTime, @Param("code") String code, @Param("vat") String vat,
                      @Param("supplier") String supplier, @Param("payment_type") String payment_type, @Param("payment_status") String payment_status);
	void updatePorderStatusRefByOrderRefIdPartnerId(@Param("status") String status, @Param("cancellationReference") String cancellationReference, @Param("orderReference") String orderReference, @Param("partnerId") int partnerId);
//	void updatePorderStatusByOrderRefIdPartnerId(@Param("status")String status,@Param("orderReference")String orderReference, @Param("partnerId")int partnerId);

	void updateOrderIP(@Param("orderReference") String orderReference, @Param("ip") String ip);

	void updateOrderCReference(@Param("orderReference") String orderReference, @Param("orderCReference") String orderCReference);

	int updatePlanAvailability(@Param("list") List<Map<String, Object>> list);
	int updatePlanAvailabilityCancel(@Param("list") List<Map<String, Object>> list);

	Porder selectOrderById(@Param("id") Integer id);
}

