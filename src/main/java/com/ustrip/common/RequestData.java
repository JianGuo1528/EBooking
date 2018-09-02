package com.ustrip.common;

import com.ustrip.entity.RequestBean;
import org.json.JSONObject;

import java.util.Map;

public class RequestData {
	public static final ThreadLocal<RequestBean.Data> requestData = new ThreadLocal<RequestBean.Data>();  
    public static void putData(RequestBean.Data data) {  
    	requestData.set(data);  
    }  
      
    public static RequestBean.Data getData() {  
        return requestData.get();
    }

    private static ThreadLocal<JSONObject> requestJSONData = new ThreadLocal<JSONObject>();

    public static void setJSONData(JSONObject jsonStr) {
        requestJSONData.set(jsonStr);
    }

    public static JSONObject getJSONData() {
        return requestJSONData.get();
    }

    private static ThreadLocal<Integer> userId = new ThreadLocal<Integer>();

    public static void setUserId(Integer id) {
        userId.set(id);
    }

    public static Integer getUserId() {
        return userId.get();
    }

    public static ThreadLocal<Integer> role = new ThreadLocal<Integer>();

    public static void setRole(Integer id) {
        role.set(id);
    }

    public static Integer getRole() {
        return role.get();
    }

}
