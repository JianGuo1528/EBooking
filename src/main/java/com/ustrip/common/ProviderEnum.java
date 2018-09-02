package com.ustrip.common;

public enum ProviderEnum {
	HotelBeds("HotelBeds"),
	Innstant("Innstant"),
	Tourico("Tourico"),
	HBSi("HBSi"),
	Expedia("Expedia"),
	Derby("Derby"),
	Priceline("Priceline"),
	Bonotel("Bonotel"),
	EBooking("EBooking");

	private String name;

	private ProviderEnum(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
