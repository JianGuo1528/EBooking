package com.ustrip.delegate;

import com.google.gson.Gson;
import com.ustrip.common.AjustPrice;
import com.ustrip.common.CtripException;
import com.ustrip.common.DateUtil;
import com.ustrip.common.ProviderEnum;
import com.ustrip.common.UsiTripConstant;
import com.google.gson.GsonBuilder;
import com.ustrip.common.*;
import com.ustrip.dao.HotelDao;
import com.ustrip.dao.PorderCtripDao;
import com.ustrip.dao.PorderDao;
import com.ustrip.entity.*;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions.HotelStays;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates.BestAvailableRate;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates.BestAvailableRate.Base;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates.BestAvailableRate.CancelPenalties;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates.BestAvailableRate.CancelPenalties.CancelPenalty;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates.BestAvailableRate.CancelPenalties.CancelPenalty.AmountPercent;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates.BestAvailableRate.CancelPenalties.CancelPenalty.Deadline;
import com.ustrip.entity.OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates.BestAvailableRate.MealsIncluded;
import com.ustrip.entity.OTAHotelAvailRS.RoomStays;
import com.ustrip.service.EbookingService;
import com.ustrip.service.HotelService;

import org.apache.ibatis.annotations.Param;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JacksonJsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
@Service
public class CtripServiceDelegate {
    private RedisTemplate<String, Serializable> redisTemplate;

    @Autowired
    public void setRedisTemplate(RedisTemplate<String, Serializable> redisTemplate) {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new JacksonJsonRedisSerializer<BookInfo>(BookInfo.class));
        this.redisTemplate = redisTemplate;
    }

    @Autowired
    private EbookingService ebookingService;
    @Autowired
    private HotelService hotelService;
    @Autowired
    private TransactionDelegate transactionDelegate;

    private static Logger logger = LogManager.getLogger(CtripServiceDelegate.class.getName());

    @Autowired
    private HotelDao hotelDao;

    @Autowired
    private PorderDao porderDao;

    @Autowired
    private PorderCtripDao porderCtripDao;

    public OTAHotelAvailGetRS pullAvailability(OTAHotelAvailGetRQ reqData) throws Exception {
        String response = "";
        String checkInStr = reqData.getHotelAvailRequests().getHotelAvailRequest().getDateRange().getStart();
        String checkOutStr = reqData.getHotelAvailRequests().getHotelAvailRequest().getDateRange().getEnd();
        Integer count = reqData.getHotelAvailRequests().getHotelAvailRequest().getRoomTypeCandidates()
                .getRoomTypeCandidate().getGuestCounts().getGuestCount().getCount();
        Integer roomNumber = reqData.getHotelAvailRequests().getHotelAvailRequest().getRoomTypeCandidates()
                .getRoomTypeCandidate().getQuantity();
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format1.parse(checkInStr);
        Long cin = date.getTime();
        Date date2 = format1.parse(checkOutStr);
        Long cout = date2.getTime();
        Long dayNumber = Math.round((cout - cin) / (double) 86400000);
        DateTime dateTime = new DateTime(new Date().getTime());
        DateTime checkInTime = new DateTime(cin);
        int aheadOfCheckin = Days.daysBetween(dateTime, checkInTime).getDays();
        OTAHotelAvailGetRS resp = new OTAHotelAvailGetRS();
        resp.setSuccess("");
        resp.setEchoToken(reqData.getEchoToken());
        resp.setTimeStamp(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date()) + ".0Z");
        resp.setPrimaryLangID("en-us");
        OTAHotelAvailGetRS.TPAExtensions tpa = new OTAHotelAvailGetRS.TPAExtensions();
        OTAHotelAvailGetRS.TPAExtensions.HotelStays hotelStays = new OTAHotelAvailGetRS.TPAExtensions.HotelStays();
        resp.setTPAExtensions(tpa);
        tpa.setHotelStays(hotelStays);
        if (reqData.getHotelAvailRequests().getHotelAvailRequest().getRatePlanCandidates()
                .getRatePlanCandidate().getHotelRefs().getHotelRef().size() == 0) {
            throw new CtripException("OTA_HotelAvailGetRS", reqData.getEchoToken(), "1", "322", "No availability");
        }
        for (int n = 0; n < reqData.getHotelAvailRequests().getHotelAvailRequest().getRatePlanCandidates()
                .getRatePlanCandidate().getHotelRefs().getHotelRef().size(); n++) {
            List<Integer> pids = new ArrayList<Integer>();
            pids.add(Integer.valueOf(reqData.getHotelAvailRequests().getHotelAvailRequest().getRatePlanCandidates()
                    .getRatePlanCandidate().getHotelRefs().getHotelRef().get(n).getHotelCode()));
            List<HashMap<String, Object>> mapHotelNames = hotelService.getHotelNameFromHotel(pids,
                    ProviderEnum.EBooking.getName());
            Double priceRatio = 0.1;
            priceRatio = (mapHotelNames.size() == 0 || mapHotelNames.get(0).get("priceRatio") == null) ? priceRatio
                    : (Double) mapHotelNames.get(0).get("priceRatio");

            OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay hotelStay = new OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay();
            hotelStay.setHotelCode(pids.get(0));
            OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages availStatusMessages = new OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages();
            OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage availStatusMessage = new OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage();
            availStatusMessages.setAvailStatusMessage(availStatusMessage);
            hotelStay.setAvailStatusMessages(availStatusMessages);
            for (int h = 1; h <= count; h++) {
                List<Map<String, Object>> planMap = hotelService.selectPlansByHotelId(h, pids);
                OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates rates = new OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates();
                for (int i = 0; i < planMap.size(); i++) {
                    int planId = (int) planMap.get(i).get("plan_id");
                    int roomId = (int) planMap.get(i).get("room_type_id");
                    int boardId = (int) planMap.get(i).get("breakfast_type_id");
                    OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates.BestAvailableRate rate = new OTAHotelAvailGetRS.TPAExtensions.HotelStays.HotelStay.AvailStatusMessages.AvailStatusMessage.BestAvailableRates.BestAvailableRate();
                    rate.setRoomTypeCode("R" + String.valueOf(roomId));
                    rate.setRatePlanCode("P" + String.valueOf(planId));
                    rates.setOccupancy(h);
                    rates.setEffectiveDate(checkInStr);
                    rates.setExpireDate(checkOutStr);
                    List<Map<String, Object>> rateList = hotelService.selectPlansByDate(planId, roomNumber,
                            dayNumber.intValue(), checkInStr, checkOutStr, aheadOfCheckin);
                    if (rateList.size() < dayNumber)
                        continue;
                    double totalPrice = 0;
                    int cancelStatus = rateList.get(0).get("cancellation_status") == null ? 0 : (Integer) rateList.get(
                            0).get("cancellation_status");
                    int cancelDay = rateList.get(0).get("cancellation_day") == null ? 30 : (Integer) rateList.get(0)
                            .get("cancellation_day");
                    // int slot = Integer.MAX_VALUE;
                    // JSONArray availList = new JSONArray();
                    for (int m = 0; m < rateList.size(); m++) {
                        double conPrice = (Double) rateList.get(m).get("contract_price");
                        double supPrice = rateList.get(m).get("supplement_price") == null ? 0 : (Double) rateList
                                .get(m).get("supplement_price");
                        int conNum = (Integer) rateList.get(m).get("contract_available_amount");
                        int supNum = (Integer) rateList.get(m).get("supplement_available_amount");
                        JSONObject avail = new JSONObject();
                        JSONObject conObject = new JSONObject();
                        JSONObject supObject = new JSONObject();
                        // avail.put("date",
                        // rateList.get(m).get("sale_date").toString());
                        // if(conNum+supNum<slot)slot=conNum+supNum;
                        if (conNum < roomNumber) {
                            totalPrice += conNum * conPrice;
                            totalPrice += (roomNumber - conNum) * supPrice;
                        } else {
                            totalPrice += roomNumber * conPrice;

                        }
                        // availList.put(avail);
                    }
                    Double price = totalPrice / dayNumber / roomNumber;
                    price = Math.ceil(AjustPrice.increaseEBookingNetPrice(priceRatio, price));
                    price = price * dayNumber * roomNumber;
                    Base base = new Base();
                    base.setAmountAfterTax(price);
                    base.setAmountBeforeTax(AjustPrice.getBeforeTaxPrice(price));
                    base.setCurrencyCode("USD");
                    rate.setBase(base);
                    if (boardId == 3) {
                        // Room only
                    } else {
                        MealsIncluded mealsIncluded = new MealsIncluded();
                        mealsIncluded.setBreakfast("true");
                        mealsIncluded.setNumberOfMeal(1);
                        mealsIncluded.setLunch("false");
                        mealsIncluded.setDinner("false");
                        rate.setMealsIncluded(mealsIncluded);
                    }
                    CancelPenalties cancelPenalties = new CancelPenalties();
                    CancelPenalty cancelPenalty = new CancelPenalty();
                    AmountPercent amountPercent = new AmountPercent();
                    Deadline deadline = new Deadline();
                    cancelPenalty.setAmountPercent(amountPercent);
                    cancelPenalty.setDeadline(deadline);
                    // amountPercent.setNmbrOfNights(h);
                    amountPercent.setPercent(100);
                    amountPercent.setTaxInclusive("true");
                    if (cancelStatus == 0) {
                        deadline.setOffsetTimeUnit("Day");
                        deadline.setOffsetUnitMultiplier(999);
                        deadline.setOffsetDropTime("BeforeArrival");
                    } else {
                        deadline.setOffsetTimeUnit("Day");
                        deadline.setOffsetUnitMultiplier(cancelDay);
                        deadline.setOffsetDropTime("BeforeArrival");
                    }
                    cancelPenalties.setCancelPenalty(cancelPenalty);
                    rate.setCancelPenalties(cancelPenalties);
                    if (rates.getBestAvailableRate() == null) {
                        rates.setBestAvailableRate(rate);
                    } else if (rates.getBestAvailableRate().getBase().getAmountAfterTax() > rate.getBase()
                            .getAmountAfterTax()) {
                        rates.setBestAvailableRate(rate);
                    }
                }
                availStatusMessage.getBestAvailableRates().add(rates);
            }
            hotelStays.getHotelStay().add(hotelStay);
        }

        return resp;
    }

    public OTAHotelAvailRS checkAvailability(OTAHotelAvailRQ reqData) throws Exception {
        String response = "";
        String checkInStr = reqData.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getStayDateRange().getStart();
        String checkOutStr = reqData.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getStayDateRange().getEnd();
        Integer count = 7;
        if (reqData.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getRoomStayCandidates().getRoomStayCandidate().getGuestCounts().getGuestCount().getCount() != null) {
            count = reqData.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getRoomStayCandidates().getRoomStayCandidate().getGuestCounts().getGuestCount().getCount();
        }
        Integer roomNumber = reqData.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getRoomStayCandidates().getRoomStayCandidate().getQuantity();
        String rateCodeStr = reqData.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getRatePlanCandidates() == null ? "" : reqData.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getRatePlanCandidates().getRatePlanCandidate().getRatePlanCode();
        String roomCodeStr = reqData.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getRoomStayCandidates().getRoomStayCandidate().getRoomTypeCode();
        Integer rateCode = 0;
        Integer roomCode = 0;
        if (rateCodeStr != null && !"".equals(rateCodeStr) && "P".equals(rateCodeStr.substring(0, 1))) {
            rateCode = Integer.valueOf(rateCodeStr.substring(1));
        }
        if (roomCodeStr != null && !"".equals(roomCodeStr) && "R".equals(roomCodeStr.substring(0, 1))) {
            roomCode = Integer.valueOf(roomCodeStr.substring(1));
        }
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format1.parse(checkInStr);
        Long cin = date.getTime();
        Date date2 = format1.parse(checkOutStr);
        Long cout = date2.getTime();
        Long dayNumber = Math.round((cout - cin) / (double) 86400000);
        DateTime dateTime = new DateTime(new Date().getTime());
        DateTime checkInTime = new DateTime(cin);
        int aheadOfCheckin = Days.daysBetween(dateTime, checkInTime).getDays();
        OTAHotelAvailRS resp = new OTAHotelAvailRS();
        resp.setSuccess("");
        resp.setEchoToken(reqData.getEchoToken());
        resp.setTimeStamp(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date()) + ".0Z");
        resp.setPrimaryLangID("en-us");

        RoomStays roomstays = new RoomStays();
        resp.setRoomStays(roomstays);
        List<Integer> pids = new ArrayList<Integer>();
        pids.add(Integer.valueOf(reqData.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getHotelRef().getHotelCode()));
        List<HashMap<String, Object>> mapHotelNames = hotelService.getHotelNameFromHotel(pids,
                ProviderEnum.EBooking.getName());
        Double priceRatio = 0.1;
        priceRatio = (mapHotelNames.size() == 0 || mapHotelNames.get(0).get("priceRatio") == null) ? priceRatio : (Double) mapHotelNames.get(0).get("priceRatio");
        String name = (String) mapHotelNames.get(0).get("name");
        if (mapHotelNames.get(0).get("name_zh") != null && !"".equals(mapHotelNames.get(0).get("name_zh"))) {
            name = name + "(" + mapHotelNames.get(0).get("name_zh") + ")";
        }
        OTAHotelAvailRS.HotelStays hotelStays = new OTAHotelAvailRS.HotelStays();
        OTAHotelAvailRS.HotelStays.HotelStay hotelStay = new OTAHotelAvailRS.HotelStays.HotelStay();
        OTAHotelAvailRS.HotelStays.HotelStay.BasicPropertyInfo bInfo = new OTAHotelAvailRS.HotelStays.HotelStay.BasicPropertyInfo();
        resp.setHotelStays(hotelStays);
        hotelStays.setHotelStay(hotelStay);
        hotelStay.setBasicPropertyInfo(bInfo);
        bInfo.setHotelCode(pids.get(0));
        bInfo.setHotelName(name);

        for (int h = 1; h <= count; h++) {
            List<Map<String, Object>> planMap = hotelService.selectPlansByHotelId(h, pids);
            for (int i = 0; i < planMap.size(); i++) {
                int planId = (int) planMap.get(i).get("plan_id");
                int roomId = (int) planMap.get(i).get("room_type_id");
                String planIdStr = "P" + String.valueOf(planId);
                String roomIdStr = "R" + String.valueOf(roomId);
                if (roomCode != 0 && roomCode != roomId) {
                    continue;
                }
                if (rateCode != 0 && rateCode != planId) {
                    continue;
                }

                int boardId = (int) planMap.get(i).get("breakfast_type_id");

                List<Map<String, Object>> rateList = hotelService.selectPlansByDate(planId, roomNumber, dayNumber.intValue(), checkInStr, checkOutStr, aheadOfCheckin);
                if (rateList.size() < dayNumber) continue;
                double totalPrice = 0;
                int totalNum = 0;
                int cancelStatus = rateList.get(0).get("cancellation_status") == null ? 0 : (Integer) rateList.get(0).get("cancellation_status");
                int cancelDay = rateList.get(0).get("cancellation_day") == null ? 30 : (Integer) rateList.get(0).get("cancellation_day");
                //int slot = Integer.MAX_VALUE;
                //JSONArray availList = new JSONArray();
                OTAHotelAvailRS.RoomStays.RoomStay roomStay = new OTAHotelAvailRS.RoomStays.RoomStay();
                OTAHotelAvailRS.RoomStays.RoomStay.RatePlans ratPlans = new OTAHotelAvailRS.RoomStays.RoomStay.RatePlans();
                OTAHotelAvailRS.RoomStays.RoomStay.RoomRates roomRates = new OTAHotelAvailRS.RoomStays.RoomStay.RoomRates();
                OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts guestCounts = new OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts();
                OTAHotelAvailRS.RoomStays.RoomStay.Total total = new OTAHotelAvailRS.RoomStays.RoomStay.Total();
                OTAHotelAvailRS.RoomStays.RoomStay.TPAExtensions tPAExtensions = new OTAHotelAvailRS.RoomStays.RoomStay.TPAExtensions();
                OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes roomTypes = new OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes();
                OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType roomType = new OTAHotelAvailRS.RoomStays.RoomStay.RoomTypes.RoomType();
                OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts.GuestCount guestCount = new OTAHotelAvailRS.RoomStays.RoomStay.GuestCounts.GuestCount();
                OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan ratePlan = new OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan();
                OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate roomRate = new OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate();
                OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates rates = new OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates();


                roomStay.setRoomRates(roomRates);
                roomStay.setRoomTypes(roomTypes);
                roomStay.setGuestCounts(guestCounts);
                roomStay.setRatePlans(ratPlans);
                roomStay.setTotal(total);
                roomStay.setTPAExtensions(tPAExtensions);
                roomTypes.setRoomType(roomType);
                roomType.setRoomTypeCode(roomIdStr);
                roomRates.setRoomRate(roomRate);
                roomRate.setRates(rates);
                guestCounts.setGuestCount(guestCount);
                guestCount.setAgeQualifyingCode(reqData.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getRoomStayCandidates().getRoomStayCandidate().getGuestCounts().getGuestCount().getAgeQualifyingCode());
                guestCount.setCount(h);
                tPAExtensions.setIsReserved("true");

                if (boardId == 3) {
                    //Room only
                } else {
                    OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded mealsIncluded = new OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.MealsIncluded();
                    mealsIncluded.setBreakfast("true");
                    mealsIncluded.setNumberOfMeal(1);
                    mealsIncluded.setLunch("false");
                    mealsIncluded.setDinner("false");
                    ratePlan.setMealsIncluded(mealsIncluded);
                }
                int slot = Integer.MAX_VALUE;
                for (int m = 0; m < rateList.size(); m++) {
                    double conPrice = (Double) rateList.get(m).get("contract_price");
                    double supPrice = rateList.get(m).get("supplement_price") == null ? 0 : (Double) rateList.get(m).get("supplement_price");
                    int conNum = (Integer) rateList.get(m).get("contract_available_amount");
                    int supNum = (Integer) rateList.get(m).get("supplement_available_amount");
                    totalNum = conNum + supNum;

                    //avail.put("date", rateList.get(m).get("sale_date").toString());
                    if (conNum + supNum < slot) slot = conNum + supNum;
                    if (conNum < roomNumber) {
                        totalPrice += conNum * conPrice;
                        totalPrice += (roomNumber - conNum) * supPrice;

                    } else {
                        totalPrice += roomNumber * conPrice;

                    }
                    //availList.put(avail);
                }
                roomType.setNumberOfUnits(slot);
                Double price = totalPrice / dayNumber / roomNumber;
                price = Math.ceil(AjustPrice.increaseEBookingNetPrice(priceRatio, price));
                Double sumPrice = price * dayNumber * roomNumber;
                roomRate.setRatePlanCode(planIdStr);
                roomRate.setRoomTypeCode(roomIdStr);
                roomRate.setRatePlanCategory(501);
                OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate rate = new OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate();
                OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base base = new OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base();
                OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes taxes = new OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes();
                OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax tax = new OTAHotelAvailRS.RoomStays.RoomStay.RoomRates.RoomRate.Rates.Rate.Base.Taxes.Tax();
                rates.setRate(rate);
                rate.setBase(base);
                base.setTaxes(taxes);
                taxes.setTax(tax);
                taxes.setCurrencyCode("USD");
                tax.setType("Inclusive");
                tax.setCurrencyCode("USD");
                tax.setCode(3);
                rate.setEffectiveDate(checkInStr);
                rate.setExpireDate(checkOutStr);
                base.setAmountBeforeTax(AjustPrice.getBeforeTaxPrice(price));
                base.setAmountAfterTax(price);
                base.setCurrencyCode("USD");
                total.setAmountAfterTax(sumPrice);
                total.setAmountBeforeTax(AjustPrice.getBeforeTaxPrice(sumPrice));
                total.setCurrencyCode("USD");
                //TODO Resort Fee

                ratePlan.setRatePlanCode(planIdStr);
                OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties cancelPenalties = new OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties();
                OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty cancelPenalty = new OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty();
                OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.AmountPercent amountPercent = new OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.AmountPercent();
                OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.Deadline deadline = new OTAHotelAvailRS.RoomStays.RoomStay.RatePlans.RatePlan.CancelPenalties.CancelPenalty.Deadline();
                cancelPenalties.setCancelPenalty(cancelPenalty);
                cancelPenalty.setDeadline(deadline);
                cancelPenalty.setAmountPercent(amountPercent);
                ratePlan.setCancelPenalties(cancelPenalties);

                amountPercent.setPercent(100);
                amountPercent.setTaxInclusive("true");
                if (cancelStatus == 0) {
                    deadline.setOffsetTimeUnit("Day");
                    deadline.setOffsetUnitMultiplier(999);
                    deadline.setOffsetDropTime("BeforeArrival");
                } else {
                    deadline.setOffsetTimeUnit("Day");
                    deadline.setOffsetUnitMultiplier(cancelDay);
                    deadline.setOffsetDropTime("BeforeArrival");
                }

                base.setAmountAfterTax(price);
                base.setAmountBeforeTax(AjustPrice.getBeforeTaxPrice(price));
                rate.setBase(base);
                roomstays.getRoomStay().add(roomStay);
                ratPlans.setRatePlan(ratePlan);
            }
        }
        if (roomstays.getRoomStay().size() == 0) {
            throw new CtripException("OTA_HotelAvailRS", reqData.getEchoToken(), "1", "322", "No availability");
        }
        return resp;
    }

    public String createReservation(OTAHotelResRQ otaHotelResRQ, List<BookRequest.DataBean.RoomsBean.PaxesBean> paxesBeans) throws Exception {
        return saveDataToRedis(otaHotelResRQ, paxesBeans);
    }

    public List<BookRequest.DataBean.RoomsBean.PaxesBean> getAllPaxes(OTAHotelResRQ otaHotelResRQ) {
        List<BookRequest.DataBean.RoomsBean.PaxesBean> paxesBeans = new ArrayList<BookRequest.DataBean.RoomsBean.PaxesBean>();
        List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName> personNames =
                otaHotelResRQ.getHotelReservations().getHotelReservation().getResGuests().getResGuest().getProfiles().getProfileInfo().getProfile().getCustomer().getPersonName();
        for (OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName personName : personNames) {
            BookRequest.DataBean.RoomsBean.PaxesBean paxesBean = new BookRequest.DataBean.RoomsBean.PaxesBean();
            if (personName.getAgeQualifyingCode() == null || personName.getAgeQualifyingCode() >= 10) {
                paxesBean.setType("AD");
            } else {
                paxesBean.setType("CH");
            }
            paxesBean.setName(personName.getGivenName() + (personName.getMiddleName() == null ? "" : personName.getMiddleName()));
            paxesBean.setSurname(personName.getSurname());
            paxesBeans.add(paxesBean);
        }
        return paxesBeans;
    }

    public String invokeCheckRoomApi(OTAHotelResRQ otaHotelResRQ, String roomReference, List<BookRequest.DataBean.RoomsBean.PaxesBean> paxesBeans) {
        BookRequest bookRequest = new BookRequest();
        BookRequest.AuthBean authBean = new BookRequest.AuthBean();
        authBean.setUsername(UsiTripConstant.CTRIPBOOKUSERNAME);
        authBean.setPassword(UsiTripConstant.CTRIPBOOKPWD);
        bookRequest.setAuth(authBean);

        BookRequest.DataBean dataBean = new BookRequest.DataBean();
        dataBean.setIpAddress(UsiTripConstant.BOOKIP);
        dataBean.setClientReference(UsiTripConstant.BOOKCLIENTREF);

        List<BookRequest.DataBean.RoomsBean> rooms = new ArrayList<BookRequest.DataBean.RoomsBean>();

       /* List<BookRequest.DataBean.RoomsBean.PaxesBean> paxesBeans = new ArrayList<BookRequest.DataBean.RoomsBean.PaxesBean>();
        List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName> personNames =
                otaHotelResRQ.getHotelReservations().getHotelReservation().getResGuests().getResGuest().getProfiles().getProfileInfo().getProfile().getCustomer().getPersonName();
        for (OTAHotelResRQ.HotelReservations.HotelReservation.ResGuests.ResGuest.Profiles.ProfileInfo.Profile.Customer.PersonName personName : personNames) {
            BookRequest.DataBean.RoomsBean.PaxesBean paxesBean = new BookRequest.DataBean.RoomsBean.PaxesBean();
            if (personName.getAgeQualifyingCode() == null || personName.getAgeQualifyingCode() >= 10) {
                paxesBean.setType("AD");
            } else {
                paxesBean.setType("CH");
            }
            paxesBean.setName(personName.getGivenName() + (personName.getMiddleName() == null ? "" : personName.getMiddleName()));
            paxesBean.setSurname(personName.getSurname());
            paxesBeans.add(paxesBean);
        }*/

        Integer roomNumber = (int) otaHotelResRQ.getHotelReservations().getHotelReservation()
                .getRoomStays().getRoomStay().getRoomRates().getRoomRate().getNumberOfUnits();

        //TODO
        //modify the paxes

        if (paxesBeans.size() < roomNumber) {
            Utility.error(logger, "The quantity of paxes is less than rooms.");
        }

        for (Integer i = 0; i < roomNumber; i++) {
            BookRequest.DataBean.RoomsBean roomsBean = new BookRequest.DataBean.RoomsBean();
            roomsBean.setRoomReference(roomReference);
//            roomsBean.setPaxes(paxesBeans);
            List<BookRequest.DataBean.RoomsBean.PaxesBean> pbs = new ArrayList<BookRequest.DataBean.RoomsBean.PaxesBean>();
            roomsBean.setPaxes(pbs);
            rooms.add(roomsBean);
        }

        for (int i = 0; i < paxesBeans.size(); i++) {
            BookRequest.DataBean.RoomsBean.PaxesBean pb = paxesBeans.get(i);
            rooms.get(i % roomNumber).getPaxes().add(pb);
        }

        for(int m=rooms.size();m>paxesBeans.size();m--){
            rooms.get(m-1).getPaxes().add(paxesBeans.get(0));
        }

        dataBean.setRooms(rooms);

        BookRequest.DataBean.BookerBean bookerBean = new BookRequest.DataBean.BookerBean();
        bookerBean.setFirstname(otaHotelResRQ.getHotelReservations().getHotelReservation().getResGuests().getResGuest().getProfiles().getProfileInfo()
                .getProfile().getCustomer().getContactPerson().getPersonName().getGivenName());
        bookerBean.setLastname(otaHotelResRQ.getHotelReservations().getHotelReservation().getResGuests().getResGuest().getProfiles().getProfileInfo()
                .getProfile().getCustomer().getContactPerson().getPersonName().getSurname());
        bookerBean.setEmail(otaHotelResRQ.getHotelReservations().getHotelReservation().getResGuests().getResGuest().getProfiles().getProfileInfo()
                .getProfile().getCustomer().getContactPerson().getEmail());
        bookerBean.setPhone(String.valueOf(otaHotelResRQ.getHotelReservations().getHotelReservation().getResGuests().getResGuest().getProfiles().getProfileInfo()
                .getProfile().getCustomer().getContactPerson().getTelephone().getPhoneNumber()).replace("-", ""));

        dataBean.setBooker(bookerBean);
        bookRequest.setData(dataBean);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String requestJsonMessage = gson.toJson(bookRequest);
        logger.info(requestJsonMessage);
        return PostBackend.sendJsonHttpPost02(UsiTripConstant.BACKENDURL + "/hotels/book", requestJsonMessage);
    }

    private String saveDataToRedis(OTAHotelResRQ otaHotelResRQ, List<BookRequest.DataBean.RoomsBean.PaxesBean> paxesBeans) throws Exception {
        BookInfo bookInfo = new BookInfo();
        Integer planId = Integer.parseInt(otaHotelResRQ.getHotelReservations()
                .getHotelReservation().getRoomStays().getRoomStay().getRatePlans()
                .getRatePlan().getRatePlanCode().substring(1));

        Map<String, Object> planMap = hotelService.selectPlanByPlanId(planId);
        int roomId = (int) planMap.get("room_type_id");
        int boardId = (int) planMap.get("breakfast_type_id");
        int bedTypeId = (int) planMap.get("bed_type_id");
        String roomType = (String) hotelService.selectTypeById(roomId).get("type_name");
        String boardType = (String) hotelService.selectTypeById(boardId).get("type_name");
        String bedType = (String) hotelService.selectTypeById(bedTypeId).get("type_name");

        Integer roomNumber = (int) otaHotelResRQ.getHotelReservations().getHotelReservation()
                .getRoomStays().getRoomStay().getRoomRates().getRoomRate().getNumberOfUnits();

        String checkInStr = otaHotelResRQ.getHotelReservations().getHotelReservation().getRoomStays().getRoomStay().getRoomRates()
                .getRoomRate().getRates().getRate().getEffectiveDate().toString();
        String checkOutStr = otaHotelResRQ.getHotelReservations().getHotelReservation().getRoomStays().getRoomStay().getRoomRates()
                .getRoomRate().getRates().getRate().getExpireDate().toString();
        int adultsQty = 0;
        int childrenQty = 0;

        List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.GuestCounts.GuestCount> guestCountList
                = otaHotelResRQ.getHotelReservations().getHotelReservation().getResGlobalInfo().getGuestCounts().getGuestCount();

        for (OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.GuestCounts.GuestCount guestCount : guestCountList) {
            if (guestCount.getAgeQualifyingGroup() == null) {
                adultsQty += guestCount.getCount();
            } else if (guestCount.getAgeQualifyingGroup() >= 10) {
                adultsQty += guestCount.getCount();
            } else {
                childrenQty += guestCount.getCount();
            }
        }

        String paxes = adultsQty + "AD" + childrenQty + "CH";

        String rateClass = "不可取消";

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(checkInStr);
        Long cin = date.getTime();
        Date date2 = format.parse(checkOutStr);
        Long cout = date2.getTime();
        int dayNumber = (int) Math.round((cout - cin) / (double) 86400000);
        DateTime dateTime = new DateTime(new Date().getTime());
        DateTime checkInTime = new DateTime(cin);
        int aheadOfCheckin = Days.daysBetween(dateTime, checkInTime).getDays();
        List<Map<String, Object>> rateList = hotelService.selectPlansByDate(planId, roomNumber, dayNumber, checkInStr, checkOutStr, aheadOfCheckin);
        int cancelStatus = rateList.get(0).get("cancellation_status") == null ? 0 : (Integer) rateList.get(0).get("cancellation_status");
        int cancelDay = rateList.get(0).get("cancellation_day") == null ? 30 : (Integer) rateList.get(0).get("cancellation_day");

        Long now = new Date(System.currentTimeMillis()).getTime();
        Long cancelTime = 0L;
        Long tmpCancelTime = 0L;
        long hours = 24 * cancelDay;

        BookInfo.CancellationPolicyBean cancellationPolicyBean = new BookInfo.CancellationPolicyBean();
        cancelTime = date.getTime() - (long) (1000 * 60 * 60 * (hours + 24 * 3));
        String cancellationDate = "";

        if (cancelStatus != 0 && now < cancelTime) {
            cancellationDate = DateUtil.dateFormater(new Date(cancelTime), UsiTripConstant.CANCELLATIONDATE_PATTERN) + "T00:00:00Z";
            rateClass = "可取消";
            cancellationPolicyBean.setAmount(0);
            cancellationPolicyBean.setEnd(cancellationDate);
        }

        Hotel hotel = hotelService.selectHotelByHotelId((Integer) planMap.get("hotelId"));

        Double priceRatio = 0.1;
        priceRatio = (hotel.getPriceRatio() == null) ? priceRatio : hotel.getPriceRatio();
        double totalPrice = 0;
        if (rateList.size() < dayNumber) {
            throw new RuntimeException("no enough rooms!");
        }
        int slot = Integer.MAX_VALUE;
        JSONArray availList = new JSONArray();
        for (int m = 0; m < rateList.size(); m++) {
            double conPrice = (Double) rateList.get(m).get("contract_price");
            double supPrice = rateList.get(m).get("supplement_price") == null ? 0 : (Double) rateList.get(m).get("supplement_price");
            int conNum = (Integer) rateList.get(m).get("contract_available_amount");
            int supNum = (Integer) rateList.get(m).get("supplement_available_amount");
            JSONObject avail = new JSONObject();
            JSONObject conObject = new JSONObject();
            JSONObject supObject = new JSONObject();
            avail.put("date", rateList.get(m).get("sale_date").toString());
            if (conNum + supNum < slot) slot = conNum + supNum;
            if (conNum < roomNumber) {
                totalPrice += conNum * conPrice;
                totalPrice += (roomNumber - conNum) * supPrice;
                conObject.put("price", conPrice);
                conObject.put("roomNumber", conNum);
                supObject.put("price", supPrice);
                supObject.put("roomNumber", roomNumber - conNum);
                avail.put("contract", conObject);
                avail.put("supplement", supObject);
            } else {
                totalPrice += roomNumber * conPrice;
                conObject.put("price", conPrice);
                conObject.put("roomNumber", roomNumber);
                avail.put("contract", conObject);
            }
            availList.put(avail);
        }

        Double price = totalPrice / dayNumber / roomNumber;
        price = Math.ceil(AjustPrice.increaseEBookingNetPrice(priceRatio, price));
        price = price * dayNumber * roomNumber;

        Double amountAfterTax = otaHotelResRQ.getHotelReservations().getHotelReservation().getResGlobalInfo().getTotal().getAmountAfterTax();
        if (amountAfterTax < price) {
            throw new RuntimeException("Amount after tax is inappropriate. Our price is " + price + " , the parameterized price is " + amountAfterTax + ".");
        }

        List<String> comments = new ArrayList<String>();
        String comment = otaHotelResRQ.getHotelReservations().getHotelReservation().getResGlobalInfo().getSpecialRequests().getSpecialRequest().getText().getValue();
        comments.add(comment);
        List<OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest.ListItem> listItem =
                otaHotelResRQ.getHotelReservations().getHotelReservation().getResGlobalInfo().getSpecialRequests().getSpecialRequest().getListItem();
        for (OTAHotelResRQ.HotelReservations.HotelReservation.ResGlobalInfo.SpecialRequests.SpecialRequest.ListItem item : listItem) {
            comments.add(item.getValue());
        }

        ArrayList<BookInfo.AvailabilityBean> availabilityBeans = new ArrayList<>();
        int length = availList.length();
        for (int i = 0; i < length; i++) {
            BookInfo.AvailabilityBean availabilityBean = new BookInfo.AvailabilityBean();
            JSONObject jsonObject = availList.getJSONObject(i);
            availabilityBean.setDate((String) jsonObject.get("date"));
            if (jsonObject.has("contract")) {
                BookInfo.AvailabilityBean.ContractBean contractBean = new BookInfo.AvailabilityBean.ContractBean();
                contractBean.setPrice((Double) jsonObject.getJSONObject("contract").get("price"));
                contractBean.setRoomNumber((Integer) jsonObject.getJSONObject("contract").get("roomNumber"));
                availabilityBean.setContract(contractBean);
            }
            if (jsonObject.has("supplement")) {
                BookInfo.AvailabilityBean.SupplementBean supplementBean = new BookInfo.AvailabilityBean.SupplementBean();
                supplementBean.setPrice((Double) jsonObject.getJSONObject("supplement").get("price"));
                supplementBean.setRoomNumber((Integer) jsonObject.getJSONObject("supplement").get("roomNumber"));
                availabilityBean.setSupplement(supplementBean);
            }
            availabilityBeans.add(availabilityBean);
        }



        bookInfo.setRoomTypeCode(roomId);
        bookInfo.setRoomNumber(roomNumber);
        bookInfo.setCheckInStr(format.format(date));

        bookInfo.setBoardCode(String.valueOf(boardId));
        bookInfo.setRoomCode(roomId);
        bookInfo.setRatePlanCode(planId);

        bookInfo.setPaxes(paxes);
        bookInfo.setTotalTaxCurrency(otaHotelResRQ.getHotelReservations().getHotelReservation().getResGlobalInfo().getTotal().getCurrencyCode());
        bookInfo.setRateClass(rateClass);

        bookInfo.setDayNumber(dayNumber);
        bookInfo.setRoomType(roomType);
        bookInfo.setCancellationDate(cancellationDate);

        bookInfo.setCheckOutStr(format.format(date2));
        bookInfo.setRoomNo((Integer) planMap.get("room_type_id"));
        bookInfo.setChildrenQty(childrenQty);

        bookInfo.setChildAge(8);
        bookInfo.setTotalCurrency(otaHotelResRQ.getHotelReservations().getHotelReservation().getResGlobalInfo().getTotal().getCurrencyCode());
        bookInfo.setRoomReference("");

        bookInfo.setBedTypeCode(bedTypeId);
        bookInfo.setHotelName(hotel.getName());
        bookInfo.setCaculatedTotalPrice(price);

        bookInfo.setBoardName(boardType);
        bookInfo.setTotalAmount(totalPrice);
        bookInfo.setHotelPid(hotel.getHotelId());

        bookInfo.setTotalTaxAmount(0.0);
        bookInfo.setAdultsQty(adultsQty);
        if (rateClass.equalsIgnoreCase("可取消")) {
            bookInfo.setCancellationPolicy(cancellationPolicyBean);
        }

        bookInfo.setBedType(bedType);
        bookInfo.setPlanId(planId);
        bookInfo.setComments(comments);
        bookInfo.setAvailability(availabilityBeans);

//            redisTemplate.opsForValue().get(jsonData.getRooms().get(0).getRoomReference() + "EB")
//        String roomReference = "eb:" + UUID.randomUUID().toString().replace("-", "");
        StringBuilder sb = new StringBuilder();
        for (BookRequest.DataBean.RoomsBean.PaxesBean paxesBean : paxesBeans) {
            sb.append(paxesBean.getName() + paxesBean.getSurname() + paxesBean.getType());
        }
        bookInfo.setPaxNames(sb.toString());
        String roomReference = "eb:" + bookInfo.getKey();
        redisTemplate.opsForValue().set(roomReference + "EB", bookInfo, 10, TimeUnit.MINUTES);
        return roomReference;
    }

    public String parseResponse4ReservationCreation(OTAHotelResRQ otaHotelResRQ, String response, StringBuilder bookingIdSB) throws JAXBException {
        String ctripReservationNo = String.valueOf(otaHotelResRQ.getUniqueID().getID());

        JSONObject jsonObject = new JSONObject(response);

        JAXBContext jaxbContext = JAXBContext.newInstance(OTAHotelResRS.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        String responseSoapMessage = null;

        if (jsonObject.has("success") && jsonObject.get("success").toString().equalsIgnoreCase("true")) {
            //return success
            JSONObject dataObect = (JSONObject) jsonObject.get("data");
            String confirmationNo = String.valueOf(dataObect.get("bookingId"));
            Map<String, String> paramMap = new HashMap<String, String>();

            paramMap.put("ctripReservationNumber", ctripReservationNo);
            paramMap.put("orderReference", (String) dataObect.get("orderReference"));
            paramMap.put("hotelConfirmationNumber", confirmationNo);

            insertData2PorderCtrip(paramMap);
            responseSoapMessage = createSoapMessage4ReservationCreation(true, false, ctripReservationNo, confirmationNo, null);
            bookingIdSB.append(confirmationNo);
        } else {
            //return error
            if ("ER1414".equals(jsonObject.getString("errorId"))) {
                String errorMsg = jsonObject.getString("errorMessage");
                String orderId = "0";
                String[] errMsgArr = errorMsg.split(":");
                if (errMsgArr.length > 1) {
                    orderId = errMsgArr[1];
                }
                responseSoapMessage = createSoapMessage4ReservationCreation(true, true, ctripReservationNo, orderId, null);
            } else {
                String errorMessage = (String) jsonObject.get("errorMessage");
                Map<String, String> errorMap = new HashMap<String, String>();
                errorMap.put("code", "450");
                errorMap.put("type", "12");
                errorMap.put("shortText", "Unable to process the special request. Check the request data.");
                responseSoapMessage = createSoapMessage4ReservationCreation(false, false, ctripReservationNo, null, errorMap);
            }
        }

        return responseSoapMessage;
    }

    public String createSoapMessage4ReservationCreation(Boolean success, Boolean warning, String ctripReservationNo, String hotelConfirmationNo, Map<String, String> errorMap) {
        OTAHotelResRS otaHotelResRS = new OTAHotelResRS();
        otaHotelResRS.setVersion(2.5F);
        otaHotelResRS.setEchoToken(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));

        if (success) {
            OTAHotelResRS.HotelReservations hotelReservations = new OTAHotelResRS.HotelReservations();
            OTAHotelResRS.HotelReservations.HotelReservation hotelReservation = new OTAHotelResRS.HotelReservations.HotelReservation();
            otaHotelResRS.setSuccess("");
            if (warning) {
                OTAHotelResRS.Warnings warnings = new OTAHotelResRS.Warnings();
                OTAHotelResRS.Warnings.Warning warning1 = new OTAHotelResRS.Warnings.Warning();
                warning1.setType(3);
                warning1.setCode(127);
                warning1.setValue("This creation is already successfully processed");
                warnings.setWarning(warning1);

                otaHotelResRS.setWarnings(warnings);
            }
            hotelReservation.setResStatus("S");
            OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo resGlobalInfo =
                    new OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo();
            OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs hotelReservationIDs =
                    new OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs();


            OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID hotelReservationID01 =
                    new OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID();
            hotelReservationID01.setResIDValue(hotelConfirmationNo);
            hotelReservationID01.setResIDType("502");
            hotelReservationIDs.getHotelReservationID().add(hotelReservationID01);


            OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID hotelReservationID02 =
                    new OTAHotelResRS.HotelReservations.HotelReservation.ResGlobalInfo.HotelReservationIDs.HotelReservationID();
            hotelReservationID02.setResIDValue(ctripReservationNo);
            hotelReservationID02.setResIDType("501");
            hotelReservationIDs.getHotelReservationID().add(hotelReservationID02);


            resGlobalInfo.setHotelReservationIDs(hotelReservationIDs);
            hotelReservation.setResGlobalInfo(resGlobalInfo);
            hotelReservations.setHotelReservation(hotelReservation);
            otaHotelResRS.setHotelReservations(hotelReservations);
        } else {
            OTAHotelResRS.Errors errors = new OTAHotelResRS.Errors();
            OTAHotelResRS.Errors.Error error = new OTAHotelResRS.Errors.Error();
            error.setCode(Short.valueOf(errorMap.get("code")));
            error.setType(Short.valueOf(errorMap.get("type")));
            error.setShortText(errorMap.get("shortText"));
            errors.setError(error);

            otaHotelResRS.setErrors(errors);
        }

        JAXBContext jaxbContext = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            jaxbContext = JAXBContext.newInstance(OTAHotelResRS.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(otaHotelResRS, baos);
        } catch (JAXBException e) {
            logger.error(e.getMessage());
        }

        Properties templateProps = PropertyUtil.getTemplateProps();
        return templateProps.getProperty("soap_message_header") + "\n" + new String(baos.toByteArray()) + templateProps.getProperty("soap_message_footer");
    }

    public Porder selectOrderById(Integer id) {
        return porderDao.selectOrderById(id);
    }

    public Integer insertData2PorderCtrip(Map<String, String> paramMap) {
        return porderCtripDao.insertData2PorderCtrip(paramMap);
    }

    public Map<String, Object> selectPorderCtripByCtripReservationNo(String ctripReservationNo) {
        return porderCtripDao.selectPorderCtripByCtripReservationNo(ctripReservationNo);
    }

    public int updateStatusOfPorderCtrip(Map<String, Object> paramMap) {
        return porderCtripDao.updateStatusOfPorderCtrip(paramMap);
    }

    public Map<String, Object> selectPorderCtripByCtripReservationNoAllStatus(String ctripReservationNo) {
        return porderCtripDao.selectPorderCtripByCtripReservationNoAllStatus(ctripReservationNo);
    }
}

