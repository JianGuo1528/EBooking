package com.ustrip.impl;

import com.google.gson.Gson;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.XhotelCityCoordinatesBatchDownloadRequest;
import com.taobao.api.request.XhotelCityCoordinatesBatchUploadRequest;
import com.taobao.api.request.XhotelUpdateRequest;
import com.taobao.api.response.XhotelCityCoordinatesBatchDownloadResponse;
import com.taobao.api.response.XhotelCityCoordinatesBatchUploadResponse;
import com.ustrip.common.CtripUtils;
import com.ustrip.common.UsiTripConstant;
import com.ustrip.dao.AliWorldCityDao;
import com.ustrip.dao.HotelDao;
import com.ustrip.entity.AliHotelRoomsResponse;
import com.ustrip.entity.AliPic;
import com.ustrip.entity.Hotel;
import com.ustrip.entity.OTAHotelDescriptiveContentNotifRQ;
import com.ustrip.entity.OTAHotelStatsNotifRQ;
import com.ustrip.service.HotelService;

import org.apache.ibatis.annotations.Param;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class HotelServiceImpl implements HotelService {
    private Logger logger = LogManager.getLogger(this.getClass().getName());

    @Autowired
    private HotelDao hotelDao;

    @Override
    public List<Hotel> selectHotelByProvider(String provider) {
        return hotelDao.selectHotelByProvide(provider);
    }

    @Override
    public Hotel selectHotelByHotelId(int hotelId) {
        return hotelDao.selectHotelByHotelId(hotelId);
    }

    @Override
    public void pushHotelContent2Ctrip(Hotel hotel, Properties templateProps) throws Exception {
        String soapMessage = templateProps.getProperty("static_hotel_soap_message");
        JAXBContext jaxbContext = JAXBContext.newInstance(OTAHotelDescriptiveContentNotifRQ.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        OTAHotelDescriptiveContentNotifRQ otaHotelDescriptiveContentNotifRQ = (OTAHotelDescriptiveContentNotifRQ) unmarshaller.unmarshal(new StringReader(soapMessage));

        setHotelData(otaHotelDescriptiveContentNotifRQ, hotel);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        marshaller.marshal(otaHotelDescriptiveContentNotifRQ, baos);
        String message = new String(baos.toByteArray());
        message = message.substring(message.indexOf("<OTA_HotelDescriptiveContentNotifRQ"));
        message = templateProps.getProperty("soap_message_header") + "\n" + message + templateProps.getProperty("soap_message_footer");

        logger.info(message);
        logger.info(CtripUtils.pushData2Ctrip(templateProps.getProperty("static_hotel_url"), message));
    }

    @Override
    public void retrieveStatusFromCtrip(Integer hotelId, Properties templateProps) throws Exception {
        String soapMessage = templateProps.getProperty("static_status_soap_message");
        JAXBContext jaxbContext = JAXBContext.newInstance(OTAHotelStatsNotifRQ.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        OTAHotelStatsNotifRQ oTAHotelStatsNotifRQ = (OTAHotelStatsNotifRQ) unmarshaller.unmarshal(new StringReader(soapMessage));

        setStatusData(oTAHotelStatsNotifRQ, hotelId);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        marshaller.marshal(oTAHotelStatsNotifRQ, baos);
        String message = new String(baos.toByteArray());
        message = message.substring(message.indexOf("<OTA_HotelStatsNotifRQ"));
        message = templateProps.getProperty("soap_message_header") + "\n" + message + templateProps.getProperty("soap_message_footer");

        logger.info(message);
        logger.info(CtripUtils.pushData2Ctrip(templateProps.getProperty("static_status_url"), message));
    }

    private void setStatusData(OTAHotelStatsNotifRQ oTAHotelStatsNotifRQ, Integer hotelId) throws DatatypeConfigurationException {
        oTAHotelStatsNotifRQ.setTimeStamp(DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date())));

        oTAHotelStatsNotifRQ.getPOS().getSource().getRequestorID().setID(UsiTripConstant.CTRIP_ID);
        oTAHotelStatsNotifRQ.getPOS().getSource().getRequestorID().setMessagePassword(UsiTripConstant.CTRIP_PASS);
        oTAHotelStatsNotifRQ.getPOS().getSource().getRequestorID().getCompanyName().setCode("C");
        oTAHotelStatsNotifRQ.getPOS().getSource().getRequestorID().getCompanyName().setCodeContext(UsiTripConstant.CTRIP_CONTEXT_CODE);

        oTAHotelStatsNotifRQ.getStatistics().getStatistic().setHotelCode(hotelId);
    }

    private void setHotelData(OTAHotelDescriptiveContentNotifRQ otaHotelDescriptiveContentNotifRQ, Hotel hotel) throws DatatypeConfigurationException {
        otaHotelDescriptiveContentNotifRQ.setTimeStamp(DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date())));

        otaHotelDescriptiveContentNotifRQ.getPOS().getSource().getRequestorID().setID(UsiTripConstant.CTRIP_ID);
        otaHotelDescriptiveContentNotifRQ.getPOS().getSource().getRequestorID().setMessagePassword(UsiTripConstant.CTRIP_PASS);
        otaHotelDescriptiveContentNotifRQ.getPOS().getSource().getRequestorID().getCompanyName().setCode("C");
        otaHotelDescriptiveContentNotifRQ.getPOS().getSource().getRequestorID().getCompanyName().setCodeContext(UsiTripConstant.CTRIP_CONTEXT_CODE);

        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().setHotelCode(hotel.getHotelId());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().setHotelCityCode(hotel.getDesId());

        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getHotelInfo()
                .getDescriptions().getMultimediaDescriptions().getMultimediaDescription().getTextItems().getTextItem()
                .get(0).setTitle(hotel.getName_zh() == null ? hotel.getName() : hotel.getName_zh());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getHotelInfo()
                .getDescriptions().getMultimediaDescriptions().getMultimediaDescription().getTextItems().getTextItem()
                .get(0).setDescription(hotel.getDescription_zh() == null ? (hotel.getDescription() == null ? "none" : hotel.getDescription()) : hotel.getDescription_zh());

        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getHotelInfo()
                .getDescriptions().getMultimediaDescriptions().getMultimediaDescription().getTextItems().getTextItem()
                .get(1).setTitle(hotel.getName() == null ? "none" : hotel.getName());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getHotelInfo()
                .getDescriptions().getMultimediaDescriptions().getMultimediaDescription().getTextItems().getTextItem()
                .get(1).setDescription(hotel.getDescription() == null ? "none" : hotel.getDescription());

        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getHotelInfo()
                .getPosition().setLatitude((float) hotel.getLatitude());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getHotelInfo()
                .getPosition().setLongitude((float) hotel.getLongitude());

        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getAffiliationInfo()
                .getAwards().getAward().setRating((byte) hotel.getRating());

        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getMultimediaDescriptions()
                .getMultimediaDescription().getImageItems().getImageItem().get(0).getImageFormat().setURL(hotel.getThumbnail() == null ? "none" : hotel.getThumbnail());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getMultimediaDescriptions()
                .getMultimediaDescription().getImageItems().getImageItem().get(1).getImageFormat().setURL(hotel.getAbstractImg() == null ? "none" : hotel.getAbstractImg());

        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getAddresses().getAddress().get(0).getCountryName().setCode(hotel.getCountry().getCountryCode());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getAddresses().getAddress().get(0).getCountryName().setValue(hotel.getCountry().getCountryNameZh());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getAddresses().getAddress().get(0).setCityName(hotel.getCity() == null ? "none" : hotel.getCity());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getAddresses().getAddress().get(0).setAddressLine(hotel.getAddress() == null ? "none" : hotel.getAddress());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getAddresses().getAddress().get(0).setPostalCode(Integer.parseInt(hotel.getZipcode() == null ? "0" : hotel.getZipcode()));

        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getAddresses().getAddress().get(1).getCountryName().setCode(hotel.getCountry().getCountryCode());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getAddresses().getAddress().get(1).getCountryName().setValue(hotel.getCountry().getCountryName());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getAddresses().getAddress().get(1).setCityName(hotel.getCity() == null ? "none" : hotel.getCity());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getAddresses().getAddress().get(1).setAddressLine(hotel.getAddress() == null ? "none" : hotel.getAddress());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getAddresses().getAddress().get(1).setPostalCode(Integer.parseInt(hotel.getZipcode() == null ? "0" : hotel.getZipcode()));

        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getPhones().getPhone().get(0).setPhoneNumber(hotel.getPhone() == null ? "none" : hotel.getPhone());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getPhones().getPhone().get(1).setPhoneNumber(hotel.getFax() == null ? "none" : hotel.getFax());
    }

    @Override
    public List<Map<String, Object>> selectPlansByHotelId(int max_person, List<Integer> hotelIds) {
        return hotelDao.selectPlansByHotelId(max_person, hotelIds);
    }

    @Override
    public List<Map<String, Object>> selectPlansByDate(int plan_id, int room_number, int day_number, String check_in, String check_out, int ahead_of_checkin) {
        return hotelDao.selectPlansByDate(plan_id, room_number, day_number, check_in, check_out, ahead_of_checkin);
    }

    @Override
    public List<HashMap<String, Object>> getHotelNameFromHotel(List<Integer> hotelIds, String provider) {
        return hotelDao.getHotelNameFromHotel(hotelIds, provider);
    }

    @Override
    public Map<String, Object> selectPlanByPlanId(Integer planId) {
        return hotelDao.selectPlanByPlanId(planId);
    }

    @Override
    public Map<String, Object> selectTypeById(Integer id) {
        return hotelDao.selectTypeById(id);
    }

    @Override
    public String pushHotelContent2Ali(TaobaoClient client, Hotel hotel) throws Exception {
        XhotelUpdateRequest req = new XhotelUpdateRequest();
        req.setAddress(hotel.getAddress());
        if (hotel.getCountryId() != 41) {
            //TODO
//            req.setCity(getCityIdFromAli(client, hotel));
            req.setCity(110100L);//default chinese city is beijing
        }else {
            req.setCity(110100L);//default chinese city is beijing
        }
        req.setName(hotel.getName_zh() == null ? hotel.getName() : hotel.getName_zh());
        req.setOuterId(String.valueOf(hotel.getHotelId()));
        StringBuilder sb = new StringBuilder(hotel.getCountry().getPhoneCode()).append("#");
        String phone = hotel.getPhone();
        String areaCode = phone.substring(phone.indexOf("(") + 1, phone.indexOf(")"));
        sb.append(areaCode).append("#");
        String phoneNum = phone.substring(phone.indexOf(")") + 1).trim().replace("-", "");
        sb.append(phoneNum);
        req.setTel(sb.toString());

        req.setDomestic(hotel.getCountryId() == 41 ? 0L : 1L);
        req.setCountry(hotel.getCountry().getCountryName());
        req.setDescription(hotel.getDescription());
        String latitude = String.valueOf(hotel.getLatitude());
        latitude = latitude.length() > 10 ? String.format("%.5f", hotel.getLatitude()) : latitude;
        req.setLatitude(latitude);
        String longitude = String.valueOf(hotel.getLongitude());
        longitude = longitude.length() > 10 ? String.format("%.5f", hotel.getLongitude()) : longitude;
        req.setLongitude(longitude);

        List<AliPic> list = new ArrayList<AliPic>();
        if (hotel.getThumbnail() != null && !hotel.getThumbnail().trim().isEmpty()) {
            AliPic mainPic = new AliPic();
            mainPic.setUrl(UsiTripConstant.PICURL + hotel.getThumbnail());
            mainPic.setIsmain("true");
            mainPic.setType("外观");
            mainPic.setAttribute("普通图");
            list.add(mainPic);
        }
        if (hotel.getAbstractImg() != null && !hotel.getAbstractImg().trim().isEmpty()) {
            AliPic otherPic = new AliPic();
            otherPic.setUrl(UsiTripConstant.PICURL + hotel.getAbstractImg());
            otherPic.setIsmain("false");
            otherPic.setType("其他");
            otherPic.setAttribute("普通图");
            list.add(otherPic);
        }

        if (list.size() > 0) {
            req.setPics(new Gson().toJson(list));
        }
        req.setNameE(hotel.getName());
        req.setPositionType("G");
        req.setPostalCode(hotel.getZipcode());
        req.setStar(String.valueOf(hotel.getRating()));
        req.setTimestamp(System.currentTimeMillis() / 1000);

        req.check();
        return client.execute(req,  UsiTripConstant.ALI_SESSION_KEY).getBody();
    }

    @Override
    public Long getCityIdFromAli(TaobaoClient client, Hotel hotel) throws Exception {
        String countryCode = String.valueOf(aliWorldCityDao.selectWorldCityByCountryName(hotel.getCountry().getCountryNameZh()).get("country_code"));
        String latitude = String.valueOf(hotel.getLatitude());
        String longitude = String.valueOf(hotel.getLongitude());
        int hotelID = hotel.getHotelId();

        List<Map<String, Object>> aliCity = aliWorldCityDao.selectAliCityByCondition(countryCode, latitude, longitude);
        if (aliCity != null && aliCity.size() > 0) {
            return Long.valueOf(String.valueOf(aliCity.get(0).get("ali_city_code")));
        }

        String response = pushCity2Ali(client, hotel, countryCode, latitude, longitude, hotelID);
        JSONObject jsonObject = new JSONObject(response);
        JSONObject responseJsonObject = (JSONObject) jsonObject.get("xhotel_city_coordinates_batch_upload_response");

        response = fetchCityFromAli(client, Long.valueOf(String.valueOf(responseJsonObject.get("batch_id"))));
        jsonObject = new JSONObject(response);

        String aliCityCode = String.valueOf(jsonObject.getJSONObject("xhotel_city_coordinates_batch_download_response").getJSONObject("coordinate_list")
                .getJSONArray("coordinate").getJSONObject(0).get("city"));

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("countryCode", countryCode);
        paramMap.put("latitude", latitude);
        paramMap.put("longitude", longitude);
        paramMap.put("hotelID", hotelID);
        paramMap.put("desId", hotel.getDesId());
        paramMap.put("cityCode", aliCityCode);
        aliWorldCityDao.insertData2AliCity(paramMap);

        return Long.valueOf(aliCityCode);
    }

    @Autowired
    private AliWorldCityDao aliWorldCityDao;

    private String pushCity2Ali(TaobaoClient client, Hotel hotel, String countryCode, String latitude, String longitude, int hotelID) throws Exception {
        XhotelCityCoordinatesBatchUploadRequest req = new XhotelCityCoordinatesBatchUploadRequest();
        List<XhotelCityCoordinatesBatchUploadRequest.Coordinate> list = new ArrayList<XhotelCityCoordinatesBatchUploadRequest.Coordinate>();
        XhotelCityCoordinatesBatchUploadRequest.Coordinate obj = new XhotelCityCoordinatesBatchUploadRequest.Coordinate();
        list.add(obj);
        obj.setCountry(Long.valueOf(countryCode));
        obj.setLatitude(latitude);
        obj.setLongitude(longitude);
        obj.setOuterId(String.valueOf(hotelID));
        req.setCoordinateList(list);
        XhotelCityCoordinatesBatchUploadResponse rsp = client.execute(req,  UsiTripConstant.ALI_SESSION_KEY);
        return rsp.getBody();
    }

    private String fetchCityFromAli(TaobaoClient client, Long batchId) throws Exception {
        XhotelCityCoordinatesBatchDownloadRequest req = new XhotelCityCoordinatesBatchDownloadRequest();
        req.setBatchId(batchId);
        XhotelCityCoordinatesBatchDownloadResponse rsp = client.execute(req, UsiTripConstant.ALI_SESSION_KEY);
        return rsp.getBody();
    }

    @Override
    public List<Hotel> selectHotelsWithPlansByHotelIds(int max_person, List<String> hotelIds,  String ratePlanId){
        return hotelDao.selectHotelsWithPlansByHotelIds(max_person, hotelIds, ratePlanId);
    }

	@Override
	public List<Map<String,Object>> queryRoomTypeList(String hotelCode, String roomTypeId) {
        return hotelDao.queryRoomTypeList(hotelCode, roomTypeId);
	}

	@Override
	public Map<String, Object> queryRateName(Integer planId) {
        return hotelDao.queryRateName(planId);
	}

	@Override
    public List<String> selectHotelByCityCode(String cityCode) {
        return aliWorldCityDao.selectHotelByCityCode(cityCode);
    }
 
}
