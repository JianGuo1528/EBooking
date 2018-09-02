package com.ustrip.entity;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.json.JSONException;
import org.json.JSONObject;

import com.ustrip.common.VtoV;
public class RedisPartner
{
	public String PartnerToJSON(Partner partner)
	{
		JSONObject partner_json_object =new JSONObject();
		//set json
		partner_json_object.put("active", partner.getActive());
		partner_json_object.put("admin", partner.getAdmin());
		partner_json_object.put("api_password", partner.getApi_password());
		partner_json_object.put("avatar", partner.getAvatar());
		partner_json_object.put("balance", partner.getBalance());
		partner_json_object.put("channel", partner.getChannel());
		partner_json_object.put("company_address", partner.getCompany_address());
		partner_json_object.put("company_name", partner.getCompany_name());
		partner_json_object.put("company_phone", partner.getCompany_phone());
		partner_json_object.put("contact_person", partner.getContact_person());
		partner_json_object.put("country_Code", partner.getCountry_Code());
		partner_json_object.put("created_at", partner.getCreated_at());
		partner_json_object.put("email", partner.getEmail());
		partner_json_object.put("id", partner.getId());
		partner_json_object.put("mobile_phone", partner.getMobile_phone());
		partner_json_object.put("name", partner.getName());
		partner_json_object.put("password", partner.getPassword());
		partner_json_object.put("priceRatio", partner.getPriceRatio());
		partner_json_object.put("providers", partner.getProviders());
		partner_json_object.put("remember_token", partner.getRemember_token());
		partner_json_object.put("updated_at", partner.getUpdated_at());	
		String partner_json_string= partner_json_object.toString();	
		return partner_json_string;
	}
	
	public Partner  JSONToPartner(String partner_json) throws JSONException, ParseException
	{
		
		Partner partner = new Partner();
		JSONObject partner_json_object = new VtoV().jsonStringTojsonObject(partner_json);
		if(partner_json_object.has("active"))
		partner.setActive((byte)partner_json_object.getInt("active"));
		if(partner_json_object.has("admin"))
		partner.setAdmin((byte)partner_json_object.getInt("admin"));
		if(partner_json_object.has("api_password"))
		partner.setApi_password(partner_json_object.getString("api_password"));
		if(partner_json_object.has("avatar"))
		partner.setAvatar(partner_json_object.getString("avatar"));
		if(partner_json_object.has("balance"))
		partner.setBalance(partner_json_object.getDouble("balance"));
		if(partner_json_object.has("channel"))
		partner.setChannel(partner_json_object.getString("channel"));
		if(partner_json_object.has("company_address"))
		partner.setCompany_address(partner_json_object.getString("company_address"));
		if(partner_json_object.has("company_name"))
		partner.setCompany_name(partner_json_object.getString("company_name"));
		if(partner_json_object.has("company_phone"))
		partner.setCompany_phone(partner_json_object.getString("company_phone"));
		if(partner_json_object.has("contact_person"))
		partner.setContact_person(partner_json_object.getString("contact_person"));
		if(partner_json_object.has("country_Code"))
		partner.setCountry_Code(partner_json_object.getString("country_Code"));
		if(partner_json_object.has("created_at"))
		partner.setCreated_at(new SimpleDateFormat("EEE MMM dd hh:mm:ss z yyyy").parse(partner_json_object.getString("created_at")));
		if(partner_json_object.has("email"))
		partner.setEmail(partner_json_object.getString("email"));
		if(partner_json_object.has("id"))
		partner.setId(partner_json_object.getInt("id"));
		if(partner_json_object.has("mobile_phone"))
		partner.setMobile_phone(partner_json_object.getString("mobile_phone"));
		if(partner_json_object.has("name"))
		partner.setName(partner_json_object.getString("name"));
		if(partner_json_object.has("password"))
		partner.setPassword(partner_json_object.getString("password"));
		String payment_type = null;
		if(partner_json_object.has("paymentType"))
		payment_type = partner_json_object.getString("paymentType");
	    if(partner_json_object.has("priceRatio"))
	    partner.setPriceRatio(partner_json_object.getDouble("priceRatio"));
	    if(partner_json_object.has("providers"))
	    partner.setProviders(partner_json_object.getString("providers"));
	    if(partner_json_object.has("remember_token"))
	    partner.setRemember_token(partner_json_object.getString("remember_token"));
	    if(partner_json_object.has("updated_at"))
	    partner.setUpdated_at(new SimpleDateFormat("EEE MMM dd hh:mm:ss z yyyy").parse(partner_json_object.getString("updated_at")));		
		return partner;	
	}
}
