package com.ustrip.entity;

public class RequestBean{
	private Auth auth;
	private Data data;
	
	public Auth getAuth() {
		return auth;
	}
	public void setAuth(Auth auth) {
		this.auth = auth;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public class Auth{
		private String username;
		private String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
	public class Data{
		String ipAddress;
		private String originalRequest;

		public String getIpAddress() {
			return ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getOriginalRequest() {
			return originalRequest;
		}

		public void setOriginalRequest(String originalRequest) {
			this.originalRequest = originalRequest;
		}
		
		
	}	
}
