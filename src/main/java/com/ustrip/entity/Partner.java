package com.ustrip.entity;

import java.util.Date;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */
public class Partner implements java.io.Serializable {

	// Fields
	private int id;	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getPriceRatio() {
		return priceRatio;
	}
	public void setPriceRatio(double priceRatio) {
		this.priceRatio = priceRatio;
	}
	public String getProviders() {
		return providers;
	}
	public void setProviders(String providers) {
		this.providers = providers;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getRemember_token() {
		return remember_token;
	}
	public void setRemember_token(String remember_token) {
		this.remember_token = remember_token;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public byte getAdmin() {
		return admin;
	}
	public void setAdmin(byte admin) {
		this.admin = admin;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getContact_person() {
		return contact_person;
	}
	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}
	public String getCompany_phone() {
		return company_phone;
	}
	public void setCompany_phone(String company_phone) {
		this.company_phone = company_phone;
	}
	public String getCompany_address() {
		return company_address;
	}
	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getApi_password() {
		return api_password;
	}
	public void setApi_password(String api_password) {
		this.api_password = api_password;
	}

	public String getCountry_Code() {
		return Country_Code;
	}
	public void setCountry_Code(String country_Code) {
		Country_Code = country_Code;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	private String email;
	private String name;
	private String password;
	private double priceRatio;
	private String providers;
	private double balance;

	private String remember_token;
	private byte active;
	private byte admin;
	private String mobile_phone;
	private String contact_person;
	private String company_phone;
	private String company_address;
	private String company_name;
	private String avatar;
	private String api_password;
	private String Country_Code;
	private String channel;
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	private Date created_at;
	private Date updated_at;
	@Override
	public String toString() {
		return "Partner [id=" + id + ", email=" + email + ", name=" + name
				+ ", password=" + password + ", priceRatio=" + priceRatio
				+ ", providers=" + providers + ", balance=" + balance
				+ ", remember_token=" + remember_token + ", active=" + active
				+ ", admin=" + admin + ", mobile_phone=" + mobile_phone
				+ ", contact_person=" + contact_person + ", company_phone="
				+ company_phone + ", company_address=" + company_address
				+ ", company_name=" + company_name + ", avatar=" + avatar
				+ ", api_password=" + api_password + ", Country_Code="
				+ Country_Code + ", channel=" + channel + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}
	
	
}