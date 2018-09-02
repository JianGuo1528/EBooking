package com.ustrip.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.CharsetUtils;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;

public class PostBackend {

    private final static String USERNAME = "arthur.test@gmail.com";
    private final static String PASSWORD = "gJPZXA2NqMGv7m8CF3Gk5GBfl2DQQvb7";

    @SuppressWarnings("unchecked")
    public static String sendJsonHttpPost(String url, String json) {
        return sendJsonHttpPost(url, JSON.parseObject(json, Map.class));
    }

    public static String sendJsonHttpPost(String url, Map<String, Object> dataMap) {

        Map<String, Object> jsonMap = new HashMap<>();

        Map<String, Object> authMap = new HashMap<>();
        authMap.put("username", USERNAME);
        authMap.put("password", PASSWORD);
        jsonMap.put("auth", authMap);

        jsonMap.put("data", dataMap);

        CloseableHttpClient httpclient = HttpClients.createDefault();
        String responseInfo = null;
        try {
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");
            ContentType contentType = ContentType.create("application/json", CharsetUtils.get("UTF-8"));
            httpPost.setEntity(new StringEntity(JSON.toJSONString(jsonMap), contentType));
            CloseableHttpResponse response = httpclient.execute(httpPost);
            HttpEntity entity = response.getEntity();

            int status = response.getStatusLine().getStatusCode();
            if (status >= 200 && status < 300) {
                if (null != entity) {
                    responseInfo = EntityUtils.toString(entity);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return responseInfo;
    }

    public static String sendJsonHttpPost02(String url, String json) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String responseInfo = null;
        try {
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");
            ContentType contentType = ContentType.create("application/json", CharsetUtils.get("UTF-8"));
            httpPost.setEntity(new StringEntity(json, contentType));
            CloseableHttpResponse response = httpclient.execute(httpPost);
            HttpEntity entity = response.getEntity();

            int status = response.getStatusLine().getStatusCode();
            if (status >= 200 && status < 300) {
                if (null != entity) {
                    responseInfo = EntityUtils.toString(entity);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return responseInfo;

    }

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("orderReference", "5ae6764a7f7f493d8e6d8f637170b5c0");

        String reply = sendJsonHttpPost("http://api3.usitrip.com:8080/backend-test/hotels/book", "{\n" +
                "    \"ipAddress\": \"1.1.1.1\",\n" +
                "    \"booker\": {\n" +
                "        \"firstname\": \"Albert\",\n" +
                "        \"lastname\": \"Zhang\",\n" +
                "        \"email\": \"ctriphotelreshk@ctrip.com\",\n" +
                "        \"phone\": \"8665066224\"\n" +
                "    },\n" +
                "    \"clientReference\": \"Ctrip\",\n" +
                "    \"rooms\": [\n" +
                "        {\n" +
                "            \"roomReference\": \"eb:bb80e86f32ec4e3e99068dae1426ee0f\",\n" +
                "            \"paxes\": [\n" +
                "                {\n" +
                "                    \"type\": \"AD\",\n" +
                "                    \"name\": \"Albert\",\n" +
                "                    \"surname\": \"Zhang\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"type\": \"AD\",\n" +
                "                    \"name\": \"Brant\",\n" +
                "                    \"surname\": \"Huang\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"type\": \"AD\",\n" +
                "                    \"name\": \"Bruce\",\n" +
                "                    \"surname\": \"Huang\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"type\": \"AD\",\n" +
                "                    \"name\": \"Hugo\",\n" +
                "                    \"surname\": \"Lin\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}");
        System.out.println("reply->" + reply);
    }
}
