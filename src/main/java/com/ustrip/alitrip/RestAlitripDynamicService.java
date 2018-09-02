package com.ustrip.alitrip;

import com.ustrip.common.CommonHandler;
import com.ustrip.common.POSTREST;
import com.ustrip.common.Utility;
import com.ustrip.common.VtoV;
import com.ustrip.delegate.TaobaoServiceDelegate;
import com.ustrip.entity.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jboss.resteasy.spi.HttpRequest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.time.Instant;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
@Service
@Path("/alitrip")
public class RestAlitripDynamicService {
    @Autowired
    private TaobaoServiceDelegate alitripServiceDelegate;

    private Logger logger = LogManager.getLogger(this.getClass().getName());

    @POST
    @Path("/all")
    @Produces("application/xml;charset=utf-8")
    public Response all(@Context HttpRequest request) throws Exception {
        String response = null;
        String inputXml = null;
        try {
            inputXml = new POSTREST().getRaw(request);
            logger.debug(inputXml);

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new ByteArrayInputStream(inputXml.getBytes("UTF-8")));
            Node rootNode = doc.getDocumentElement();
            String rootName = rootNode.getNodeName().toString();

            if ("CreateOrderRequest".equalsIgnoreCase(rootName)) {
                response = book(inputXml);
            } else if ("CancelOrderRequest".equalsIgnoreCase(rootName)) {
                response = cancel(inputXml);
            } else if ("SearchOrderRequest".equalsIgnoreCase(rootName)) {
                response = queryOrder(inputXml);
            } else if ("OrderRefundRQ".equalsIgnoreCase(rootName)) {
                response = orderRefund(inputXml);
            } else if ("ValidateRQ".equalsIgnoreCase(rootName)) {
                response = checkRoom(inputXml);
            } else {
                try {
                    new CommonHandler().SaveResponse("-1", "0", "book", "www.alitrip.com", inputXml, response);
                } catch (Exception e) {
                    Utility.error(logger, e.getMessage());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            Utility.error(logger, e.getMessage());
        }
        return Response.status(Status.OK).entity(response).build();
    }

    @POST
    @Path("/createOrder")
    @Produces("application/xml;charset=utf-8")
    public Response createOrder(@Context HttpRequest request) throws Exception {
        String response = null;
        String inputXml = null;
        try {
            inputXml = new POSTREST().getRaw(request);
            logger.debug(inputXml);

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new ByteArrayInputStream(inputXml.getBytes("UTF-8")));
            Node rootNode = doc.getDocumentElement();
            String rootName = rootNode.getNodeName().toString();
            response = book(inputXml);
        } catch (Exception e) {
            e.printStackTrace();
            Utility.error(logger, e.getMessage());
        }
        return Response.status(Status.OK).entity(response).build();
    }

    @POST
    @Path("/cancelOrder")
    @Produces("application/xml;charset=utf-8")
    public Response cancelOrder(@Context HttpRequest request) throws Exception {
        String response = null;
        String inputXml = null;
        try {
            inputXml = new POSTREST().getRaw(request);
            logger.debug(inputXml);

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new ByteArrayInputStream(inputXml.getBytes("UTF-8")));
            Node rootNode = doc.getDocumentElement();
            String rootName = rootNode.getNodeName().toString();
            response = cancel(inputXml);

        } catch (Exception e) {
            e.printStackTrace();
            Utility.error(logger, e.getMessage());
        }
        return Response.status(Status.OK).entity(response).build();
    }

    @POST
    @Path("/searchOrder")
    @Produces("application/xml;charset=utf-8")
    public Response searchOrder(@Context HttpRequest request) throws Exception {
        String response = null;
        String inputXml = null;
        try {
            inputXml = new POSTREST().getRaw(request);
            logger.debug(inputXml);

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new ByteArrayInputStream(inputXml.getBytes("UTF-8")));
            Node rootNode = doc.getDocumentElement();
            String rootName = rootNode.getNodeName().toString();
            response = queryOrder(inputXml);
        } catch (Exception e) {
            e.printStackTrace();
            Utility.error(logger, e.getMessage());
        }
        return Response.status(Status.OK).entity(response).build();
    }

    public String book(String inputXml) throws Exception {
        String response = null;
        String orderReference = "";
        try {
            Map params = new VtoV().XmlToMap(inputXml);
            Map BookRQ = (Map) params.get("CreateOrderRequest");
            Map AuthenticationToken = (Map) BookRQ.get("AuthenticationToken");
            String echoToken, id, pass;
            echoToken = String.valueOf("RequestTimestamp");
            id = String.valueOf("Username");
//            pass = String.valueOf("Password");
            pass = String.valueOf("Signature");
            Utility.checkAuth(echoToken, id, pass);

            List<String> rtv = alitripServiceDelegate.saveRedisAndBook(inputXml);
            response = rtv.get(0);
            orderReference = rtv.get(1);
        } catch (Exception e) {
            response = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><CreateOrderResponse>"
                    + "<ResponseTimestamp>" + System.currentTimeMillis() / 1000 + "</ResponseTimestamp>"
                    + "<Error><Code>SYSTEM_EXCEPTION</Code><Message>F-系统错误</Message></Error>" + "</CreateOrderResponse>";
            e.printStackTrace();
            Utility.error(logger, e.getMessage());
        }

        try {
            new CommonHandler().SaveResponse(orderReference, "0", "book", "www.alitrip.com", inputXml, response);
        } catch (Exception e) {
            Utility.error(logger, e.getMessage());
        }
        logger.info(response);

        return response;
    }

    public String cancel(String inputXml) throws Exception {
        String response = null;
        String orderReference = "";
        try {
            Map params = new VtoV().XmlToMap(inputXml);
            Map CancelRQ = (Map) params.get("CancelOrderRequest");
            Map AuthenticationToken = (Map) CancelRQ.get("AuthenticationToken");
            String echoToken, id, pass;
            echoToken = String.valueOf("RequestTimestamp");
            id = String.valueOf("Username");
//            pass = String.valueOf("Password");
            pass = String.valueOf("Signature");
            Utility.checkAuth(echoToken, id, pass);

            String taoBaoOrderId = String.valueOf(CancelRQ.get("TaoBaoOrderId")).replace(".0", "");
            String orderId = String.valueOf(CancelRQ.get("OrderId"));

            Map<String, String> rtv = alitripServiceDelegate.cancel(taoBaoOrderId, orderId);
            response = rtv.get("response");
            orderReference = rtv.get("orderReference");
        } catch (Exception e) {
            response = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><CancelOrderResponse>"
                    + "<ResponseTimestamp>" + System.currentTimeMillis() / 1000 + "</ResponseTimestamp>"
                    + "       <Message>取消失败</Message><ResultCode>-200</ResultCode></CancelOrderResponse>";
            e.printStackTrace();
            Utility.error(logger, e.getMessage());
        }

        try {
            new CommonHandler().SaveResponse(orderReference, "0", "cancel", "www.alitrip.com", inputXml, response);
        } catch (Exception e) {
            Utility.error(logger, e.getMessage());
        }
        logger.info(response);

        return response;
    }

    public String queryOrder(String inputXml) throws Exception {
        String response = null;
        String orderReference = "";
        try {
            Map params = new VtoV().XmlToMap(inputXml);
            Map QueryStatusRQ = (Map) params.get("SearchOrderRequest");
            Map AuthenticationToken = (Map) QueryStatusRQ.get("AuthenticationToken");
            String echoToken, id, pass;
            echoToken = String.valueOf("RequestTimestamp");
            id = String.valueOf("Username");
//            pass = String.valueOf("Password");
            pass = String.valueOf("Signature");
            Utility.checkAuth(echoToken, id, pass);

            Map<String, String> rtv = alitripServiceDelegate.queryOrder(QueryStatusRQ);
            response = rtv.get("response");
            orderReference = rtv.get("orderReference");
        } catch (Exception e) {
            response = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + "<SearchOrderResponse>"
                    + "<ResponseTimestamp>" + System.currentTimeMillis() / 1000 + "</ResponseTimestamp>"
                    + "       <Message>取消失败</Message>" + "       <ResultCode>-200</ResultCode>" + "</SearchOrderResponse>";
            e.printStackTrace();
            Utility.error(logger, e.getMessage());
        }

        try {
            new CommonHandler().SaveResponse(orderReference, "0", "cancel", "www.alitrip.com", inputXml, response);
        } catch (Exception e) {
            Utility.error(logger, e.getMessage());
        }
        logger.info(response);

        return response;
    }

    public String orderRefund(String inputXml) throws Exception {
        String response = null;
        String orderReference = "";
        try {
            Map params = new VtoV().XmlToMap(inputXml);
            Map QueryStatusRQ = (Map) params.get("OrderRefundRQ");
            Map AuthenticationToken = (Map) QueryStatusRQ.get("AuthenticationToken");
            String echoToken, id, pass;
            echoToken = String.valueOf("CreateToken");
            id = String.valueOf("Username");
            pass = String.valueOf("Password");
            Utility.checkAuth(echoToken, id, pass);

            Map<String, String> rtv = alitripServiceDelegate.queryOrder(QueryStatusRQ);
            response = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Result>"
                    + "<Message>处理成功</Message><ResultCode>0</ResultCode></Result>";

            orderReference = rtv.get("orderReference");
        } catch (Exception e) {
            response = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Result>"
                    + "<Message>处理失败</Message><ResultCode>-400</ResultCode></Result>";
            e.printStackTrace();
            Utility.error(logger, e.getMessage());
        }

        try {
            new CommonHandler().SaveResponse(orderReference, "0", "cancel", "www.alitrip.com", inputXml, response);
        } catch (Exception e) {
            Utility.error(logger, e.getMessage());
        }
        logger.info(response);

        return response;
    }

    private String checkRoom(String inputXml) {
        AliValidateResult result = new AliValidateResult();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String response = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<Result>\n" +
                "    <Message>其他失败</Message>\n" +
                "    <ResultCode>-4</ResultCode>\n" +
                "</Result>";
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AliValidateRQ.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            AliValidateRQ aliValidateRQ = (AliValidateRQ) unmarshaller.unmarshal(new StringReader(inputXml));

            String echoToken, id, pass;
            echoToken = aliValidateRQ.getAuthenticationToken().getCreateToken();
            id = aliValidateRQ.getAuthenticationToken().getUsername();
            pass = aliValidateRQ.getAuthenticationToken().getPassword();
            Utility.checkAuth(echoToken, id, pass);

            StringBuilder sb = new StringBuilder();
            String message = alitripServiceDelegate.checkRoom(aliValidateRQ, sb);
            if ("房量不足".equals(message)) {
                result.setResultCode("-3");
            } else {
                result.setResultCode("0");
            }
            result.setMessage(message);
            if (sb.length() > 0) {
                result.setInventoryPrice(sb.toString());
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            result.setResultCode("-4");
            result.setMessage("其他失败");
        } finally {
            try {
                response = convertXMLBean2String(AliValidateResult.class, result, true);
            } catch (Exception e) {
                logger.error(e.getMessage());
            }
        }
        new CommonHandler().SaveResponse("-1", "0", "checkRoom", "www.alitrip.com", inputXml, response);
        return response;
    }

    @POST
    @Path("/roomAvailability")
    @Produces("application/xml;charset=utf-8")
    public Response roomAvailability(@Context HttpRequest request) {
        String inputXml = null;
        String response = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<RoomAvailabilityResponse>\n" +
                "    <ResponseTimestamp>" + (System.currentTimeMillis() / 1000) + "</ResponseTimestamp>\n" +
                "    <Error>\n" +
                "        <Code>SYSTEM_EXCEPTION</Code>\n" +
                "        <Message>F-系统错误</Message>\n" +
                "    </Error>\n" +
                "</RoomAvailabilityResponse>";
        AliHotelRoomsResponse aliHotelRoomsResponse = null;
        try {
            inputXml = new POSTREST().getRaw(request);
            inputXml = inputXml.replaceAll("RoomAvailabilityRequest", "HotelRoomsRequest");
            aliHotelRoomsResponse = fetchRooms4Hotel(inputXml, true, true);
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            if (aliHotelRoomsResponse != null) {
//                aliHotelRoomsResponse.getHotel().setMinPrice(null);
//                aliHotelRoomsResponse.getHotel().setMinTaxPrice(null);
                try {
                    response = convertXMLBean2String(AliHotelRoomsResponse.class, aliHotelRoomsResponse, false);
                } catch (Exception e) {
                    logger.error(e.getMessage());
                }
            }
        }

        new CommonHandler().SaveResponse("-1", "0", "hotelRooms/roomAvailability", "www.alitrip.com", inputXml, response);
        return Response.status(Status.OK).entity(response.replaceAll("HotelRoomsResponse", "RoomAvailabilityResponse")).build();
    }

    @POST
    @Path("/hotelList")
    @Produces("application/xml;charset=utf-8")
    public Response hotelList(@Context HttpRequest request) {
        String inputXml = null;
        StringReader stringReader = null;
        AliHotelListResponse aliHotelListResponse = null;
        String response = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<HotelListResponse>\n" +
                "    <ResponseTimestamp>" + (System.currentTimeMillis() / 1000) + "</ResponseTimestamp>\n" +
                "    <Error>\n" +
                "        <Code>SYSTEM_EXCEPTION</Code>\n" +
                "        <Message>F-系统错误</Message>\n" +
                "    </Error>\n" +
                "</HotelListResponse>";
        try {
            inputXml = new POSTREST().getRaw(request);
            JAXBContext jaxbContext = JAXBContext.newInstance(AliHotelListRequest.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            stringReader = new StringReader(inputXml);
            AliHotelListRequest aliHotelListRequest = (AliHotelListRequest) unmarshaller.unmarshal(stringReader);
            Utility.checkAuth(null, aliHotelListRequest.getAuthenticationToken().getUsername(), null);
            aliHotelListResponse = alitripServiceDelegate.hotelList(aliHotelListRequest);
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            try {
                stringReader.close();
                if (aliHotelListResponse != null) {
                    response = convertXMLBean2String(AliHotelListResponse.class, aliHotelListResponse, true);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
            }
        }
        new CommonHandler().SaveResponse("-1", "0", "hotelList", "www.alitrip.com", inputXml, response);
        return Response.status(Status.OK).entity(response).build();
    }

    @POST
    @Path("/hotelRooms")
    @Produces("application/xml;charset=utf-8")
    public Response hotelRooms(@Context HttpRequest request) {
        String inputXml = null;
        AliHotelRoomsResponse aliHotelRoomsResponse = null;
        String response = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<HotelRoomsResponse>\n" +
                "    <ResponseTimestamp>" + (System.currentTimeMillis() / 1000) + "</ResponseTimestamp>\n" +
                "    <Error>\n" +
                "        <Code>SYSTEM_EXCEPTION</Code>\n" +
                "        <Message>F-系统错误</Message>\n" +
                "    </Error>\n" +
                "</HotelRoomsResponse>";
        try {
            inputXml = new POSTREST().getRaw(request);
            aliHotelRoomsResponse = fetchRooms4Hotel(inputXml, false, false);
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            if (aliHotelRoomsResponse != null) {
                try {
                    response = convertXMLBean2String(AliHotelRoomsResponse.class, aliHotelRoomsResponse, false);
                } catch (Exception e) {
                    logger.error(e.getMessage());
                }
            }
        }
        new CommonHandler().SaveResponse("-1", "0", "hotelRooms/roomAvailability", "www.alitrip.com", inputXml, response);
        return Response.status(Status.OK).entity(response).build();
    }

    private AliHotelRoomsResponse fetchRooms4Hotel(String inputXml, boolean hasRoomTypeCode, boolean hasRatePlanCode) throws Exception {
        AliHotelRoomsResponse aliHotelRoomsResponse = null;
        JAXBContext jaxbContext = JAXBContext.newInstance(AliHotelRoomsRequest.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader stringReader = new StringReader(inputXml);
        AliHotelRoomsRequest aliHotelRoomsRequest = (AliHotelRoomsRequest) unmarshaller.unmarshal(stringReader);
        stringReader.close();
        Utility.checkAuth(null, aliHotelRoomsRequest.getAuthenticationToken().getUsername(), null);
        aliHotelRoomsResponse = alitripServiceDelegate.hotelRooms(aliHotelRoomsRequest,
                hasRoomTypeCode ? aliHotelRoomsRequest.getRoomTypeCode() : null,
                hasRatePlanCode ? aliHotelRoomsRequest.getRateCode() : null);

        return aliHotelRoomsResponse;
    }

    private <T> String convertXMLBean2String(Class<T> clazz, T t, Boolean hasHeader) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", hasHeader);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(t, baos);
        String response = new String(baos.toByteArray());
        baos.close();
        
        return response;
    }

}
