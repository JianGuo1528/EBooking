package com.ustrip.delegate;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.ustrip.common.*;
import com.ustrip.dao.HotelDao;
import com.ustrip.dao.PorderCtripDao;
import com.ustrip.dao.PorderDao;
import com.ustrip.entity.*;
import com.ustrip.entity.AliHotelRoomsResponse.Hotel.RoomTypes;
import com.ustrip.entity.AliHotelRoomsResponse.Hotel.RoomTypes.RoomType;
import com.ustrip.entity.AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos;
import com.ustrip.entity.AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo;
import com.ustrip.entity.AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.Board;
import com.ustrip.entity.AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms;
import com.ustrip.entity.AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom;
import com.ustrip.entity.AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.ChildrenAges;
import com.ustrip.entity.AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom.DailyInfos;
import com.ustrip.service.EbookingService;
import com.ustrip.service.HotelService;
import com.ustrip.service.RoomService;
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

import java.io.Serializable;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
@Service
public class TaobaoServiceDelegate {
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

    private static Logger logger = LogManager.getLogger(TaobaoServiceDelegate.class.getName());

    @Autowired
    private HotelDao hotelDao;

    @Autowired
    private PorderDao porderDao;

    @Autowired
    private PorderCtripDao porderCtripDao;

    public OTAHotelAvailGetRS pullAvailability(OTAHotelAvailGetRQ reqData) throws Exception {
        TaobaoClient client = new DefaultTaobaoClient("", "", "");
        return null;
    }

    public List<String> saveRedisAndBook(String request) {
        List<String> rtv = new ArrayList<>();
        String response = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><CreateOrderResponse>"
                + "<ResponseTimestamp>" + System.currentTimeMillis() / 1000 + "</ResponseTimestamp>";
        String orderRef = "";
        String orderCReference = "";

        try {
            // 1. parse request and save cache.
            BookInfo bookInfo = new BookInfo();

            Map params = new VtoV().XmlToMap(request);
            Map BookRQ = (Map) params.get("CreateOrderRequest");
            Integer planId = Integer.parseInt(String.valueOf(BookRQ.get("RateCode")).replace(".0", ""));
            orderCReference = String.valueOf(BookRQ.get("TaoBaoOrderId")).replace(".0", "");

            //for idempotence according to the order No. of Fliggy
            boolean reOrder = false;
            Map<String, Object> aliparas = new HashMap<>();
            aliparas.put("id", "-1");
            aliparas.put("cref", orderCReference);
            List<Map<String, Object>> orders = porderDao.selectOrderForDealer(aliparas);
            Map<String, Object> order = null;//porderDao.selectOrderById(Integer.valueOf(orderId));
            if (orders.size() > 0) {
                order = orders.get(0);
                if ("CONFIRMED".equalsIgnoreCase(String.valueOf(order.get("status")))) {
                    response += "<Error><Code>DUPLICATE_CREATE</Code><Message>F-重复订单</Message></Error>";
                    reOrder = true;
                }
            }
            if (!reOrder) {
                //parse rooms and paxes
                int adultsQty = 0;
                int childrenQty = 0;// ali no value

                StringBuilder sb = new StringBuilder();
                List<Map<String, Object>> OrderRooms = new ArrayList<Map<String, Object>>();
                Map<String, Object> PaxNameRooms = (Map<String, Object>) BookRQ.get("PaxNameRooms");
                Object o = PaxNameRooms.get("PaxNameRoom");
                //            o=o.get("PaxNameRoom");
                if (o instanceof List) {
                    OrderRooms = (List<Map<String, Object>>) o;
                } else {
                    OrderRooms.add((Map<String, Object>) o);
                }

                List<BookRequest.DataBean.RoomsBean> rooms = new ArrayList<BookRequest.DataBean.RoomsBean>();
                Map<String, List<BookRequest.DataBean.RoomsBean.PaxesBean>> aliRooms = new HashMap();

                Map<String, Object> planMap = hotelService.selectPlanByPlanId(planId);
                int roomId = (int) planMap.get("room_type_id");
                int boardId = (int) planMap.get("breakfast_type_id");
                int bedTypeId = (int) planMap.get("bed_type_id");
                String roomType = (String) hotelService.selectTypeById(roomId).get("type_name");
                String boardType = (String) hotelService.selectTypeById(boardId).get("type_name");
                String bedType = (String) hotelService.selectTypeById(bedTypeId).get("type_name");

                Integer roomNumber = OrderRooms.size();

                String checkInStr = (String) BookRQ.get("CheckIn");
                String checkOutStr = (String) BookRQ.get("CheckOut");

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
                List<Map<String, Object>> rateList = hotelService.selectPlansByDate(planId, roomNumber, dayNumber, checkInStr,
                        checkOutStr, aheadOfCheckin);
                int cancelStatus = rateList.get(0).get("cancellation_status") == null ? 0
                        : (Integer) rateList.get(0).get("cancellation_status");
                int cancelDay = rateList.get(0).get("cancellation_day") == null ? 30
                        : (Integer) rateList.get(0).get("cancellation_day");

                Long now = new Date(System.currentTimeMillis()).getTime();
                Long cancelTime = 0L;
                Long tmpCancelTime = 0L;
                long hours = 24 * cancelDay;

                BookInfo.CancellationPolicyBean cancellationPolicyBean = new BookInfo.CancellationPolicyBean();
                cancelTime = date.getTime() - (long) (1000 * 60 * 60 * (hours + 24 * 3));
                String cancellationDate = "";

                if (cancelStatus != 0 && now < cancelTime) {
                    cancellationDate = DateUtil.dateFormater(new Date(cancelTime), UsiTripConstant.CANCELLATIONDATE_PATTERN)
                            + "T00:00:00Z";
                    rateClass = "可取消";
                    cancellationPolicyBean.setAmount(0);
                    cancellationPolicyBean.setEnd(cancellationDate);
                }

                Hotel hotel = hotelService.selectHotelByHotelId((Integer) planMap.get("hotelId"));

                Double priceRatio = 0.05;
//                priceRatio = (hotel.getPriceRationToC() == null) ? priceRatio : hotel.getPriceRationToC();
                priceRatio = (hotel.getPriceRatio() == null) ? priceRatio : hotel.getPriceRatio();
//                double totalPrice = 0;
                if (rateList.size() < dayNumber) {
                    throw new RuntimeException("no enough rooms!");
                }
                int slot = Integer.MAX_VALUE;
                JSONArray availList = new JSONArray();
                for (int m = 0; m < rateList.size(); m++) {
                    double conPrice = (Double) rateList.get(m).get("contract_price");
                    double supPrice = (Double) rateList.get(m).get("supplement_price");
                    int conNum = (Integer) rateList.get(m).get("contract_available_amount");
                    int supNum = (Integer) rateList.get(m).get("supplement_available_amount");
                    JSONObject avail = new JSONObject();
                    JSONObject conObject = new JSONObject();
                    JSONObject supObject = new JSONObject();
                    avail.put("date", rateList.get(m).get("sale_date").toString());
                    if (conNum + supNum < slot)
                        slot = conNum + supNum;
                    if (conNum < roomNumber) {
//                        totalPrice += conNum * conPrice;
//                        totalPrice += (roomNumber - conNum) * supPrice;
                        conObject.put("price", conPrice);
                        conObject.put("roomNumber", conNum);
                        supObject.put("price", supPrice);
                        supObject.put("roomNumber", roomNumber - conNum);
                        avail.put("contract", conObject);
                        avail.put("supplement", supObject);
                    } else {
//                        totalPrice += roomNumber * conPrice;
                        conObject.put("price", conPrice);
                        conObject.put("roomNumber", roomNumber);
                        avail.put("contract", conObject);
                    }
                    availList.put(avail);
                }

                double totalPrice = 0.0;

                for (Map<String, Object> OrderGuest : OrderRooms) {
                    //            	Map<String, Object> PaxNameRoom = (Map<String, Object>)OrderGuest.get("PaxNameRoom");
                    //            	Map<String, Object> PaxNamesObj = (Map<String, Object>)PaxNameRoom.get("PaxNames");
                    String roomIndex = String.valueOf(OrderGuest.get("RoomIndex")).replace(".0", "");
                    List<Double> dailyList = EBUtil.calculatePrice4OneRoom(priceRatio, Integer.parseInt(roomIndex), rateList);
                    for (int i = 0; i < dailyList.size(); ++i) {
                        totalPrice += dailyList.get(i);
                    }

                    Map<String, Object> PaxNamesObj = (Map<String, Object>) OrderGuest.get("PaxNames");
                    Object PaxNames = PaxNamesObj.get("PaxName");
                    List<Map<String, Object>> PaxNamesList = new ArrayList<Map<String, Object>>();
                    if (PaxNames instanceof List) {
                        PaxNamesList = (List<Map<String, Object>>) PaxNames;
                    } else {
                        PaxNamesList.add((Map<String, Object>) PaxNames);
                    }

                    for (Map<String, Object> PaxName : PaxNamesList) {
                        sb.append((String) PaxName.get("Name") + (String) PaxName.get("Surname"));

                        String aliRoomPos = String.valueOf(OrderGuest.get("RoomIndex"));
                        List<BookRequest.DataBean.RoomsBean.PaxesBean> pbs = aliRooms.get(aliRoomPos);
                        if (null == pbs) {
                            pbs = new ArrayList<BookRequest.DataBean.RoomsBean.PaxesBean>();
                            aliRooms.put(aliRoomPos, pbs);
                        }
                        BookRequest.DataBean.RoomsBean.PaxesBean pb = new BookRequest.DataBean.RoomsBean.PaxesBean();
                        if ("Adults".equalsIgnoreCase((String) PaxName.get("Type"))) {
                            pb.setType("AD");
                            adultsQty += 1;
                        } else {
                            pb.setType("CH");
                            childrenQty += 1;
                        }
                        pb.setName((String) PaxName.get("Name"));
                        pb.setSurname((String) PaxName.get("Surname"));
                        pbs.add(pb);
                    }
                }


//                Double price = totalPrice / dayNumber / roomNumber;
//                price = Math.ceil(AjustPrice.increaseEBookingNetPrice(priceRatio, price));
//                price = price * dayNumber * roomNumber;
                Double price = totalPrice;

                Double amountAfterTax = Double.parseDouble(String.valueOf(BookRQ.get("TotalPrice")));// en not cent / 100;// （分）?
                DecimalFormat df = new DecimalFormat("#.##");
                amountAfterTax = Double.parseDouble(df.format(amountAfterTax));

                if (amountAfterTax < price) {
                    throw new RuntimeException("Amount after tax is inappropriate.");
                }

                List<String> comments = new ArrayList<String>();
                try {
                    comments.add(String.valueOf(BookRQ.get("Memo")));
                } catch (Exception err) {
                    err.printStackTrace();
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
                bookInfo.setTotalTaxCurrency((String) BookRQ.get("CurrencyCode"));
                bookInfo.setRateClass(rateClass);

                bookInfo.setDayNumber(dayNumber);
                bookInfo.setRoomType(roomType);
                bookInfo.setCancellationDate(cancellationDate);

                bookInfo.setCheckOutStr(format.format(date2));
                bookInfo.setRoomNo((Integer) planMap.get("room_type_id"));
                bookInfo.setChildrenQty(childrenQty);

                bookInfo.setChildAge(8);
                bookInfo.setTotalCurrency((String) BookRQ.get("CurrencyCode"));
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

                bookInfo.setPaxNames(sb.toString());
                String roomReference = "eb:" + bookInfo.getKey() + String.valueOf(BookRQ.get("TaoBaoOrderId")).replace(".0", "");
                redisTemplate.opsForValue().set(roomReference + "EB", bookInfo, 10, TimeUnit.MINUTES);
                // return roomReference;

                // 2. call holtel book api
                for (List<BookRequest.DataBean.RoomsBean.PaxesBean> pbs : aliRooms.values()) {
                    BookRequest.DataBean.RoomsBean roomsBean = new BookRequest.DataBean.RoomsBean();
                    roomsBean.setRoomReference(roomReference);
                    roomsBean.setPaxes(pbs);
                    rooms.add(roomsBean);
                }

                BookRequest bookRequest = new BookRequest();
                BookRequest.AuthBean authBean = new BookRequest.AuthBean();
                authBean.setUsername(UsiTripConstant.ALIBOOKUSERNAME);
                authBean.setPassword(UsiTripConstant.ALIBOOKPWD);
                bookRequest.setAuth(authBean);

                BookRequest.DataBean dataBean = new BookRequest.DataBean();
                dataBean.setIpAddress(UsiTripConstant.BOOKIP);
                dataBean.setClientReference(UsiTripConstant.BOOKCLIENTREFALI);

                dataBean.setRooms(rooms);

                BookRequest.DataBean.BookerBean bookerBean = new BookRequest.DataBean.BookerBean();
                bookerBean.setFirstname(String.valueOf(BookRQ.get("ContactName")));
                bookerBean.setLastname(String.valueOf(BookRQ.get("ContactSurname")));
                bookerBean.setEmail(String.valueOf(BookRQ.get("ContactEmail")));
                bookerBean.setPhone(String.valueOf(BookRQ.get("ContactPhone")));

                dataBean.setBooker(bookerBean);
                bookRequest.setData(dataBean);

                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String requestJsonMessage = gson.toJson(bookRequest);
                logger.info(requestJsonMessage);
                String bookApiResponse = PostBackend.sendJsonHttpPost02(UsiTripConstant.BACKENDURL + "/hotels/book",
                        requestJsonMessage);
                logger.info(bookApiResponse);
                // 3.parse book result
                JSONObject jsonObject = new JSONObject(bookApiResponse);
                if (jsonObject.has("success") && jsonObject.get("success").toString().equalsIgnoreCase("true")) {
                    // return success
                    JSONObject dataObect = (JSONObject) jsonObject.get("data");
                    try {
                        String confirmationNo = String.valueOf(dataObect.get("bookingId"));
                        orderRef = (String) dataObect.get("orderReference");
                        response += "<TaoBaoOrderId>" + orderCReference + "</TaoBaoOrderId>"
                                + "       <OrderId>"
                                + confirmationNo + "</OrderId>";
                        if (confirmationNo.length() > 0) {
                            logger.info("Email status: " + EBUtil.sendNewOrderEmail(confirmationNo.trim()));
                        }


                        porderDao.updateOrderCReference(orderRef, orderCReference);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Utility.error(logger, e.getMessage());
                    }
                } else {
                    // return error
                    if ("ER1414".equals(jsonObject.getString("errorId"))) {
                        String errorMsg = jsonObject.getString("errorMessage");
                        String orderId = "0";
                        String[] errMsgArr = errorMsg.split(":");
                        if (errMsgArr.length > 1) {
                            orderId = errMsgArr[1];
                        }
                        response += "<Error><Code>DUPLICATE_CREATE</Code><Message>F-重复订单</Message></Error>";
                    } else {
                        response += "<Error><Code>SYSTEM_EXCEPTION</Code><Message>F-系统错误</Message></Error>";
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Utility.error(logger, e.getMessage());
        }
        response += "</CreateOrderResponse>";

        rtv.add(response);
        rtv.add(orderRef);
        return rtv;

    }

    public Map<String, String> cancel(String taoBaoOrderId, String orderId) {
        Map<String, String> rtv = new HashMap<>();
        String response = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><CancelOrderResponse>"
                + "<ResponseTimestamp>" + System.currentTimeMillis() / 1000 + "</ResponseTimestamp>";
        String orderRef = "";
        try {
            Map<String, Object> aliparas = new HashMap<>();
            aliparas.put("id", orderId);
            aliparas.put("cref", taoBaoOrderId);
            List<Map<String, Object>> orders = porderDao.selectOrderForDealer(aliparas);
            Map<String, Object> order = null;//porderDao.selectOrderById(Integer.valueOf(orderId));
            if (orders.size() > 0) {
                order = orders.get(0);
            }
            if (null == order) {
                response += "       <Message>不存在此订单</Message>"
                        + "       <ResultCode>-204</ResultCode>";
            } else {
                orderRef = String.valueOf(order.get("orderReference"));
                if ("CANCELLED".equalsIgnoreCase(String.valueOf(order.get("status")))) {
                    response += "       <Message>订单已取消</Message>"
                            + "       <ResultCode>-205</ResultCode>";
                } else {
                    List<PorderRoom> lroom = porderDao.selectPorderRoomsByOrderReference(orderRef);
                    if (null == lroom || lroom.size() < 1) {
                        response += "       <Message>退订政策不允许取消</Message>"
                                + "       <ResultCode>-206</ResultCode>";
                    } else {
                        String cancelStr = lroom.get(0).getCancelPolicies();
                        String cancelDateStr = new JSONObject(cancelStr).getString("end");
                        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
                        Date cancelDate = fmt.parse(cancelDateStr);

                        if (new Date().after(cancelDate) || new Date().equals(cancelDate)) {
                            response += "       <Message>退订政策不允许取消</Message>"
                                    + "       <ResultCode>-206</ResultCode>";
                        } else {
                            String cancelReq = "{"
                                    + "  \"auth\": {"
                                    + "    \"username\": \"" + UsiTripConstant.ALIBOOKUSERNAME + "\","
                                    + "    \"password\": \"" + UsiTripConstant.ALIBOOKPWD + "\""
                                    + "  },"
                                    + "  \"data\": {"
                                    + "    \"orderReference\": \"" + orderRef + "\""
                                    + "  }"
                                    + "}";
                            String cancelApiResponse = PostBackend.sendJsonHttpPost02(UsiTripConstant.BACKENDURL + "/hotels/cancel",
                                    cancelReq);
                            Map<String, Object> jsonMap = JSON.parseObject(cancelApiResponse, Map.class);

                            if (jsonMap.containsKey("success") && ("true".equals((String) jsonMap.get("success")) || (Boolean) jsonMap.get("success"))) {
                                response += "<ResponseTimestamp>" + System.currentTimeMillis() + "</ResponseTimestamp>";
                                response += "<OrderId>" + orderId + "</OrderId>"
                                        + "       <CancelFee>0.00</CancelFee>"
                                        + "       <CurrencyCode>" + String.valueOf(order.get("currencyCode")) + "</CurrencyCode>";
                                logger.info("Email status: " + EBUtil.sendCancelledOrderEmail(String.valueOf(order.get("id"))));
                            } else if (jsonMap.containsKey("errorId") && ("ER1310".equals((String) jsonMap.get("errorId")))) {
                                response += "       <Message>订单已取消</Message>"
                                        + "       <ResultCode>-205</ResultCode>";
                            } else {
                                response += "       <Message>取消失败</Message>"
                                        + "       <ResultCode>-200</ResultCode>";
                            }

                        }
                    }
                }

            }
        } catch (Exception e) {
            response += "       <Message>取消失败</Message>"
                    + "       <ResultCode>-200</ResultCode>";

            e.printStackTrace();
            Utility.error(logger, e.getMessage());
        }
        response += "</CancelOrderResponse>";
        rtv.put("response", response);
        rtv.put("orderReference", orderRef);
        return rtv;
    }

    public Map<String, String> queryOrder(Map QueryStatusRQ) {

        Map<String, String> rtv = new HashMap<>();
        String orderId = null;
        try {
            orderId = String.valueOf(QueryStatusRQ.get("OrderId"));
        } catch (Exception err) {
            err.printStackTrace();
        }
        String TaoBaoOrderId = "";
        boolean IncludeDetail = false;
        try {
            TaoBaoOrderId = String.valueOf(QueryStatusRQ.get("TaoBaoOrderId")).replace(".0", "");
        } catch (Exception err) {
            err.printStackTrace();
        }
        try {
            IncludeDetail = Boolean.parseBoolean(String.valueOf(QueryStatusRQ.get("IncludeDetail")));
        } catch (Exception err) {
            err.printStackTrace();
        }
        String response = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SearchOrderResponse>";
        response += "<ResponseTimestamp>" + System.currentTimeMillis() / 1000 + "</ResponseTimestamp>";
        String orderRef = "";

        try {
            Map<String, Object> aliparas = new HashMap<>();
            aliparas.put("id", orderId);
            aliparas.put("cref", TaoBaoOrderId);
            List<Map<String, Object>> orders = porderDao.selectOrderForDealer(aliparas);
            if (null == orders || orders.size() < 1) {
                response += "       <Message>不存在此订单</Message>"
                        + "       <ResultCode>-302</ResultCode>"
                        + "<OrderId>" + orderId + "</OrderId>";
            } else {
                Map<String, Object> order = orders.get(0);
                response += "	<TaoBaoOrderId>" + TaoBaoOrderId + "</TaoBaoOrderId>"
                        + "	<OrderId>" + String.valueOf(order.get("id")) + "</OrderId>"
                        + "	<OrderStatus>" + String.valueOf(order.get("status")) + "</OrderStatus>"
                        + "	<TotalPrice>" + String.valueOf(order.get("totalPrice")) + "</TotalPrice>"
                        + "	<CurrencyCode>" + String.valueOf(order.get("currencyCode")) + "</CurrencyCode>";
                if (IncludeDetail) {
                    response += "	<Hotel>"
                            + "		<Name>" + String.valueOf(order.get("hotelName_zh")) + "</Name>"
                            + "		<EnglishName>" + String.valueOf(order.get("hotelName")) + "</EnglishName>"
                            + "		<Address>" + String.valueOf(order.get("address")) + "</Address>"
                            + "		<CityCode>" + String.valueOf(order.get("desId")) + "</CityCode>"//todo
                            + "		<HotelCode>" + String.valueOf(order.get("hotelId")) + "</HotelCode>"//todo
                            + "		<CheckIn>" + String.valueOf(order.get("checkinDate")) + "</CheckIn>"
                            + "		<CheckOut>" + String.valueOf(order.get("checkoutDate")) + "</CheckOut>"
                            + "        <RoomTypes>"
                            + "            <RoomType>"
                            + "                <RoomTypeCode>VIP</RoomTypeCode>"
                            + "                <RoomTypeName>测试房型</RoomTypeName>"
                            + "                <RoomTypeEnglishName>test room</RoomTypeEnglishName>"
                            + "                <MaxRoomOccupancy>4</MaxRoomOccupancy>"
                            + "                <RateInfos>"
                            + "                    <RateInfo>"
                            + "                        <RateKey>VIP</RateKey>"
                            + "                        <RateCode>VIP</RateCode>"
                            + "                        <RateName>测试rate</RateName>"
                            + "                        <RateEnglishName>test rate</RateEnglishName>"
                            + "                        <Allotment>5</Allotment>"
                            + "                        <Refundable>true</Refundable>"
                            + "                        <Board>"
                            + "                            <BoardCode>American</BoardCode>"
                            + "                            <BoardCount>2</BoardCount>"
                            + "                        </Board>"
                            + "                        <PaymentType>1</PaymentType>"
                            + "                        <CurrencyCode>CNY</CurrencyCode>"
                            + "                        <TotalBasePrice>1260</TotalBasePrice>"
                            + "                        <TotalPrice>1234.34</TotalPrice>"
                            + "                        <TotalTaxAndFee>324.34</TotalTaxAndFee>"
                            + "                        <CancelPolicyInfos>"
                            + "                            <CancelPolicyInfo>"
                            + "                                <CancelTime>16:00:00</CancelTime>"
                            + "                                <StartWindowHours>0</StartWindowHours>"
                            + "                                <NightCount>1</NightCount>"
                            + "                                <TimeZone>-08:00</TimeZone>"
                            + "                                <CurrencyCode>CNY</CurrencyCode>"
                            + "                            </CancelPolicyInfo>"
                            + "                            <CancelPolicyInfo>"
                            + "                                <CancelTime>16:00:00</CancelTime>"
                            + "                                <StartWindowHours>48</StartWindowHours>"
                            + "                                <NightCount>0</NightCount>"
                            + "                                <TimeZone>-08:00</TimeZone>"
                            + "                                <CurrencyCode>CNY</CurrencyCode>"
                            + "                            </CancelPolicyInfo>"
                            + "                            <CancelPolicyInfo>"
                            + "                                <CancelTime>16:00:00</CancelTime>"
                            + "                                <StartWindowHours>72</StartWindowHours>"
                            + "                                <Amount>1000</Amount>"
                            + "                                <TimeZone>-08:00</TimeZone>"
                            + "                                <CurrencyCode>CNY</CurrencyCode>"
                            + "                            </CancelPolicyInfo>"
                            + "                        </CancelPolicyInfos>"
                            + "                        <HotelFees>"
                            + "                            <HotelFee>"
                            + "                                <Type>MandatoryFee</Type>"
                            + "                                <Amount>345</Amount>"
                            + "                            </HotelFee>"
                            + "                            <CurrencyCode>CNY</CurrencyCode>"
                            + "                        </HotelFees>"
                            + "                        <RateComments>"
                            + "                            <RateComment>drop the key at the gate</RateComment>"
                            + "                            <RateComment>dinner can not be served</RateComment>"
                            + "                        </RateComments>"
                            + "                        <PaxPriceRooms>"
                            + "                            <PaxPriceRoom>"
                            + "                                <RoomIndex>1</RoomIndex>"
                            + "                                <Adults>2</Adults>"
                            + "                                <Children>2</Children>"
                            + "                                <ChildrenAges>"
                            + "                                    <Age>10</Age>"
                            + "                                    <Age>10</Age>"
                            + "                                </ChildrenAges>"
                            + "                                <DailyInfos>"
                            + "                                    <DailyInfo>"
                            + "                                        <Day>2016-12-24</Day>"
                            + "                                        <Price>17800</Price>"
                            + "                                        <BasePrice>17000</BasePrice>"
                            + "                                        <TaxAndFee>2345</TaxAndFee>"
                            + "                                        <CurrencyCode>CNY</CurrencyCode>"
                            + "                                    </DailyInfo>"
                            + "                                    <DailyInfo>"
                            + "                                        <Day>2016-12-25</Day>"
                            + "                                        <Price>46050</Price>"
                            + "                                        <BasePrice>46000</BasePrice>"
                            + "                                        <TaxAndFee>2345</TaxAndFee>"
                            + "                                        <CurrencyCode>CNY</CurrencyCode>"
                            + "                                    </DailyInfo>"
                            + "                                </DailyInfos>"
                            + "                            </PaxPriceRoom>"
                            + "                            <PaxPriceRoom>"
                            + "                                <RoomIndex>2</RoomIndex>"
                            + "                                <Adults>2</Adults>"
                            + "                                <Children>0</Children>"
                            + "                                <DailyInfos>"
                            + "                                    <DailyInfo>"
                            + "                                        <Day>2016-12-24</Day>"
                            + "                                        <Price>17800</Price>"
                            + "                                        <BasePrice>17000</BasePrice>"
                            + "                                        <TaxAndFee>2345</TaxAndFee>"
                            + "                                        <CurrencyCode>CNY</CurrencyCode>"
                            + "                                    </DailyInfo>"
                            + "                                    <DailyInfo>"
                            + "                                        <Day>2016-12-25</Day>"
                            + "                                        <Price>46050</Price>"
                            + "                                        <BasePrice>46000</BasePrice>"
                            + "                                        <TaxAndFee>2345</TaxAndFee>"
                            + "                                        <CurrencyCode>CNY</CurrencyCode>"
                            + "                                    </DailyInfo>"
                            + "                                </DailyInfos>"
                            + "                            </PaxPriceRoom>"
                            + "                        </PaxPriceRooms>"
                            + "                    </RateInfo>"
                            + "                </RateInfos>"
                            + "            </RoomType>"
                            + "        </RoomTypes>"
                            + "	</Hotel>";
                }
            }
        } catch (Exception e) {
            response += "       <Message>查询失败</Message>"
                    + "       <ResultCode>-301</ResultCode>"
                    + "<OrderId>" + orderId + "</OrderId>";

            e.printStackTrace();
            Utility.error(logger, e.getMessage());
        }
        response += "</SearchOrderResponse>";
        rtv.put("response", response);
        rtv.put("orderReference", orderRef);
        return rtv;
    }

    @Autowired
    private RoomService roomService;

    public String checkRoom(AliValidateRQ aliValidateRQ, StringBuilder sb) throws Exception {
        try {
            String planCode = aliValidateRQ.getRatePlanCode();
            Integer planId = Integer.valueOf(planCode);
            Integer roomNumber = Integer.valueOf(aliValidateRQ.getRoomNum());

            String checkInStr = aliValidateRQ.getCheckIn();
            String checkOutStr = aliValidateRQ.getCheckOut();

            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(checkInStr);
            Long cin = date.getTime();
            Date date2 = format.parse(checkOutStr);
            Long cout = date2.getTime();
            int dayNumber = (int) Math.round((cout - cin) / (double) 86400000);
            DateTime dateTime = new DateTime(new Date().getTime());
            DateTime checkInTime = new DateTime(cin);
            int aheadOfCheckin = Days.daysBetween(dateTime, checkInTime).getDays();
            if (cout <= cin || aheadOfCheckin <= 0) {
                throw new RuntimeException("入住时间或者离店日期不符合逻辑");
            }

            List<Map<String, Object>> rateList = hotelService.selectPlansByDate(planId, roomNumber, dayNumber, checkInStr,
                    checkOutStr, aheadOfCheckin);
            List<Map<String, Object>> planDetails = roomService.selectPlanDetailsByDate(planCode, checkInStr, checkOutStr);
            Gson gson = new GsonBuilder().create();
            sb.append(planDetails.size() == 0 ? "" : gson.toJson(planDetails));

            if (rateList.size() < dayNumber) {
                return "房量不足";
            } else {
                return "处理成功";
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }

    public AliHotelListResponse hotelList(AliHotelListRequest aliHotelListRequest) throws Exception {
        AliHotelListRequest.HotelCodes requestHotelCodes = aliHotelListRequest.getHotelCodes();
        List<String> hotelCodes = requestHotelCodes == null ? null : requestHotelCodes.getHotelCode();
        if (hotelCodes == null || hotelCodes.size() == 0) {
            hotelCodes = hotelService.selectHotelByCityCode(aliHotelListRequest.getCityCode());
        }
        List<AliHotelListRequest.PaxRooms.PaxRoom> paxRoom = aliHotelListRequest.getPaxRooms().getPaxRoom();
        int max = Integer.MIN_VALUE;
        for (AliHotelListRequest.PaxRooms.PaxRoom room : paxRoom) {
            max = Math.max(max, Integer.parseInt(room.getAdults()));
        }

        int roomNumber = paxRoom.size();
        String checkInStr = aliHotelListRequest.getCheckIn();
        String checkOutStr = aliHotelListRequest.getCheckOut();
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format1.parse(checkInStr);
        Long cin = date.getTime();
        Date date2 = format1.parse(checkOutStr);
        Long cout = date2.getTime();
        Long dayNumber = Math.round((cout - cin) / (double) 86400000);
        DateTime dateTime = new DateTime(new Date().getTime());
        DateTime checkInTime = new DateTime(cin);
        int aheadOfCheckin = Days.daysBetween(dateTime, checkInTime).getDays();
        if (cout <= cin || aheadOfCheckin <= 0) {
            throw new RuntimeException("入住时间或者离店日期不符合逻辑");
        }

        List<Hotel> hotelsWithPlans = hotelService.selectHotelsWithPlansByHotelIds(max, hotelCodes, null);
        AliHotelListResponse aliHotelListResponse = new AliHotelListResponse();
        aliHotelListResponse.setResponseTimestamp(String.valueOf(System.currentTimeMillis() / 1000));
        AliHotelListResponse.Hotels hotels = new AliHotelListResponse.Hotels();
        List<AliHotelListResponse.Hotels.Hotel> hotelList = hotels.getHotel();
        aliHotelListResponse.setHotels(hotels);

        for (Hotel h : hotelsWithPlans) {
            Set<Plan> plans = h.getPlan();
            double lowestPrice = Integer.MAX_VALUE;
            double lowestTax = Integer.MAX_VALUE;
            for (Plan plan : plans) {
                Integer planId = plan.getPlanId();
                List<Map<String, Object>> rateList = hotelService.selectPlansByDate(planId, roomNumber, dayNumber.intValue(), checkInStr, checkOutStr, aheadOfCheckin);
                if (rateList.size() < dayNumber)
                    continue;
                double totalPrice = 0.0;
                double totalTax = 0.0;

                for (int i = 1; i <= roomNumber; i++) {
                    List<Double> dailyList = EBUtil.calculatePrice4OneRoom(h.getPriceRatio(), i, rateList);
                    for (int j = 0; j < dailyList.size(); ++j) {
                        double dailyPrice = dailyList.get(j);
                        double dailyTax = AjustPrice.getTax(dailyPrice);

                        totalPrice += dailyPrice;
                        totalTax += dailyTax;
                    }
                }
                lowestPrice = Math.min(lowestPrice, totalPrice);
                lowestTax = Math.min(lowestTax, totalTax);
            }
            if (lowestPrice == Integer.MAX_VALUE) {
                continue;
            }
            AliHotelListResponse.Hotels.Hotel hotel = new AliHotelListResponse.Hotels.Hotel();
            hotel.setName(h.getName_zh());
            hotel.setEnglishName(h.getName());
            hotel.setAddress(h.getAddress());
            hotel.setCityCode(aliHotelListRequest.getCityCode());
            hotel.setHotelCode(String.valueOf(h.getHotelId()));
            hotel.setCheckIn(checkInStr);
            hotel.setCheckOut(checkOutStr);
            hotel.setPaymentType("1");
            hotel.setMinPrice(String.format("%.2f", lowestPrice));
            hotel.setMinTaxPrice(String.format("%.2f", lowestTax));
            hotel.setCurrencyCode(h.getCurrency());

            hotelList.add(hotel);
        }
        return aliHotelListResponse;
    }

    public AliHotelRoomsResponse hotelRooms(AliHotelRoomsRequest aliHotelRoomsRequest, String roomTypeId, String ratePlanId) throws Exception {
        String hotelCode = aliHotelRoomsRequest.getHotelCode();
        List<AliHotelRoomsRequest.PaxRooms.PaxRoom> paxRoom = aliHotelRoomsRequest.getPaxRooms().getPaxRoom();

        int max = Integer.MIN_VALUE;
        for (AliHotelRoomsRequest.PaxRooms.PaxRoom room : paxRoom) {
            max = Math.max(max, Integer.parseInt(room.getAdults()));
        }

        int roomNumber = paxRoom.size();
        String checkInStr = aliHotelRoomsRequest.getCheckIn();
        String checkOutStr = aliHotelRoomsRequest.getCheckOut();

        String rateClass = "不可取消";

        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format1.parse(checkInStr);
        Long cin = date.getTime();
        Date date2 = format1.parse(checkOutStr);
        Long cout = date2.getTime();
        Long dayNumber = Math.round((cout - cin) / (double) 86400000);
        DateTime dateTime = new DateTime(new Date().getTime());
        DateTime checkInTime = new DateTime(cin);
        int aheadOfCheckin = Days.daysBetween(dateTime, checkInTime).getDays();
        if (cout <= cin || aheadOfCheckin <= 0) {
            throw new RuntimeException("入住时间或者离店日期不符合逻辑");
        }
        List<String> hotelCodes = new ArrayList<String>();
        hotelCodes.add(hotelCode);
        List<Hotel> hotelsWithPlans = hotelService.selectHotelsWithPlansByHotelIds(max, hotelCodes, ratePlanId);
        AliHotelRoomsResponse aliHotelRoomsResponse = new AliHotelRoomsResponse();
        aliHotelRoomsResponse.setResponseTimestamp(String.valueOf(System.currentTimeMillis() / 1000));
        AliHotelRoomsResponse.Hotel hotel = new AliHotelRoomsResponse.Hotel();

        for (Hotel h : hotelsWithPlans) {
            Set<Plan> plans = h.getPlan();
            double lowestPrice = Integer.MAX_VALUE;
            double lowestTax = Integer.MAX_VALUE;

            // query list of room type
            List<Map<String, Object>> roomTypeMapList = hotelService.queryRoomTypeList(hotelCode, roomTypeId);
            hotel.setRoomTypes(new RoomTypes());
            List<RoomType> roomTypeList = hotel.getRoomTypes().getRoomType();

            for (Map<String, Object> map : roomTypeMapList) {
                RoomType roomType = new AliHotelRoomsResponse.Hotel.RoomTypes.RoomType();
                roomType.setRoomTypeCode(map.get("roomTypeCode") + "");
                roomType.setRoomTypeName(map.get("roomTypeName") + "");
                roomType.setRoomTypeEnglishName(map.get("roomTypeEnglishName") + "");
                roomType.setMaxRoomOccupancy(map.get("maxRoomOccupancy") + "");
                roomType.setRateInfos(new RateInfos());
                roomTypeList.add(roomType);

                List<RateInfo> rateInfoList = roomType.getRateInfos().getRateInfo();

                for (Plan plan : plans) {
                    int lowestAllotment = Integer.MAX_VALUE;
                    Integer planId = plan.getPlanId();

                    Map<String, Object> rateNameMap = hotelService.queryRateName(planId);
                    //query by planId
                    RateInfo rateInfo = new AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo();
                    //TODO
                    rateInfo.setRateKey(UUID.randomUUID().toString().replace("-", ""));
                    rateInfo.setRateCode(planId + "");
                    rateInfo.setRateName(rateNameMap.get("RateName") + "");
                    rateInfo.setRateEnglishName(rateNameMap.get("RateEnglishName") + "");
                    rateInfo.setPaymentType("1");
                    rateInfo.setCurrencyCode("USD");
                    rateInfo.setMaxChildren("2");
                    rateInfo.setMaxOccupancy(rateNameMap.get("MaxOccupancy") + "");

                    Board board = new AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.Board();
                    board.setBoardCode("Breakfast");
                    board.setBoardCount("2");
                    rateInfo.setBoard(board);
                    rateInfo.setPaxPriceRooms(new PaxPriceRooms());

                    List<PaxPriceRoom> paxPriceRoomList = rateInfo.getPaxPriceRooms().getPaxPriceRoom();

                    List<Map<String, Object>> rateList = hotelService.selectPlansByDate(planId, roomNumber, dayNumber.intValue(), checkInStr, checkOutStr, aheadOfCheckin);
                    if (rateList.size() < dayNumber)
                        continue;

                    int cancelStatus = rateList.get(0).get("cancellation_status") == null ? 0 : (Integer) rateList.get(
                            0).get("cancellation_status");
                    int cancelDay = rateList.get(0).get("cancellation_day") == null ? 30 : (Integer) rateList.get(0)
                            .get("cancellation_day");

                    Long now = new Date(System.currentTimeMillis()).getTime();
                    Long tmpCancelTime = 0L;
                    long hours = 24 * cancelDay;
                    Long cancelTime = date.getTime() - (long) (1000 * 60 * 60 * (hours + 24 * 3));

                    //Refundablility
                    if (cancelStatus != 0 && now < cancelTime) {
                        rateInfo.setRefundable(String.valueOf(true));

                        //cancel policy
                        RateInfo.CancelPolicyInfos cancelPolicyInfos = new RateInfo.CancelPolicyInfos();
                        rateInfo.setCancelPolicyInfos(cancelPolicyInfos);
                        List<RateInfo.CancelPolicyInfos.CancelPolicyInfo> cancelPolicyInfoList = cancelPolicyInfos.getCancelPolicyInfo();
                        RateInfo.CancelPolicyInfos.CancelPolicyInfo cancelPolicyInfo = new RateInfo.CancelPolicyInfos.CancelPolicyInfo();
                        cancelPolicyInfo.setCancelTime("16:00");
                        cancelPolicyInfo.setStartWindowHours("0");
                        cancelPolicyInfo.setNightCount(String.valueOf(dayNumber.intValue()));
                        cancelPolicyInfo.setTimeZone("-08:00");
                        cancelPolicyInfo.setCurrencyCode(h.getCurrency());

                        cancelPolicyInfoList.add(cancelPolicyInfo);

                        RateInfo.CancelPolicyInfos.CancelPolicyInfo cancelPolicyInfo2 = new RateInfo.CancelPolicyInfos.CancelPolicyInfo();
                        cancelPolicyInfo2.setCancelTime("16:00");
                        cancelPolicyInfo2.setStartWindowHours(String.valueOf(cancelDay * 24));
                        cancelPolicyInfo2.setNightCount(String.valueOf(dayNumber.intValue()));
                        cancelPolicyInfo2.setTimeZone("-08:00");
                        cancelPolicyInfo2.setCurrencyCode(h.getCurrency());

                        cancelPolicyInfoList.add(cancelPolicyInfo2);
                    } else {
                        rateInfo.setRefundable(String.valueOf(false));
                    }

                    double totalPrice = 0.0;
                    double totalTax = 0.0;
                    //nfo based on the room index
                    for (AliHotelRoomsRequest.PaxRooms.PaxRoom room : paxRoom) {
                        //room info
                        PaxPriceRoom paxPriceRoom = new AliHotelRoomsResponse.Hotel.RoomTypes.RoomType.RateInfos.RateInfo.PaxPriceRooms.PaxPriceRoom();
                        String roomIndex = room.getRoomIndex();
                        paxPriceRoom.setRoomIndex(roomIndex);
                        paxPriceRoom.setAdults(room.getAdults());
                        paxPriceRoom.setChildren(room.getChildren());
                        paxPriceRoom.setChildrenAges(new ChildrenAges());
                        List<String> age = paxPriceRoom.getChildrenAges().getAge();
                        if (room.getChildrenAges() != null) {
                            age.addAll(room.getChildrenAges().getAge());
                        }
                        paxPriceRoom.setDailyInfos(new DailyInfos());
                        paxPriceRoomList.add(paxPriceRoom);

                        List<DailyInfos.DailyInfo> dailyInfoList = paxPriceRoom.getDailyInfos().getDailyInfo();
                        List<Double> dailyList = EBUtil.calculatePrice4OneRoom(h.getPriceRatio(), Integer.parseInt(roomIndex), rateList);
                        for (int i = 0; i < dailyList.size(); ++i) {
                            DailyInfos.DailyInfo dailyInfo = new DailyInfos.DailyInfo();
                            dailyInfo.setDay(String.valueOf(rateList.get(i).get("sale_date")));
                            double dailyPrice = dailyList.get(i);
                            dailyInfo.setPrice(String.valueOf(dailyPrice));
                            dailyInfo.setBasePrice(String.valueOf(dailyPrice));
                            double dailyTax = AjustPrice.getTax(dailyPrice);
                            dailyInfo.setTaxAndFee(String.valueOf(dailyTax));
                            dailyInfo.setCurrencyCode(h.getCurrency());

                            dailyInfoList.add(dailyInfo);

                            totalPrice += dailyPrice;
                            totalTax += dailyTax;
                            int conNum = (Integer) rateList.get(i).get("contract_available_amount");
                            int supNum = (Integer) rateList.get(i).get("supplement_available_amount");
                            lowestAllotment = Math.min(conNum + supNum, lowestAllotment);
                        }
                    }
                    //total price for the rate
                    rateInfo.setTotalBasePrice(String.format("%.2f", totalPrice));
                    rateInfo.setTotalPrice(String.format("%.2f", totalPrice));
                    rateInfo.setTotalTaxAndFee(String.format("%.2f", totalTax));

                    rateInfo.setAllotment(String.valueOf(lowestAllotment));
                    rateInfoList.add(rateInfo);

                    lowestPrice = Math.min(lowestPrice, totalPrice);
                    lowestTax = Math.min(lowestTax, totalTax);
                }
            }
            if (lowestPrice == Integer.MAX_VALUE) {
                continue;
            }
            hotel.setHotelCode(h.getHotelId() + "");
            hotel.setName(h.getName_zh());
            hotel.setEnglishName(h.getName());
            hotel.setAddress(h.getAddress());
            hotel.setCityCode(String.valueOf(h.getDesId()));
            hotel.setCheckIn(checkInStr);
            hotel.setCheckOut(checkOutStr);
            hotel.setMinPrice(String.format("%.2f", lowestPrice));
            hotel.setMinTaxPrice(String.format("%.2f", lowestTax));
            hotel.setPaymentType("1");
            hotel.setCurrencyCode(h.getCurrency());

            aliHotelRoomsResponse.setHotel(hotel);
        }

        return aliHotelRoomsResponse;
    }
}

