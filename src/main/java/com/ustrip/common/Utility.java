package com.ustrip.common;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;

public class Utility {
	private static Logger logger = LogManager.getLogger(Utility.class);
	
    public static void checkAuth(String echoToken, String id, String pass) throws Exception{
//        if (!(UsiTripConstant.ALITRIP_ID.equals(id) && UsiTripConstant.ALITRIP_PASS.equals(pass))) {
//            throw new MiniException(UsiTripConstant.ERRORCODE_ER1003, ErrorCodeEnum.ER1003.getMsg());
//        }
    }

    public static String signTopRequest(Map<String, String> params, String secret, String signMethod) throws IOException {
        // Step1: Sort
        String[] keys = params.keySet().toArray(new String[0]);
        Arrays.sort(keys);
      
        // Step2: Assemble
        StringBuilder query = new StringBuilder();
        if ("md5".equals(signMethod)) {
            query.append(secret);
        }
        for (String key : keys) {
            String value = params.get(key);
            if (value!=null && !"".equals(value)) {
                query.append(key).append(value);
            }
        }
      
        // Step3: Sign MD5/HMAC
        byte[] bytes;
        if ("hmac".equals(signMethod)) {
            bytes = encryptHMAC(query.toString(), secret);
        } else {
            query.append(secret);
            bytes = encryptMD5(query.toString());
        }
      
        // Step4: Convert to Hex
        return byte2hex(bytes);
    }
      
    public static byte[] encryptHMAC(String data, String secret) throws IOException {
        byte[] bytes = null;
        try {
            SecretKey secretKey = new SecretKeySpec(secret.getBytes("utf-8"), "HmacMD5");
            Mac mac = Mac.getInstance(secretKey.getAlgorithm());
            mac.init(secretKey);
            bytes = mac.doFinal(data.getBytes("utf-8"));
        } catch (GeneralSecurityException gse) {
            throw new IOException(gse.toString());
        }
        return bytes;
    }
      
    public static byte[] encryptMD5(String data) throws IOException {
        //return encryptMD5(data.getBytes("utf-8"));
        byte[] bytesOfMessage = data.getBytes("UTF-8");
        byte[] thedigest = null;
        MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
	        thedigest = md.digest(bytesOfMessage);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return thedigest;
    }
      
    public static String byte2hex(byte[] bytes) {
        StringBuilder sign = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(bytes[i] & 0xFF);
            if (hex.length() == 1) {
                sign.append("0");
            }
            sign.append(hex.toUpperCase());
        }
        return sign.toString();
    }
	
	public boolean contains(JSONArray jsonArray, Object obj){
//		System.out.println("HD_test contains");
//		return true;
		
		for(int i = 0;i<jsonArray.length();i++){
			if(jsonArray.getString(i).equals(obj.toString())){
				return true;
			}
		}
		return false;
	}
	
    public static String getUUID(){ 
        String s = UUID.randomUUID().toString(); 
        //去掉“-”符号 
        //return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
        return s.replace("-", "");
    } 
    
	public static String UUID(int partnerId){
//		String RANDOM_PATTERN1 = "yyMMddHH";
//		String RANDOM_PATTERN2 = "mmssSSS";
//		
//		String s= "",date1="",date2="";
//		try {
//			Date now = new Date();
//			
//			SimpleDateFormat sdf1 = new SimpleDateFormat(RANDOM_PATTERN1);
//			date1 = sdf1.format(now);
////			logger.debug(date1);
//			
//			SimpleDateFormat sdf2 = new SimpleDateFormat(RANDOM_PATTERN2);
//			date2 = sdf2.format(now);
////			logger.debug(date2);
//			
//			date1=Integer.toHexString(Integer.parseInt(date1));
////			logger.debug(date1);
//			
//			date2=Integer.toHexString(Integer.parseInt(date2));
////			logger.debug(date2);
//			
//			Random random = new Random();
//			s=Integer.toHexString(random.nextInt());
////			logger.debug(s);
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new MiniException(UsiTripConstant.ERRORCODE_ER1412, ErrorCodeEnum.ER1412.getMsg());
//		}
//		return date1+date2+s;
//		return String.valueOf((long)System.currentTimeMillis()/1000)+String.valueOf(partnerId);
		return getUUID();
	}

	public static String NotNullString(String str){ 
		String rtv="";
		try {
			if(null!=str && !(str.trim().equals("")) && !(str.trim().toLowerCase().equals("null")) ){
				rtv=str;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtv;
	}
	public static String NotNullString(Object str){ 
		String rtv="";
		try {
			if(null!=str && !(str.toString().trim().equals("")) && !(str.toString().trim().toLowerCase().equals("null")) ){
				rtv=str.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtv;
	}
	public static String genTimeStamp4HBSi(){
		String rtv="";
		try {
			//rtv format is: 2005-05-03T15:47:24-04:00
			Date now=new Date();
			String formatTimeStamp = "yyyy-MM-dd'T'HH:mm:ssZ";
		    SimpleDateFormat sdf = new SimpleDateFormat(formatTimeStamp) {
		        public StringBuffer format(Date date, StringBuffer toAppendTo, java.text.FieldPosition pos) {
		            StringBuffer toFix = super.format(date, toAppendTo, pos);
		            return toFix.insert(toFix.length()-2, ':');
		        };
		    };
		    rtv= sdf.format(sdf.format(now));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtv;
	}
	
	public static void error(Logger logger,String exMsg){ 
		try {
//			StackTraceElement stackTraceElement= ex.getStackTrace()[ex.getStackTrace().length-1];
	    	Throwable t=new Throwable();
//	    	t.printStackTrace();
	        StackTraceElement stackTraceElement = t.getStackTrace()[1];
			logger.fatal("error info:File="+stackTraceElement.getClassName()+" Method="+stackTraceElement.getMethodName()+" Line="+stackTraceElement.getLineNumber()+" Message="+exMsg);
		} catch (Exception e) {
			logger.fatal("error found when getting error info:"+e.getMessage());
//			e.printStackTrace();
		}
	}
	public static String getRandom(int count){
	    String sources = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; 
	    StringBuffer flag = new StringBuffer();  
	    for (int j = 0; j < count; j++)   
	    {  
	    	String chara="d";
			try {
				chara = ""+sources.charAt(new Random().nextInt(sources.length()));
			} catch (Exception e) {
				e.printStackTrace();
			}
	        flag.append(chara);
	    }  
	    return flag.toString();  
	}

}
