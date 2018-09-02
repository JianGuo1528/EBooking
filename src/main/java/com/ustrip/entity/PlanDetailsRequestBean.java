package com.ustrip.entity;

import java.util.List;

public class PlanDetailsRequestBean{
	private Integer planId;
	private Integer ignoreDiff;
	private Double contractPrice;
	private Double supplementPrice;
	private Integer contractAvailableAmount;
	private Integer supplementAvailableAmount;
	private Integer aheadOfCheckin;	
	private Integer minimumLengthOfStay;	
	private Integer cancellationStatus;	
	private Integer cancellationDay;		
	private List<DateArray> dateArray;
	public static class DateArray{
		private String date;
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}		
		
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public Integer getIgnoreDiff() {
		return ignoreDiff;
	}
	public void setIgnoreDiff(Integer ignoreDiff) {
		this.ignoreDiff = ignoreDiff;
	}
	public Double getSupplementPrice() {
		return supplementPrice;
	}
	public void setSupplementPrice(Double supplementPrice) {
		this.supplementPrice = supplementPrice;
	}
	public Integer getSupplementAvailableAmount() {
		return supplementAvailableAmount;
	}
	public void setSupplementAvailableAmount(Integer supplementAvailableAmount) {
		this.supplementAvailableAmount = supplementAvailableAmount;
	}
	public Integer getAheadOfCheckin() {
		return aheadOfCheckin;
	}
	public void setAheadOfCheckin(Integer aheadOfCheckin) {
		this.aheadOfCheckin = aheadOfCheckin;
	}
	public Integer getMinimumLengthOfStay() {
		return minimumLengthOfStay;
	}
	public void setMinimumLengthOfStay(Integer minimumLengthOfStay) {
		this.minimumLengthOfStay = minimumLengthOfStay;
	}
	public Integer getCancellationStatus() {
		return cancellationStatus;
	}
	public void setCancellationStatus(Integer cancellationStatus) {
		this.cancellationStatus = cancellationStatus;
	}
	public Integer getCancellationDay() {
		return cancellationDay;
	}
	public void setCancellationDay(Integer cancellationDay) {
		this.cancellationDay = cancellationDay;
	}
	public List<DateArray> getDateArray() {
		return dateArray;
	}
	public void setDateArray(List<DateArray> dateArray) {
		this.dateArray = dateArray;
	}
	public Double getContractPrice() {
		return contractPrice;
	}
	public void setContractPrice(Double contractPrice) {
		this.contractPrice = contractPrice;
	}
	public Integer getContractAvailableAmount() {
		return contractAvailableAmount;
	}
	public void setContractAvailableAmount(Integer contractAvailableAmount) {
		this.contractAvailableAmount = contractAvailableAmount;
	}
	

	
}
