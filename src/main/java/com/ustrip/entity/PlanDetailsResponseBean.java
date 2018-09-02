package com.ustrip.entity;

import java.util.List;

public class PlanDetailsResponseBean{
	private Integer planId;
	private String breakfastType;
	private String breakfastTypeCn;
	private Double contractPrice;
	private Double supplementPrice;
	private Integer contractAvailableAmount;
	private Integer supplementAvailableAmount;
	private Integer contractSoldAmount;	
	private Integer supplementSoldAmount;	
	private Integer aheadOfCheckin;	
	private Integer minimumLengthOfStay;	
	private Integer cancellationStatus;	
	private Integer cancellationDay;		
	private List<PlanDetails> planDetails;
	public static class PlanDetails{
		private String date;
		private Double contractPrice;
		private Double supplementPrice;
		private Integer contractAvailableAmount;
		private Integer supplementAvailableAmount;
		private Integer contractSoldAmount;	
		private Integer supplementSoldAmount;
		private Integer aheadOfCheckin;	
		private Integer minimumLengthOfStay;	
		private Integer cancellationStatus;	
		private Integer cancellationDay;
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public Double getContractPrice() {
			return contractPrice;
		}
		public void setContractPrice(Double contractPrice) {
			this.contractPrice = contractPrice;
		}
		public Double getSupplementPrice() {
			return supplementPrice;
		}
		public void setSupplementPrice(Double supplementPrice) {
			this.supplementPrice = supplementPrice;
		}
		public Integer getContractAvailableAmount() {
			return contractAvailableAmount;
		}
		public void setContractAvailableAmount(Integer contractAvailableAmount) {
			this.contractAvailableAmount = contractAvailableAmount;
		}
		public Integer getSupplementAvailableAmount() {
			return supplementAvailableAmount;
		}
		public void setSupplementAvailableAmount(Integer supplementAvailableAmount) {
			this.supplementAvailableAmount = supplementAvailableAmount;
		}
		public Integer getContractSoldAmount() {
			return contractSoldAmount;
		}
		public void setContractSoldAmount(Integer contractSoldAmount) {
			this.contractSoldAmount = contractSoldAmount;
		}
		public Integer getSupplementSoldAmount() {
			return supplementSoldAmount;
		}
		public void setSupplementSoldAmount(Integer supplementSoldAmount) {
			this.supplementSoldAmount = supplementSoldAmount;
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
		
	}
	
	public String getBreakfastTypeCn() {
		return breakfastTypeCn;
	}
	public void setBreakfastTypeCn(String breakfastTypeCn) {
		this.breakfastTypeCn = breakfastTypeCn;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getBreakfastType() {
		return breakfastType;
	}
	public void setBreakfastType(String breakfastType) {
		this.breakfastType = breakfastType;
	}
	public Double getContractPrice() {
		return contractPrice;
	}
	public void setContractPrice(Double contractPrice) {
		this.contractPrice = contractPrice;
	}
	public Double getSupplementPrice() {
		return supplementPrice;
	}
	public void setSupplementPrice(Double supplementPrice) {
		this.supplementPrice = supplementPrice;
	}
	public Integer getContractAvailableAmount() {
		return contractAvailableAmount;
	}
	public void setContractAvailableAmount(Integer contractAvailableAmount) {
		this.contractAvailableAmount = contractAvailableAmount;
	}
	public Integer getSupplementAvailableAmount() {
		return supplementAvailableAmount;
	}
	public void setSupplementAvailableAmount(Integer supplementAvailableAmount) {
		this.supplementAvailableAmount = supplementAvailableAmount;
	}
	public Integer getContractSoldAmount() {
		return contractSoldAmount;
	}
	public void setContractSoldAmount(Integer contractSoldAmount) {
		this.contractSoldAmount = contractSoldAmount;
	}
	public Integer getSupplementSoldAmount() {
		return supplementSoldAmount;
	}
	public void setSupplementSoldAmount(Integer supplementSoldAmount) {
		this.supplementSoldAmount = supplementSoldAmount;
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
	public List<PlanDetails> getPlanDetails() {
		return planDetails;
	}
	public void setPlanDetails(List<PlanDetails> planDetails) {
		this.planDetails = planDetails;
	}

	
}
