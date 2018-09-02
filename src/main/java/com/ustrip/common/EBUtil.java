package com.ustrip.common;

import com.google.gson.*;
import com.ustrip.dao.PorderDao;
import com.ustrip.delegate.ApplicationContextProvider;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.soap.*;
import java.io.*;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class EBUtil {
    private static Logger logger = LogManager.getLogger(EBUtil.class.getName());

    public static String md5(String username) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bys = md5.digest(username.getBytes());
            return (new BigInteger(1, bys)).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T jsonToBeanDateSerializer(String jsonStr, Class<T> cl, final String pattern) {
        Object obj = null;
        Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
                    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                        SimpleDateFormat format = new SimpleDateFormat(pattern);
                        String dateStr = json.getAsString();
                        try {
                            return format.parse(dateStr);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        return null;
                    }

                }
        ).setDateFormat(pattern).create();
        return (T) gson.fromJson(jsonStr, cl);
    }

    public static String convertRequestString2UTF8(String input) throws UnsupportedEncodingException {
        if (input.equals(new String(input.getBytes("ISO-8859-1"), "ISO-8859-1"))) {
            return new String(input.getBytes("ISO-8859-1"), StandardCharsets.UTF_8);
        }else if (input.equals(new String(input.getBytes("GBK"), "GBK"))){
            System.out.println(new String(input.getBytes("gbk"), "gbk"));
            return new String(input.getBytes("gbk"), "utf8");
        }else  if (input.equals(new String(input.getBytes("GB2312"), "GB2312"))) {
            return new String(input.getBytes("GB2312"), StandardCharsets.UTF_8);
        }else {
            return input;
        }
    }

    public static String sendNewOrderEmail(String orderId) {
        PorderDao porderDao = ApplicationContextProvider.getApplicationContext().getBean(PorderDao.class);
        List<Map<String, Object>> emailDataList = porderDao.selectEmailDataByOrderId(orderId);
        if (emailDataList != null && emailDataList.size() > 0) {
            Map<String, Object> emailDataMap = emailDataList.get(0);
            return EBUtil.sendEmail("mail/sendNewOrderEmail", String.valueOf(emailDataMap.get("toMail")), String.valueOf(emailDataMap.get("hotelName")),
                    String.valueOf(emailDataMap.get("orderId")), "", "");
        }
        return null;
    }

    public static String sendCancelledOrderEmail(String orderId) {
        PorderDao porderDao = ApplicationContextProvider.getApplicationContext().getBean(PorderDao.class);
        List<Map<String, Object>> emailDataList = porderDao.selectEmailDataByOrderId(orderId);
        if (emailDataList != null && emailDataList.size() > 0) {
            Map<String, Object> emailDataMap = emailDataList.get(0);
            return EBUtil.sendEmail("mail/sendCancelledEmail", String.valueOf(emailDataMap.get("toMail")),
                    String.valueOf(emailDataMap.get("hotelName")), String.valueOf(emailDataMap.get("orderId")),
                    String.valueOf(emailDataMap.get("checkin")), String.valueOf(emailDataMap.get("checkout")));
        }
        return null;
    }

    private static String sendEmail(String url, String toMail, String hotelName, String orderId, String checkin, String checkout) {
        JSONObject jsonObject = new JSONObject();
        JSONObject dataJsonObject = new JSONObject();
        dataJsonObject.put("toMail", toMail);
        dataJsonObject.put("hotelName", hotelName);
        dataJsonObject.put("orderId", orderId);
        dataJsonObject.put("checkin", checkin);
        dataJsonObject.put("checkout", checkout);
        jsonObject.put("data", dataJsonObject);

        return PostBackend.sendJsonHttpPost02(UsiTripConstant.EMAILRUL + url, jsonObject.toString());
    }

    public static List<Double> calculatePrice4OneRoom(double priceRatio, int roomIndex, List<Map<String, Object>> rateList) {
        List<Double> dailyList = new ArrayList<Double>();
        for (Map<String, Object> rate : rateList) {
            double conPrice = (Double) rate.get("contract_price");
            double supPrice = rate.get("supplement_price") == null ? 0 : (Double) rate.get("supplement_price");
            int conNum = (Integer) rate.get("contract_available_amount");
            int supNum = (Integer) rate.get("supplement_available_amount");

            double dailyPrice = 0.0;
            if (roomIndex <= conNum ) {
                dailyPrice = conPrice * (1 + priceRatio);
            }else {
                dailyPrice = supPrice * (1 + priceRatio);
            }
            BigDecimal bd = new BigDecimal(dailyPrice);
            BigDecimal newDailyPrice = bd.setScale(2, BigDecimal.ROUND_HALF_DOWN);
            dailyList.add(newDailyPrice.doubleValue());
        }
        return dailyList;
    }
}
