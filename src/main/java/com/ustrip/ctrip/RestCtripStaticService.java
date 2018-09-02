package com.ustrip.ctrip;

import com.ustrip.common.ErrorCodeEnum;
import com.ustrip.common.MiniException;
import com.ustrip.common.PropertyUtil;
import com.ustrip.common.UsiTripConstant;
import com.ustrip.entity.Hotel;
import com.ustrip.service.HotelService;
import com.ustrip.service.RoomService;

import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.HttpClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Service
@Path("/ctrip")
public class RestCtripStaticService {
    private Logger logger = LogManager.getLogger(this.getClass().getName());
    @Autowired
    private HotelService hotelService;
    
   	@Autowired
   	private RoomService roomService;

    @POST
    @Path("/pushHotelContentByProvider")
    @Produces("application/json;charset=utf-8")
    public Response pushHotelContentByProvider(Map<String, Object> paramMap) {
        try {
            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
            String provider = String.valueOf(dataMap.get("provider"));
            List<Hotel> hotels = hotelService.selectHotelByProvider(provider);
            Properties templateProps = PropertyUtil.getTemplateProps();

            for (Hotel hotel : hotels) {
                hotelService.pushHotelContent2Ctrip(hotel, templateProps);
                Thread.sleep(500);
            }
            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("status", "success");
            return Response.status(Status.OK).entity(resultMap).build();
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }

    @POST
    @Path("/pushHotelContentByHotelId")
    @Produces("application/json;charset=utf-8")
    public Response pushHotelContentByHotelId(Map<String, Object> paramMap) {
        try {
            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
            Integer hotelId = Integer.parseInt((String) dataMap.get("hotelId"));
            Hotel hotel = hotelService.selectHotelByHotelId(hotelId);

            Properties templateProps = PropertyUtil.getTemplateProps();
            hotelService.pushHotelContent2Ctrip(hotel, templateProps);
            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("status", "success");
            return Response.status(Status.OK).entity(resultMap).build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }

    @POST
    @Path("/pushHotelContentByHotelIds")
    @Produces("application/json;charset=utf-8")
    public Response pushHotelContentByHotelIds(Map<String, Object> paramMap) {
        try {
            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
            String hotelIds = (String) dataMap.get("hotelIds");
            String[] ids = hotelIds.split(",");

            Properties templateProps = PropertyUtil.getTemplateProps();
            for (String id : ids) {
                if (null != id && !id.trim().isEmpty()) {
                    Integer hotelId = Integer.parseInt(id.trim());
                    Hotel hotel = hotelService.selectHotelByHotelId(hotelId);
                    hotelService.pushHotelContent2Ctrip(hotel, templateProps);
                }
            }
            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("status", "success");
            return Response.status(Status.OK).entity(resultMap).build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }

    @POST
    @Path("/retrieveStatusByHotelId")
    @Produces("application/json;charset=utf-8")
    public Response retrieveStatusByHotelId(Map<String, Object> paramMap) {
        try {
            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
            Integer hotelId = Integer.parseInt(String.valueOf(dataMap.get("hotelId")));

            Properties templateProps = PropertyUtil.getTemplateProps();
            hotelService.retrieveStatusFromCtrip(hotelId, templateProps);

            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("status", "success");
            return Response.status(Status.OK).entity(resultMap).build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
        }
    }

    @POST
    @Path("/pushRoomTypeByHotelId")
    @Produces("application/json;charset=utf-8")
    public Response pushRoomTypeByHotelId(Map<String, Object> paramMap) {
    	try {

            Map<String, Object> dataMap = (Map<String, Object>) paramMap.get("data");
    		if(dataMap == null || dataMap.get("hotelId") == null) {
    			throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() +" HOTEL ID cannot be empty.");
    		}
    		List<Map<String, Object>> hotelList = new ArrayList<>();
    		hotelList.add(dataMap);

    		List<Map<String, Object>> roomTypes = roomService.queryRoomTypes(hotelList);
    		logger.info("roomTypes======="+roomTypes);
    		
     		Map<String, String> resMap = new HashMap<>();
    		for (Map<String, Object> map : roomTypes) {
    			
    			resMap = MyPostMethod(roomTypePostUrl, pushRoomTypeStr(map));
    			if(!"200".equals(resMap.get("Code"))) {
    	    		return Response.status(Status.BAD_REQUEST).entity(resMap).build();
    			} 
			}
    		return Response.status(Status.OK).entity(resMap).build();
    	} catch (Exception e) {
    		throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg());
    	}
    }
    
//    public static final String roomTypePostUrl= "http://vendor-ctrip.fws.ctripqa.com/Hotel/OTAReceive/HotelStaticInfoService.asmx";
    public static final String roomTypePostUrl= "http://vendor.ctrip.com/Hotel/OTAReceive/HotelStaticInfoService.asmx";

    public String pushRoomTypeStr(Map<String, Object> map) {
    	
    	String soapRequestData = 
    			"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" +
    					"    <soap:Body>\r\n" +
    					"        <OTA_HotelInvNotifRQ TimeStamp=\"0001-01-01T00:00:00\" Target=\"Test\" Version=\"1.0\" PrimaryLangID=\"zh-cn\" xmlns=\"http://www.opentravel.org/OTA/2003/05\">\r\n" +
    					"  <POS>\r\n" +
    					"    <Source>\r\n" +
    					"      <RequestorID Type=\"1\" ID=\""+UsiTripConstant.CTRIP_ID+"\" MessagePassword=\""+UsiTripConstant.CTRIP_PASS+"\">\r\n" +
    					"        <CompanyName Code=\"C\" CodeContext=\""+UsiTripConstant.CTRIP_CONTEXT_CODE+"\" />\r\n" +
    					"      </RequestorID>\r\n" +
    					"    </Source>\r\n" +
    					"  </POS>\r\n" +
    					"  <SellableProducts HotelCode=\""+map.get("hotelId")+"\" HotelName=\"\">\r\n" +
    					"    <SellableProduct InvStatusType=\"Active\" InvTypeCode=\"R"+map.get("room_type_id")+"\">\r\n" +
    					"      <GuestRoom>\r\n" +
    					"        <Occupancy MinOccupancy=\"1\" MaxOccupancy=\""+map.get("max_person")+"\" AgeQualifyingCode=\"10\" />\r\n" +
//    					"        <Occupancy MinOccupancy=\"1\" MaxOccupancy=\"1\" AgeQualifyingCode=\"8\" />\r\n" +
    					"        <Room RoomTypeCode=\"3\"  NonSmoking=\"true\"  />\r\n" +
//    					"        <Room RoomTypeCode=\""+map.get("ctrip_code")+"\"  NonSmoking=\"true\"  />\r\n" +
    					"        <Amenities></Amenities>\r\n" +
    					"        <TPA_Extensions>\r\n" +
    					"          <Equipments></Equipments>\r\n" +

    					"          <BedTypes>\r\n";
    								String ctripBedCode =  (String) map.get("ctrip_bed_code");
    								String ctripBedQuantity =  (String) map.get("ctrip_bed_quantity");
    								String[] ctripBedCodeArr = ctripBedCode.split(",");
    								String[] ctripBedQuantityArr = ctripBedQuantity.split(",");
    								for (int i = 0; i < ctripBedCodeArr.length; i++) {
    									soapRequestData+= "            <BedType BedTypeCode=\""+ctripBedCodeArr[i]+"\" Quantity=\""+ctripBedQuantityArr[i]+"\" CategoryCode=\""+i+"\" />\r\n";
									}

    					soapRequestData+=
						"          </BedTypes>\r\n" +

    					"        </TPA_Extensions>\r\n" +
    					"        <Currency Code=\"USD\" />\r\n" +
    					"        <Description>\r\n" +
    					"          <Text Language=\"zh-cn\">"+(map.get("room_type_name_zh") == null || "".equals(map.get("room_type_name_zh")) ? map.get("ctrip_room_type_name") : map.get("room_type_name_zh"))+"</Text>\r\n" +
    					"          <Text Language=\"en-us\">"+map.get("ctrip_room_type_name")+"</Text>\r\n" +
    					"        </Description>\r\n" +
    					"        <LongDescription></LongDescription>" +
    					"        <ImageItems></ImageItems>" +
    					"      </GuestRoom>\r\n" +
    					"    </SellableProduct>\r\n" +
    					"  </SellableProducts>\r\n" +
    					"</OTA_HotelInvNotifRQ>\r\n" + 
    					"    </soap:Body>\r\n" + 
    					"</soap:Envelope>";

		return soapRequestData;
    }
    
    
    public Map<String, String> MyPostMethod(String url,String soapRequestData) {
        logger.info("soapRequestData====="+soapRequestData);

        try {     
            PostMethod postmethod = new PostMethod(url);     
            byte[] b = soapRequestData.getBytes("UTF-8");     
            InputStream is = new ByteArrayInputStream(b, 0, b.length);     
            RequestEntity re = new InputStreamRequestEntity(is, b.length,"application/xop+xml; charset=UTF-8; type=\"text/xml\"");     
            postmethod.setRequestEntity(re);     
            HttpClient httpClient = new HttpClient();     
            int statusCode = httpClient.executeMethod(postmethod);
            String soapResponseData = postmethod.getResponseBodyAsString();     
            logger.info("soapResponseData====="+soapResponseData);
            return parse(soapResponseData);
        } catch (Exception ex) {     
            ex.printStackTrace();     
        }
		return null;    
    }
    
	
	public Map<String, String> parse(String soap) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			Document doc = DocumentHelper.parseText(soap);
			Element root = doc.getRootElement();
			Element body = root.element("Body");
			Element ota = body.element("OTA_HotelInvNotifRS");
			Iterator<Element> it = ota.elementIterator();
			while (it.hasNext()) {
				Element e = it.next();
				String name = e.getName();
				if ("Error".equals(name)) {
                    if(e.attribute("Code") != null){
                        map.put("Code", e.attribute("Code").getValue());
                    }
					map.put("ShortText", e.attribute("ShortText").getValue());
				} else if ("Success".equals(name)) {
					map.put("Code", "200");
					map.put("ShortText", "Success");
				}
			}
			logger.info("returnMap========="+map);
		} catch (DocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return map;
	}

}
