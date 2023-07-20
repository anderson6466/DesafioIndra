package com.examen.models;

public class Response<T> {
	 private String status;
	 private String token;
	 private long tokenExpirationSegundos;
	   public long getTokenExpirationSegundos() {
		return tokenExpirationSegundos;
	}
	public void setTokenExpiration(long tokenExpiration) {
		this.tokenExpirationSegundos = tokenExpiration;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
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
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	private String message;
	    T data;
}
