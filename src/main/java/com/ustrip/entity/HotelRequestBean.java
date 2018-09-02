package com.ustrip.entity;

public class HotelRequestBean extends RequestBean{
	
	private Data data;

	public Data getHotelRequestData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public class Data{
		
		private int userId;
		private int planId;
		private int hotelId;
		private int roomTypeId;
		private int bedTypeId;
		private int BoardTypeId;
		private String keyword;
		
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public int getPlanId() {
			return planId;
		}
		public void setPlanId(int planId) {
			this.planId = planId;
		}
		public int getHotelId() {
			return hotelId;
		}
		public void setHotelId(int hotelId) {
			this.hotelId = hotelId;
		}
		public int getRoomTypeId() {
			return roomTypeId;
		}
		public void setRoomTypeId(int roomTypeId) {
			this.roomTypeId = roomTypeId;
		}
		public int getBedTypeId() {
			return bedTypeId;
		}
		public void setBedTypeId(int bedTypeId) {
			this.bedTypeId = bedTypeId;
		}
		public int getBoardTypeId() {
			return BoardTypeId;
		}
		public void setBoardTypeId(int boardTypeId) {
			BoardTypeId = boardTypeId;
		}
		public String getKeyword() {
			return keyword;
		}
		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}
		
		
	}
}