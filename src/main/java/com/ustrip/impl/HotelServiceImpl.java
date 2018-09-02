package com.ustrip.impl;

import com.ustrip.common.CtripUtils;
import com.ustrip.dao.HotelDao;
import com.ustrip.entity.Hotel;
import com.ustrip.entity.OTAHotelDescriptiveContentNotifRQ;
import com.ustrip.entity.OTAHotelStatsNotifRQ;
import com.ustrip.service.HotelService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        marshaller.marshal(otaHotelDescriptiveContentNotifRQ, baos);
        String message = new String(baos.toByteArray());
        message = message.substring(message.indexOf("<OTA_HotelDescriptiveContentNotifRQ"));
        message = templateProps.getProperty("static_hotel_soap_message_header") + "\n" + message + templateProps.getProperty("static_hotel_soap_message_footer");

        logger.info(message);
        CtripUtils.pushData2Ctrip(templateProps.getProperty("static_hotel_url"), message);
    }

    @Override
    public void retrieveStatusFromCtrip(Integer hotelId, Properties templateProps) throws Exception {
        String soapMessage = templateProps.getProperty("static_status_soap_message");
        JAXBContext jaxbContext = JAXBContext.newInstance(OTAHotelStatsNotifRQ.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        OTAHotelStatsNotifRQ oTAHotelStatsNotifRQ = (OTAHotelStatsNotifRQ) unmarshaller.unmarshal(new StringReader(soapMessage));

        setStatusData(oTAHotelStatsNotifRQ, hotelId);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        marshaller.marshal(oTAHotelStatsNotifRQ, baos);
        String message = new String(baos.toByteArray());
        message = message.substring(message.indexOf("<OTA_HotelStatsNotifRQ"));
        message = templateProps.getProperty("static_hotel_soap_message_header") + "\n" + message + templateProps.getProperty("static_hotel_soap_message_footer");

        logger.info(message);
        logger.info(CtripUtils.pushData2Ctrip(templateProps.getProperty("static_status_url"), message));
    }

    private void setStatusData(OTAHotelStatsNotifRQ oTAHotelStatsNotifRQ, Integer hotelId) throws DatatypeConfigurationException {
        oTAHotelStatsNotifRQ.setTimeStamp(DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date())));

        oTAHotelStatsNotifRQ.getPOS().getSource().getRequestorID().setID("jtbtest");
        oTAHotelStatsNotifRQ.getPOS().getSource().getRequestorID().setMessagePassword("jtbtest");
        oTAHotelStatsNotifRQ.getPOS().getSource().getRequestorID().getCompanyName().setCode("C");
        oTAHotelStatsNotifRQ.getPOS().getSource().getRequestorID().getCompanyName().setCodeContext((short) 10029);

        oTAHotelStatsNotifRQ.getStatistics().getStatistic().setHotelCode(hotelId);
    }

    private void setHotelData(OTAHotelDescriptiveContentNotifRQ otaHotelDescriptiveContentNotifRQ, Hotel hotel) throws DatatypeConfigurationException {
        otaHotelDescriptiveContentNotifRQ.setTimeStamp(DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date())));

        otaHotelDescriptiveContentNotifRQ.getPOS().getSource().getRequestorID().setID("jtbtest");
        otaHotelDescriptiveContentNotifRQ.getPOS().getSource().getRequestorID().setMessagePassword("jtbtest");
        otaHotelDescriptiveContentNotifRQ.getPOS().getSource().getRequestorID().getCompanyName().setCode("C");
        otaHotelDescriptiveContentNotifRQ.getPOS().getSource().getRequestorID().getCompanyName().setCodeContext((short) 10029);

        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().setHotelCode(hotel.getHotelId());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().setHotelCityCode(hotel.getDesId());

        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getHotelInfo()
                .getDescriptions().getMultimediaDescriptions().getMultimediaDescription().getTextItems().getTextItem()
                .get(0).setTitle(hotel.getName_zh() == null ? "none" : hotel.getName_zh());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getHotelInfo()
                .getDescriptions().getMultimediaDescriptions().getMultimediaDescription().getTextItems().getTextItem()
                .get(0).setDescription(hotel.getDescription_zh() == null ? "none" : hotel.getDescription_zh());

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
                .getPhones().getPhone().get(0).setPhoneNumber(hotel.getPhone() == null ? "0000" : hotel.getPhone());
        otaHotelDescriptiveContentNotifRQ.getHotelDescriptiveContents().getHotelDescriptiveContent().getContactInfos().getContactInfo()
                .getPhones().getPhone().get(1).setPhoneNumber(hotel.getFax() == null ? "0000" : hotel.getFax());
    }
	@Override
	public List<Map<String, Object>> selectPlansByHotelId(int max_person, List<Integer> hotelIds) {
		return hotelDao.selectPlansByHotelId(max_person, hotelIds);
	}

	@Override
	public List<Map<String, Object>> selectPlansByDate(int plan_id, int room_number, int day_number,String check_in,String check_out) {
		return hotelDao.selectPlansByDate(plan_id, room_number, day_number, check_in, check_out);
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
}
