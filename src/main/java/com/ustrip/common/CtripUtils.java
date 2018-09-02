package com.ustrip.common;

import com.ustrip.common.CtripException;
import com.ustrip.delegate.CtripServiceDelegate;

import jdk.internal.org.xml.sax.InputSource;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;

import java.io.*;
import java.net.URL;

public class CtripUtils {
    private static HttpClient httpClient = new HttpClient();
    private static SOAPConnection connection;
    private static Logger logger = LogManager.getLogger(CtripUtils.class.getName());
    static {
        try {
            connection = SOAPConnectionFactory.newInstance().createConnection();
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }

    public static String getSoapBody(String soapMessage) {
        String startingTag = "<SOAP-ENV:Body>";
        String endingTag = "</SOAP-ENV:Body>";
        int index = soapMessage.indexOf(startingTag);
        if (index >= 0) {
            return soapMessage.substring(index + startingTag.length(), soapMessage.lastIndexOf(endingTag)).trim();
        } else {
            return soapMessage;
        }
    }

    public static void checkAuth(String category, String echoToken, String id, String pass) {
        if (UsiTripConstant.CTRIP_REQ_ID.equals(id) && UsiTripConstant.CTRIP_REQ_PASS.equals(pass)) {

        } else {
        	logger.fatal("id:"+id+"/pass:"+pass);
            throw new CtripException(category, echoToken, "9", "497", "Authorization error.");
        }
    }

    public static String pushData2Ctrip(String url, String content) throws IOException {
        PostMethod postmethod = new PostMethod(url);
        byte[] b = content.getBytes("UTF-8");
        InputStream is = new ByteArrayInputStream(b, 0, b.length);
        RequestEntity re = new InputStreamRequestEntity(is, b.length,
                "application/xop+xml; charset=UTF-8; type=\"text/xml\"");
        postmethod.setRequestEntity(re);
        int statusCode = httpClient.executeMethod(postmethod);
        int time = 0;
        while (statusCode != 200 && time++ <= 3) {
            statusCode = httpClient.executeMethod(postmethod);
        }
        System.out.println("statuscode = " + statusCode);
        return postmethod.getResponseBodyAsString();
    }

    public static String pushData2Ctrip02(String url, String content) throws SOAPException, IOException {
        SOAPMessage soapMessage = MessageFactory.newInstance().createMessage(null, new ByteArrayInputStream(content.getBytes()));
        SOAPMessage soapResponseMessage = connection.call(soapMessage, new URL(url));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        soapResponseMessage.writeTo(baos);
        return new String(baos.toByteArray());
    }
}
