package com.ustrip.common;

public class CtripException extends RuntimeException {
    private static long serialVersionUID = 1L; 
    private String category; 
    private String echoToken;
	private String type;
	private String code;
	private String shortText;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	public String getEchoToken() {
		return echoToken;
	}
	public void setEchoToken(String echoToken) {
		this.echoToken = echoToken;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getShortText() {
		return shortText;
	}
	public void setShortText(String shortText) {
		this.shortText = shortText;
	}
	public CtripException(String category, String echoToken, String type, String code, String shortText) {
		super();
		this.category = category;
		this.echoToken = echoToken;
		this.type = type;
		this.code = code;
		this.shortText = shortText;
	}


}
