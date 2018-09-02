package com.ustrip.ctrip;

import com.alibaba.fastjson.JSON;
import com.ustrip.common.*;
import com.ustrip.delegate.CtripServiceDelegate;
import com.ustrip.entity.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.jboss.resteasy.spi.HttpRequest;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.InputSource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Path("/ctrip")
public class RestCtripDynamicService {
    @Autowired
    private CtripServiceDelegate ctripServiceDelegate;

    private Logger logger = LogManager.getLogger(this.getClass().getName());

    @POST
    @Path("/book")
    @Produces("application/json;charset=utf-8")
    public Response book(@Context HttpRequest request) throws Exception {
        System.out.println("!!!!!!!!!");
        String response = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "  <soap:Body><OTA_HotelResRS TimeStamp=\"2018-07-03T07:46:04.706122+08:00\" Version=\"2.1\" xmlns=\"http://www.opentravel.org/OTA/2003/05\">"
                + "  <Success />"
                + "  <HotelReservations>"
                + "    <HotelReservation ResStatus=\"S\">"
                + "      <ResGlobalInfo>"
                + "        <HotelReservationIDs>"
                + "          <HotelReservationID ResID_Type=\"502\" ResID_Value=\"CTP-859623\" />"
                + "          <HotelReservationID ResID_Type=\"501\" ResID_Value=\"799264\" />"
                + "        </HotelReservationIDs>"
                + "      </ResGlobalInfo>"
                + "    </HotelReservation>"
                + "  </HotelReservations>"
                + "</OTA_HotelResRS></soap:Body>"
                + "</soap:Envelope>";
        return Response.status(Status.OK).entity(response).build();
    }

    @POST
    @Path("/cancel")
    @Produces("application/json;charset=utf-8")
    public Response cancel(@Context HttpRequest request) throws Exception {
        System.out.println("!!!!!!!!!");
        String response = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "  <soap:Body><OTA_HotelResRS TimeStamp=\"2018-07-03T07:46:04.706122+08:00\" Version=\"2.1\" xmlns=\"http://www.opentravel.org/OTA/2003/05\">"
                + "  <Success />"
                + "  <HotelReservations>"
                + "    <HotelReservation ResStatus=\"S\">"
                + "      <ResGlobalInfo>"
                + "        <HotelReservationIDs>"
                + "          <HotelReservationID ResID_Type=\"502\" ResID_Value=\"CTP-859623\" />"
                + "          <HotelReservationID ResID_Type=\"501\" ResID_Value=\"799264\" />"
                + "        </HotelReservationIDs>"
                + "      </ResGlobalInfo>"
                + "    </HotelReservation>"
                + "  </HotelReservations>"
                + "</OTA_HotelResRS></soap:Body>"
                + "</soap:Envelope>";
        return Response.status(Status.OK).entity(response).build();
    }

    @POST
    @Path("/pullAvailability")
    @Produces("application/xml;charset=utf-8")
    public Response pullAvailability(@Context HttpRequest request) throws Exception {
        String inputXml = new POSTREST().getRaw(request);
        logger.info("pullAvailability request=" + inputXml);
        String echoToken = "";
        String category = "OTA_HotelAvailGetRS";
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(new InputSource(new StringReader(inputXml)));
            //DefaultXPath xpath = new DefaultXPath("//OTA_HotelAvailGetRQ");
            Element root = document.getRootElement();
            Element soap = (Element) root.selectSingleNode("//*[local-name()='OTA_HotelAvailGetRQ']");
            //Document sd = soap.getDocument();
            String reqXml = soap.asXML();
            JAXBContext jaxbContext = JAXBContext.newInstance(OTAHotelAvailGetRQ.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            OTAHotelAvailGetRQ req = (OTAHotelAvailGetRQ) jaxbUnmarshaller.unmarshal(new InputSource(new StringReader(reqXml)));
            echoToken = req.getEchoToken();
            String id = req.getPOS().getSource().getRequestorID().getID();
            String pass = req.getPOS().getSource().getRequestorID().getMessagePassword();
            CtripUtils.checkAuth(category, echoToken, id, pass);
            OTAHotelAvailGetRS response = ctripServiceDelegate.pullAvailability(req);
            JAXBContext responseBinder = JAXBContext.newInstance(OTAHotelAvailGetRS.class);
            StringWriter writer = new StringWriter();
            Marshaller marshaller = responseBinder.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true); 
            marshaller.marshal(response, writer);

            String soapResponse = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
					"<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
					"<soap:Body>" +
					writer.toString()+
					"</soap:Body>" +
					"</soap:Envelope>";
    		
            return Response.status(Status.OK).entity(soapResponse).build();
        } catch (CtripException e) {
            throw e;
        } catch (Exception e) {
        	logger.fatal("fatal error:",e);
            throw new CtripException(category, echoToken, "1", "322", "No availability");
        }
    }

    @POST
    @Path("/checkAvailability")
    @Produces("application/xml;charset=utf-8")
    public Response checkAvailability(@Context HttpRequest request) throws Exception {
        String inputXml = new POSTREST().getRaw(request);
        logger.info("checkAvailability request=" + inputXml);
        String echoToken = "";
        String category = "OTA_HotelAvailGetRS";
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(new InputSource(new StringReader(inputXml)));
            //DefaultXPath xpath = new DefaultXPath("//OTA_HotelAvailGetRQ");
            Element root = document.getRootElement();
            Element soap = (Element) root.selectSingleNode("//*[local-name()='OTA_HotelAvailRQ']");
            //Document sd = soap.getDocument();
            String reqXml = soap.asXML();
            JAXBContext jaxbContext = JAXBContext.newInstance(OTAHotelAvailRQ.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            OTAHotelAvailRQ req = (OTAHotelAvailRQ) jaxbUnmarshaller.unmarshal(new InputSource(new StringReader(reqXml)));
            echoToken = req.getEchoToken();
            String id = req.getPOS().getSource().getRequestorID().getID();
            String pass = req.getPOS().getSource().getRequestorID().getMessagePassword();
            CtripUtils.checkAuth(category, echoToken, id, pass);
            OTAHotelAvailRS response = ctripServiceDelegate.checkAvailability(req);
            
            JAXBContext responseBinder = JAXBContext.newInstance(OTAHotelAvailRS.class);
            StringWriter writer = new StringWriter();
            Marshaller marshaller = responseBinder.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true); 
            marshaller.marshal(response, writer);

            String soapResponse = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
					"<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
					"<soap:Body>" +
					writer.toString()+
					"</soap:Body>" +
					"</soap:Envelope>";
            
            return Response.status(Status.OK).entity(soapResponse).build();
        } catch (CtripException e) {
            throw e;
        } catch (Exception e) {
        	logger.fatal("Found Exception:",e);
            throw new CtripException(category, echoToken, "1", "322", "No availability");
        }
    }

    @POST
    @Path("/createReservation")
    @Produces("application/xml;charset=utf-8")
    public Response createReservation(@Context HttpRequest request) {
        String ctripReservationNo = null;
        String inputXml = "";
        try {
            inputXml = new POSTREST().getRaw(request);
            String category = "OTA_HotelResRQ";

            JAXBContext jaxbContext = JAXBContext.newInstance(OTAHotelResRQ.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader stringReader = new StringReader(CtripUtils.getSoapBody(inputXml));
            OTAHotelResRQ otaHotelResRQ = (OTAHotelResRQ) unmarshaller.unmarshal(stringReader);
            stringReader.close();
            ctripReservationNo = String.valueOf(otaHotelResRQ.getUniqueID().getID());

            Map<String, Object> map = ctripServiceDelegate.selectPorderCtripByCtripReservationNo(ctripReservationNo);
            if ((map != null && map.size() > 0) || "true".equalsIgnoreCase(otaHotelResRQ.getRetransmissionIndicator())) {
                String responseSoapMessage = ctripServiceDelegate.
                        createSoapMessage4ReservationCreation(true, true, ctripReservationNo, String.valueOf(map.get("hotel_confirmation_number")), null);
                try {
                    String orderReference = "-1";
                    new CommonHandler().SaveResponse(orderReference, "0", "book", "www.ctrip.com", inputXml, responseSoapMessage);
                } catch (Exception e) {
                    Utility.error(logger, e.getMessage());
                }
                return Response.status(Status.OK).entity(responseSoapMessage).build();
            }

            String id = otaHotelResRQ.getPOS().getSource().getRequestorID().getID();
            String pass = otaHotelResRQ.getPOS().getSource().getRequestorID().getMessagePassword();
            CtripUtils.checkAuth(category, String.valueOf(otaHotelResRQ.getEchoToken()), id, pass);

            List<BookRequest.DataBean.RoomsBean.PaxesBean> paxesBeans = ctripServiceDelegate.getAllPaxes(otaHotelResRQ);
            String roomReference = ctripServiceDelegate.createReservation(otaHotelResRQ, paxesBeans);
            String response = ctripServiceDelegate.invokeCheckRoomApi(otaHotelResRQ, roomReference, paxesBeans);
            logger.info(response);
            StringBuilder sb = new StringBuilder();
            String responseSoapMessage = ctripServiceDelegate.parseResponse4ReservationCreation(otaHotelResRQ, response, sb);
            responseSoapMessage = responseSoapMessage == null ? response : responseSoapMessage;

            try {
                String orderReference = "-1";
                JSONObject jsonObject = new JSONObject(response);
                if (jsonObject.has("success") && jsonObject.get("success").toString().equalsIgnoreCase("true")) {
                    JSONObject dataObject = (JSONObject) jsonObject.get("data");
                    orderReference = dataObject.getString("orderReference");
                }
                new CommonHandler().SaveResponse(orderReference, "0", "book", "www.ctrip.com", inputXml, responseSoapMessage);
            } catch (Exception e) {
                Utility.error(logger, e.getMessage());
            }

            //send a new order email
            if (sb.length() > 0) {
                logger.info("Email status: " + EBUtil.sendNewOrderEmail(sb.toString().trim()));
            }
            return Response.status(Status.OK).entity(responseSoapMessage).build();
        } catch (Exception e) {
            try {
                String orderReference = "-1";
                new CommonHandler().SaveResponse(orderReference, "0", "book", "www.ctrip.com", inputXml, e.getMessage());
            } catch (Exception er) {
                Utility.error(logger, er.getMessage());
            }
            e.printStackTrace();
            logger.error(e.getMessage());
            return Response.status(Status.OK).entity(getErrMsg4ReservationCreation(ctripReservationNo, "450", "12", "Unable to process the special request")).build();
        }
    }

    private String getErrMsg4ReservationCreation(String ctripReservationNo, String code, String type, String shortText) {
        Map<String, String> errorMap = new HashMap<String, String>();
        errorMap.put("code", code);
        errorMap.put("type", type);
        errorMap.put("shortText", shortText);
        return ctripServiceDelegate.createSoapMessage4ReservationCreation(false, false, ctripReservationNo, null, errorMap);
    }

    @POST
    @Path("/cancelReservation")
    @Produces("application/xml;charset=utf-8")
    public Response cancelReservation(@Context HttpRequest request) throws Exception {
        logger.info("request=" + request.toString());
        String inputXml = new POSTREST().getRaw(request);
        String category = "OTA_CancelRQ";

        JAXBContext jaxbContext = JAXBContext.newInstance(OTACancelRQ.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        OTACancelRQ otaCancelRQ = (OTACancelRQ) unmarshaller.unmarshal(new StringReader(CtripUtils.getSoapBody(inputXml)));
        String id = otaCancelRQ.getPOS().getSource().getRequestorID().getID();
        String pass = otaCancelRQ.getPOS().getSource().getRequestorID().getMessagePassword();
        CtripUtils.checkAuth(category, String.valueOf(otaCancelRQ.getEchoToken()), id, pass);

        List<OTACancelRQ.UniqueID> uniqueID = otaCancelRQ.getUniqueID();
        String ctripconfirmationCode_501 = "";
        String partnerConfirmationCode_502 = "";
        String orderReference = "";
        int flag = 0;
        for (OTACancelRQ.UniqueID uniqueID1 : uniqueID) {
            if (uniqueID1.getType() == 501) {
                ctripconfirmationCode_501 = uniqueID1.getID();
                Map<String, Object> map = ctripServiceDelegate.selectPorderCtripByCtripReservationNoAllStatus(ctripconfirmationCode_501);
                logger.info(map);
                if (map != null && map.size() > 0) {
                    orderReference = (String) map.get("orderReference");
                    partnerConfirmationCode_502 = (String) map.get("hotel_confirmation_number");
                    if ("0".equals((String) map.get("statue"))) {
                        flag = 1;
                    }
                } else {
                    flag = 2;
                }
            }
        }

        String xml_head = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
				+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
        		+ "<soap:Body>"
        		+ "<OTA_CancelRS xmlns=\"http://www.opentravel.org/OTA/2003/05\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" Version=\"2.1\" EchoToken=\"201403121021\"> ";
        String xml_success = "<Success/>";
        String xml_warnings = "<Warnings> <Warning Type=\"3\" Code=\"95\">The reservation has been cancelled already</Warning> </Warnings>";
        String xml_errors_193 = "<Errors> <Error ShortText=\"Reservation " + ctripconfirmationCode_501 + " cancellation process failed\" Type=\"3\" Code=\"193\"/> </Errors>";
        String xml_errors_245 = "<Errors> <Error ShortText=\"Reservation " + ctripconfirmationCode_501 + " cannot be found\" Type=\"3\" Code=\"245\"/> </Errors>";
        String xml_501 = "<UniqueID ID=\"" + ctripconfirmationCode_501 + "\" Type=\"501\" />";
        String xml_502 = "<UniqueID ID=\"" + partnerConfirmationCode_502 + "\" Type=\"502\"/>";
        String xml_foot = "</OTA_CancelRS>"
        		+ "</soap:Body>"
        		+ "</soap:Envelope>";
        String response = "";

        if (flag == 1) {
            response = xml_head + xml_success + xml_warnings + xml_501 + xml_502 + xml_foot;
        } else if (flag == 2) {
            response = xml_head + xml_errors_245 + xml_501 + xml_foot;
        } else {
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("orderReference", orderReference);
            String resJson = PostBackend.sendJsonHttpPost(UsiTripConstant.BACKENDURL + "/hotels/cancel", dataMap);
            Map<String, Object> jsonMap = JSON.parseObject(resJson, Map.class);

            if (jsonMap.containsKey("success") && ("true".equals((String) jsonMap.get("success")) || (Boolean) jsonMap.get("success"))) {
                response = xml_head + xml_success + xml_501 + xml_502 + xml_foot;
                dataMap.put("ctripReservationNumber", ctripconfirmationCode_501);
                int count = ctripServiceDelegate.updateStatusOfPorderCtrip(dataMap);
                //send a cancelled email
                logger.info("Email status: " + EBUtil.sendCancelledOrderEmail(partnerConfirmationCode_502));
            } else if (jsonMap.containsKey("errorId") && ("ER1310".equals((String) jsonMap.get("errorId")))) {
                response = xml_head + xml_success + xml_warnings + xml_501 + xml_502 + xml_foot;
            } else {
                logger.info(jsonMap);
                response = xml_head + xml_errors_193 + xml_501 + xml_foot;
            }
        }

        try {
            new CommonHandler().SaveResponse(orderReference, "0", "cancel", "www.ctrip.com", inputXml, response);
        } catch (Exception er) {
            Utility.error(logger, er.getMessage());
        }

        return Response.status(Status.OK).entity(response).build();
    }
}
