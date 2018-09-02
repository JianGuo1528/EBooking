package com.ustrip.common;

public enum ErrorCodeEnum {
	ER1001("System error."),
	ER1002("Invalid parameters."),
	ER1003("Unauthorized user."),

	ER1401("Warnning! The values are not consistent in selected dates. Are you sure to overwrite them with new value?"),
	ER1501("Login failure."),
	ER1502("Logout failure."),
	ER1503("User does not exist."),
	ER1504("User update failure."),
	ER1505("Password reset failure."),
	ER1506("Token build failure."),
	;

	private String msg;

	private ErrorCodeEnum(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}
