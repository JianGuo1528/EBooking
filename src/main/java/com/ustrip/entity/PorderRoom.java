package com.ustrip.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Arthur
 */
public class PorderRoom implements java.io.Serializable {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getOrderReference() {
		return orderReference;
	}
	public void setOrderReference(String orderReference) {
		this.orderReference = orderReference;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCancelAmount() {
		return cancelAmount;
	}
	public void setCancelAmount(double cancelAmount) {
		this.cancelAmount = cancelAmount;
	}
	public String getCancelPolicies() {
		return cancelPolicies;
	}
	public void setCancelPolicies(String cancelPolicies) {
		this.cancelPolicies = cancelPolicies;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getSupplierReference() {
		return supplierReference;
	}
	public void setSupplierReference(String supplierReference) {
		this.supplierReference = supplierReference;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	private int id;
	private int roomId;
	private String orderReference;
	private int quantity;
	private String name;
	private double cancelAmount;
	private String cancelPolicies;
	private String paymentType;
	private String boardName;
	private double netPrice;
	private String supplier;
	private Date createdAt;
	private String supplierReference;
	private String comments;
}