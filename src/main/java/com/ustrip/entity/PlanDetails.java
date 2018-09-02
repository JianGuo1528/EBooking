package com.ustrip.entity;

import java.io.Serializable;
import java.util.Date;

public class PlanDetails implements Serializable {

	private int id;
	private int plan_id;
	private int hotelId;
	private Double contract_price;
	private Double supplement_price;
	private Date sale_date;
	private int day_of_week;
	private int contract_available_amount;
	private int supplement_available_amount;
	private int contract_sold_amount;
	private int supplement_sold_amount;
	private Date updated_at;
	private int cancellation_status;
	private int cancellation_day;
	private int ahead_of_checkin;
	private int minimum_length_of_stay;

	public int getDay_of_week() {
		return day_of_week;
	}

	public void setDay_of_week(int day_of_week) {
		this.day_of_week = day_of_week;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public Double getContract_price() {
		return contract_price;
	}

	public void setContract_price(Double contract_price) {
		this.contract_price = contract_price;
	}

	public Double getSupplement_price() {
		return supplement_price;
	}

	public void setSupplement_price(Double supplement_price) {
		this.supplement_price = supplement_price;
	}

	public Date getSale_date() {
		return sale_date;
	}

	public void setSale_date(Date sale_date) {
		this.sale_date = sale_date;
	}

	public int getContract_available_amount() {
		return contract_available_amount;
	}

	public void setContract_available_amount(int contract_available_amount) {
		this.contract_available_amount = contract_available_amount;
	}

	public int getSupplement_available_amount() {
		return supplement_available_amount;
	}

	public void setSupplement_available_amount(int supplement_available_amount) {
		this.supplement_available_amount = supplement_available_amount;
	}

	public int getContract_sold_amount() {
		return contract_sold_amount;
	}

	public void setContract_sold_amount(int contract_sold_amount) {
		this.contract_sold_amount = contract_sold_amount;
	}

	public int getSupplement_sold_amount() {
		return supplement_sold_amount;
	}

	public void setSupplement_sold_amount(int supplement_sold_amount) {
		this.supplement_sold_amount = supplement_sold_amount;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public int getCancellation_status() {
		return cancellation_status;
	}

	public void setCancellation_status(int cancellation_status) {
		this.cancellation_status = cancellation_status;
	}

	public int getCancellation_day() {
		return cancellation_day;
	}

	public void setCancellation_day(int cancellation_day) {
		this.cancellation_day = cancellation_day;
	}

	public int getAhead_of_checkin() {
		return ahead_of_checkin;
	}

	public void setAhead_of_checkin(int ahead_of_checkin) {
		this.ahead_of_checkin = ahead_of_checkin;
	}

	public int getMinimum_length_of_stay() {
		return minimum_length_of_stay;
	}

	public void setMinimum_length_of_stay(int minimum_length_of_stay) {
		this.minimum_length_of_stay = minimum_length_of_stay;
	}

}
