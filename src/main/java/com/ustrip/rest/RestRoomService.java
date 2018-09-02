package com.ustrip.rest;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustrip.common.ErrorCodeEnum;
import com.ustrip.common.MiniException;
import com.ustrip.common.RequestData;
import com.ustrip.common.UsiTripConstant;
import com.ustrip.delegate.TransactionDelegate;
import com.ustrip.entity.Dict;
import com.ustrip.service.EbookingService;
import com.ustrip.service.RoomService;

@Service
@Path("/room")
public class RestRoomService {
 
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private TransactionDelegate delegate;
	
	private Logger logger = LogManager.getLogger(this.getClass().getName());

	@POST
	@Path("/queryAllHotelRoomType")
	@Produces("application/json;charset=UTF-8")
	public Response queryAllHotelRoomType() throws Exception {
		JSONObject jsonData = RequestData.getJSONData();
		myMiniExceptionER1001(jsonData, new String[] {"hotelId"});
		List<Dict> list = delegate.selectAllTypeByHotelId(UsiTripConstant.ROOMTYPE, Integer.valueOf(jsonData.get("hotelId").toString()),false);
		Map<String, Object> renMap = new HashMap<String, Object>();
		renMap.put("roomTypeList", list);
		return Response.status(Status.OK).entity(renMap).build();
	}
	
	
	@POST
	@Path("/queryRoomTypeByHotelId")
	@Produces("application/json;charset=UTF-8")
	public Response queryRoomTypeByHotelId() throws Exception {
		JSONObject jsonData = RequestData.getJSONData();
		myMiniExceptionER1001(jsonData, new String[] {"hotelId"});
		List<Dict> list = delegate.selectAllTypeByHotelId(UsiTripConstant.ROOMTYPE, Integer.valueOf(jsonData.get("hotelId").toString()),true);
		Map<String, Object> renMap = new HashMap<String, Object>();
		renMap.put("roomTypeList", list);
		return Response.status(Status.OK).entity(renMap).build();
	}
	
	@POST
	@Path("/addHotelRoomTypeBySelect")
	@Produces("application/json;charset=UTF-8")
	public Response addHotelRoomTypeBySelect() throws Exception {
		JSONObject jsonData = RequestData.getJSONData();
		myMiniExceptionER1001(jsonData, new String[] {"hotelId", "roomTypeId"});
 
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("hotelId", jsonData.get("hotelId").toString());
		m.put("roomTypeId", jsonData.get("roomTypeId").toString());
		Integer sum = roomService.selectCountByRoomTypeIdAndHotelId(m);
		if(sum > 0) {
			throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() +" It has already existed.");
		}
		
	    Integer count = roomService.addMappingByHotelAndRoomType(m);
  		return Response.status(Status.OK).entity(returnMap(count)).build();
	}
	
	@POST
	@Path("/addHotelRoomTypeByInput")
	@Produces("application/json;charset=UTF-8")
	public Response addHotelRoomTypeByInput() throws Exception {
		JSONObject jsonData = RequestData.getJSONData();
		myMiniExceptionER1001(jsonData, new String[] {"hotelId", "roomTypeName"});
		
		Dict dict = new Dict();
		dict.setHotelId(Integer.valueOf(jsonData.get("hotelId").toString()));
		dict.setTypeName(jsonData.get("roomTypeName").toString());
		dict.setType(UsiTripConstant.ROOMTYPE);
	    Integer roomTypeIdOrcount  = delegate.transactionInsertType(dict);
	    if(roomTypeIdOrcount == null || roomTypeIdOrcount <= 0) {
			throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() +" RETURN ROOM TYPE ID cannot be empty or "+ dict.getTypeName() +" has already existed.");
	    }
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("hotelId", dict.getHotelId());
		m.put("roomTypeName", dict.getTypeName());
	    m.put("roomTypeId", roomTypeIdOrcount);
	    Integer count = roomService.addMappingByHotelAndRoomType(m);
	    
	    Map<String, Object> mapp = returnMap(count);
	    mapp.put("roomTypeId", roomTypeIdOrcount);
	    
  		return Response.status(Status.OK).entity(mapp).build();
	}
	
	@POST
	@Path("/queryHotelRoomTypeById")
	@Produces("application/json;charset=UTF-8")
	public Response queryHotelRoomTypeById() throws Exception {
		JSONObject jsonData = RequestData.getJSONData();
		myMiniExceptionER1001(jsonData, new String[] {"hotelId", "roomTypeId"});
		
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("hotelId", jsonData.get("hotelId").toString());
		m.put("roomTypeId", jsonData.get("roomTypeId").toString());
		Dict dict = delegate.selectTypeByHotelIdAndId(Integer.valueOf(jsonData.get("roomTypeId").toString()), Integer.valueOf(jsonData.get("hotelId").toString()));
		return Response.status(Status.OK).entity(dict).build();
	}
	
	@POST
	@Path("/updateHotelRoomType")
	@Produces("application/json;charset=UTF-8")
	public Response updateHotelRoomType() throws Exception {
		JSONObject jsonData = RequestData.getJSONData();
		myMiniExceptionER1001(jsonData, new String[] {"hotelId", "roomTypeId", "roomTypeName"});
		
		Dict dict = new Dict();
		dict.setTypeName(jsonData.get("roomTypeName").toString());
	    Integer count = delegate.transactionUpdateDictByHotelIdAndId(dict, Integer.valueOf(jsonData.get("roomTypeId").toString()), Integer.valueOf(jsonData.get("hotelId").toString()));
  		return Response.status(Status.OK).entity(returnMap(count)).build();
	}
	 
	
	@POST
	@Path("/disableHotelRoomType")
	@Produces("application/json;charset=UTF-8")
	public Response disableHotelRoomType() throws Exception {
		JSONObject jsonData = RequestData.getJSONData();
		myMiniExceptionER1001(jsonData, new String[] {"hotelId", "roomTypeId"});

		Map<String, Object> m = new HashMap<String, Object>();
		m.put("hotelId", jsonData.get("hotelId").toString());
		m.put("roomTypeId", jsonData.get("roomTypeId").toString());
		m.put("status", 0);
	    Integer count = roomService.disableHotelRoomType(m);
  		return Response.status(Status.OK).entity(returnMap(count)).build();
	}
	
	
	public Map<String, Object> returnMap(Integer count){
		Map<String, Object> renMap = new HashMap<String, Object>();
		Date myDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String myDateString = sdf.format(myDate);
		renMap.put("dateStamp", myDateString);
		renMap.put("count", count);
		return renMap;
	}
	
	
	public void myMiniExceptionER1001(JSONObject jsonData,String[] strs){
		for (String str : strs) {
	        if(jsonData.isNull(str) || jsonData.get(str) == null || "".equals(jsonData.get(str).toString())) {
	        	throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() +" "+str+" cannot be empty.");
	        }
		}
 	}
	
	
    @POST
    @Path("/pushRoomTypeByHotelId")
    @Produces("application/json;charset=utf-8")
    public Response pushRoomTypeByHotelId() {
    	try {
    		JSONObject jsonData = RequestData.getJSONData();
    		if(jsonData.isNull("hotelId") || jsonData.get("hotelId") == null) {
    			throw new MiniException(UsiTripConstant.ERRORCODE_ER1001, ErrorCodeEnum.ER1001.getMsg() +" HOTEL ID cannot be empty.");
    		}
    		List<Map<String, Object>> hotelList = new ArrayList<>();
    		
    		Object obj = jsonData.get("hotelId");
    		if (obj instanceof JSONArray) {
    			JSONArray hotelIds = jsonData.getJSONArray("hotelId");
    			for (int m = 0; m < hotelIds.length(); m++) {
    	    		Map<String, Object> mm= new HashMap<>();
    	    		mm.put("hotelId", hotelIds.getInt(m));
    	    		hotelList.add(mm);
    			}
    		}else if(obj instanceof Integer){
    			Integer hotelId = (Integer) RequestData.getJSONData().get("hotelId");
        		Map<String, Object> mm= new HashMap<>();
	    		mm.put("hotelId", hotelId);
	    		hotelList.add(mm);
    		}

    		List<Map<String, Object>> roomTypes = roomService.queryRoomTypes(hotelList);
    		logger.info("roomTypes======="+roomTypes);
    		
     		Map<String, String> resMap = new HashMap<>();
    		for (Map<String, Object> map : roomTypes) {
    			
    			//通过酒店id,房型Id，表为plan表（可用的plan） 查询出一条床型
    			//通过床型Id 到map_bed_cbed 查询多条床型
    			List<Map<String, Object>> listBedType = roomService.queryBedListByHotelIdAndRoomTypeId(map);
    			map.put("listBedType", listBedType);
    			
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
    
    public static final String roomTypePostUrl= "http://vendor-ctrip.fws.ctripqa.com/Hotel/OTAReceive/HotelStaticInfoService.asmx";
    
    public String pushRoomTypeStr(Map<String, Object> map) {
    	
    	String soapRequestData = 
    			"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
    					"    <soap:Body>\r\n" + 
    					"        <OTA_HotelInvNotifRQ TimeStamp=\"0001-01-01T00:00:00\" Target=\"Test\" Version=\"1.0\" PrimaryLangID=\"zh-cn\" xmlns=\"http://www.opentravel.org/OTA/2003/05\">\r\n" + 
    					"  <POS>\r\n" + 
    					"    <Source>\r\n" + 
    					"      <RequestorID Type=\"1\" ID=\"jtbtest\" MessagePassword=\"jtbtest\">\r\n" + 
    					"        <CompanyName Code=\"C\" CodeContext=\"10029\" />\r\n" + 
    					"      </RequestorID>\r\n" + 
    					"    </Source>\r\n" + 
    					"  </POS>\r\n" + 
    					"  <SellableProducts HotelCode=\""+map.get("hotelId")+"\" HotelName=\"\">\r\n" + 
    					"    <SellableProduct InvStatusType=\"Active\" InvTypeCode=\""+map.get("room_type_id")+"\">\r\n" + 
    					"      <GuestRoom>\r\n" + 
    					"        <Occupancy MinOccupancy=\"1\" MaxOccupancy=\"3\" AgeQualifyingCode=\"10\" />\r\n" + 
    					"        <Occupancy MinOccupancy=\"1\" MaxOccupancy=\"1\" AgeQualifyingCode=\"8\" />\r\n" + 
    					"        <Room RoomTypeCode=\""+map.get("ctrip_code")+"\"  NonSmoking=\"true\"  />\r\n" + 
    					"        <Amenities></Amenities>\r\n" + 
    					"        <TPA_Extensions>\r\n" + 
    					"          <Equipments></Equipments>\r\n" + 
    		    		
    					"          <BedTypes>\r\n";
    								List<Map<String, Object>>  listBedType = (List<Map<String, Object>>) map.get("listBedType");
									for (Map<String, Object> m : listBedType) {
										soapRequestData+= "            <BedType BedTypeCode=\""+m.get("code")+"\" Quantity=\""+m.get("quantity")+"\" CategoryCode=\""+m.get("category_code")+"\" />\r\n";
									}
						soapRequestData+=	    
						"          </BedTypes>\r\n" +
    		    		
    					"        </TPA_Extensions>\r\n" + 
    					"        <Currency Code=\"USD\" />\r\n" + 
    					"        <Description>\r\n" + 
    					"          <Text Language=\"zh-cn\">"+map.get("room_type_name_zh")+"</Text>\r\n" + 
    					"          <Text Language=\"en-us\">"+map.get("room_type_name")+"</Text>\r\n" + 
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
					map.put("Code", e.attribute("Code").getValue());
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
