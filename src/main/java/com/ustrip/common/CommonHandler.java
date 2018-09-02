package com.ustrip.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.ustrip.delegate.ApplicationContextProvider;
import com.ustrip.entity.RequestBean;


public class CommonHandler {

	private static Logger logger = LogManager.getLogger(CommonHandler.class.getName());

	public void SaveResponse(String uuidRRL,String partnerId,String operation,String ipAddr,String request,String response) {
		try {
			String sql="insert into request_response_log"
					+ "(uuid,partner_id,ip_address,operation,request,req_upper,response,created_at)"
					+ " values "
					+ "('"+uuidRRL+"','"+partnerId+"','"+ipAddr+"','"+operation+"','"+request+"','','"+response+"',now())";
			execute(sql);
		} catch (Exception e) {
			logger.fatal(e.getMessage());
		}
	}
	
	public boolean isAvailable(Map<String,Object> mTotal,String date,int roomNumber,double price,int operType,int planId){
		boolean rtv=false;
		try {
			String roomNumberField="";
			String priceField="";
			if(1==operType){
				roomNumberField="contract_available_amount";
				priceField="contract_price";
			}else{
				roomNumberField="supplement_available_amount";
				priceField="supplement_price";
			}
			String sql="select * from eb_plan_detail where sale_date='"+date+"' and plan_id="+planId+" and "+roomNumberField+">="+roomNumber+" and "+priceField+"<="+price;
//			logger.debug(sql);
			ResultSet rs=getResultSet(sql);
			if(rs.next()){
				mTotal.put("netTotal", (double)mTotal.get("netTotal")+rs.getDouble(priceField)*roomNumber);
				rtv=true;
			}
			
		} catch (Exception e) {
			logger.fatal(e.getMessage());
		}
		return rtv;
	}
	
	public boolean orderExist(RequestBean.Data requestBean) {
		boolean rtv=false;
		try {
			String request = new Gson().toJson(requestBean);
			if(getResultSet("select * from request_response_log log,porder o where log.uuid=o.orderReference and o.status='CONFIRMED' and log.req_upper='"+request+"'").next()){
				rtv=true;
			}
			
		} catch (Exception e) {
			logger.fatal(e.getMessage());
		}
		return rtv;
	}
	
	private static Connection getConnection(){
		Connection conn=null;
		try {
			BasicDataSource ds=ApplicationContextProvider.getApplicationContext().getBean("readDataSource", BasicDataSource.class);
			conn=ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static ResultSet getResultSet(String sql){
		ResultSet rs = null;
		try {
			rs = getConnection().createStatement().executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rs;
	}

	public static boolean execute(String sql){
		boolean rs = false;
		try {
			rs = getConnection().createStatement().execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rs;
	}

	public static String getRequest(String orderPReference){
		String rtv="";
		try {
			String sql="select * from request_response_log where uuid in(select orderReference from porder where orderPReference='"+ orderPReference+"')";
			ResultSet rs=CommonHandler.getResultSet(sql);
			if(rs.next()){
				rtv=rs.getString("request");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtv;
	}
	public static Map<String,String> getIpCountry(String ipAddr){
		Map<String,String> rtv=new HashMap<String,String>();
		String latitude="";
		String longitude="";
		String country_iso_code="";
		String time_zone="";
		if(null!=ipAddr && !"".equals(ipAddr) && !"null".equals(ipAddr)){
			try {
				String sql="select i.latitude,i.longitude,l.* from ipv4 i,ipv4_location l where i.geoname_id=l.geoname_id and INET_ATON('"+ipAddr+"') between INET_ATON(i.low_address) and INET_ATON(i.high_address)";
				ResultSet rs=CommonHandler.getResultSet(sql);
				if(rs.next()){
					latitude=rs.getString("latitude");
					longitude=rs.getString("longitude");
					country_iso_code=rs.getString("country_iso_code");
					time_zone=rs.getString("time_zone");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		rtv.put("country-code",country_iso_code);
		rtv.put("latitude",latitude);
		rtv.put("longitude",longitude);
		rtv.put("time_zone",time_zone);
		return rtv;
	}
	
	public static String getCountryCodeByHotelId(String hotelId){
		String rtv="";
		try {
			String sql="select c.* from hotel h,country c where h.hotelId='"+ hotelId+"' and h.countryId=c.countryId";
			ResultSet rs=CommonHandler.getResultSet(sql);
			if(rs.next()){
				rtv=rs.getString("countryCode");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtv;
	}
	
	public static String getCountryCodeByPhoneCode(String phoneCode){
		String rtv="";
		try {
			String sql="select * from phone_country where phone_code='"+ phoneCode+"'";
			ResultSet rs=CommonHandler.getResultSet(sql);
			if(rs.next()){
				rtv=rs.getString("country_code");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtv;
	}
	
	public static int getAuthFailedCount(String email){
		int rtv=0;
		try {
			String sql="SELECT count(1) as cnt FROM payment_history where booker_email='"+ email+"' and transaction_type='A' and result!=0";
			ResultSet rs=CommonHandler.getResultSet(sql);
			if(rs.next()){
				rtv=rs.getInt("cnt");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtv;
	}
	
	public static int getCardBookingCount(String last8){
		int rtv=0;
		try {
			String sql="select count(1) as cnt from payment_history ph,porder po where TIMESTAMPDIFF(HOUR,po.created_at,now())<=12 and po.orderReference=ph.orderReference and ph.cc_number='"+ last8+"'";
			ResultSet rs=CommonHandler.getResultSet(sql);
			if(rs.next()){
				rtv=rs.getInt("cnt");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtv;
	}
	
	public static int getBookingCount(String email){
		int rtv=0;
		try {
			String sql="select count(1) as cnt from porder po where TIMESTAMPDIFF(HOUR,created_at,now())<=12 and po.bookerEmail='"+ email+"'";
			ResultSet rs=CommonHandler.getResultSet(sql);
			if(rs.next()){
				rtv=rs.getInt("cnt");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtv;
	}
	

}
