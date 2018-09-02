package com.ustrip.ctrip;

import com.ustrip.common.*;
import com.ustrip.dao.HotelDao;
import com.ustrip.entity.Hotel;
import com.ustrip.entity.OTAHotelDescriptiveContentNotifRQ;
import com.ustrip.service.DictService;
import com.ustrip.service.HotelService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Service
@Path("/ctrip")
public class RestCtripStaticService {
    private Logger logger = LogManager.getLogger(this.getClass().getName());
    @Autowired
    private HotelService hotelService;

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
            Integer hotelId =  Integer.parseInt((String) dataMap.get("hotelId"));
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
            Integer hotelId =  Integer.parseInt((String) dataMap.get("hotelId"));

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
}
