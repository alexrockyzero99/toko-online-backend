package com.tokoonlinebackendservice.response;

import com.google.gson.annotations.SerializedName;

public class LoginResponse<T> {
	
	@SerializedName("Status")
    private String status;
	
	@SerializedName("Message")
    private String message;
	
    private String token;
	
    private String refreshToken;
    
    private String tokenExpDate;
    
    private String refreshTokenExpDate;
    
    private String tokenAge;
    
    private String refreshTokenAge;
    
    private T data;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getTokenExpDate() {
		return tokenExpDate;
	}
	public void setTokenExpDate(String tokenExpDate) {
		this.tokenExpDate = tokenExpDate;
	}
	public String getRefreshTokenExpDate() {
		return refreshTokenExpDate;
	}
	public void setRefreshTokenExpDate(String refreshTokenExpDate) {
		this.refreshTokenExpDate = refreshTokenExpDate;
	}
	public String getTokenAge() {
		return tokenAge;
	}
	public void setTokenAge(String tokenAge) {
		this.tokenAge = tokenAge;
	}
	public String getRefreshTokenAge() {
		return refreshTokenAge;
	}
	public void setRefreshTokenAge(String refreshTokenAge) {
		this.refreshTokenAge = refreshTokenAge;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
    
	
    
    
}
