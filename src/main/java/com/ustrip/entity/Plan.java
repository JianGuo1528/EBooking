package com.ustrip.entity;


public class Plan {

  private Integer planId;
  private String planName;
  private Integer hotelId;
  private Integer roomTypeId;
  private Integer bedTypeId;
  private Integer breakfastTypeId;
  private Integer maxPerson;
  private Integer status;


  public Integer getPlanId() {
    return planId;
  }

  public void setPlanId(Integer planId) {
    this.planId = planId;
  }


  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public Integer getHotelId() {
    return hotelId;
  }

  public void setHotelId(Integer hotelId) {
    this.hotelId = hotelId;
  }


  public Integer getRoomTypeId() {
    return roomTypeId;
  }

  public void setRoomTypeId(Integer roomTypeId) {
    this.roomTypeId = roomTypeId;
  }


  public Integer getBedTypeId() {
    return bedTypeId;
  }

  public void setBedTypeId(Integer bedTypeId) {
    this.bedTypeId = bedTypeId;
  }


  public Integer getBreakfastTypeId() {
    return breakfastTypeId;
  }

  public void setBreakfastTypeId(Integer breakfastTypeId) {
    this.breakfastTypeId = breakfastTypeId;
  }


  public Integer getMaxPerson() {
    return maxPerson;
  }

  public void setMaxPerson(Integer maxPerson) {
    this.maxPerson = maxPerson;
  }


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

}
