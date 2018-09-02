package com.ustrip.entity;

import java.util.Date;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */
public class Porder implements java.io.Serializable {

	// Fields
	private int id;	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getOrderReference() {
		return orderReference;
	}
	public void setOrderReference(String orderReference) {
		this.orderReference = orderReference;
	}
	public String getOrderPReference() {
		return orderPReference;
	}
	public void setOrderPReference(String orderPReference) {
		this.orderPReference = orderPReference;
	}
	public String getCancellationReference() {
		return cancellationReference;
	}
	public void setCancellationReference(String cancellationReference) {
		this.cancellationReference = cancellationReference;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelName_zh() {
		return hotelName_zh;
	}
	public void setHotelName_zh(String hotelName_zh) {
		this.hotelName_zh = hotelName_zh;
	}
	public String getBookerFirstName() {
		return bookerFirstName;
	}
	public void setBookerFirstName(String bookerFirstName) {
		this.bookerFirstName = bookerFirstName;
	}
	public String getBookerLastName() {
		return bookerLastName;
	}
	public void setBookerLastName(String bookerLastName) {
		this.bookerLastName = bookerLastName;
	}
	public String getBookerEmail() {
		return bookerEmail;
	}
	public void setBookerEmail(String bookerEmail) {
		this.bookerEmail = bookerEmail;
	}
	public String getBookerPhone() {
		return bookerPhone;
	}
	public void setBookerPhone(String bookerPhone) {
		this.bookerPhone = bookerPhone;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getTotalNetPrice() {
		return totalNetPrice;
	}
	public void setTotalNetPrice(double totalNetPrice) {
		this.totalNetPrice = totalNetPrice;
	}
	public double getTotalOriginalNetPrice() {
		return totalOriginalNetPrice;
	}
	public void setTotalOriginalNetPrice(double totalOriginalNetPrice) {
		this.totalOriginalNetPrice = totalOriginalNetPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public byte getCancellable() {
		return cancellable;
	}
	public void setCancellable(byte cancellable) {
		this.cancellable = cancellable;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getVat() {
		return vat;
	}
	public void setVat(String vat) {
		this.vat = vat;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	private int partnerId;	
	private int productId;	

	private String provider;
	private String orderReference;
	private String orderPReference;
	private String cancellationReference;
	private int hotelId;
	private String hotelName;
	private String hotelName_zh;
	private String bookerFirstName;
	private String bookerLastName;
	private String bookerEmail;
	private String bookerPhone;
	private double totalPrice;
	private double totalNetPrice;
	private double totalOriginalNetPrice;
	private String status;
	private String currencyCode;
	private byte cancellable;
	private String code;
	private String vat;
	private String supplier;
	
	private Date checkinDate;
	private Date checkoutDate;
	private Date creationTime;
	private Date created_at;
	private Date updated_at;
	private String payment_type;
	private String payment_status;
	// Constructors
	public Date getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
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
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
}