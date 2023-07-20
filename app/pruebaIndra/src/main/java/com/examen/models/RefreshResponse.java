package com.examen.models;

public class RefreshResponse {
	 public String getTokenAntiguo() {
		return tokenAntiguo;
	}
	public void setTokenAntiguo(String tokenAntiguo) {
		this.tokenAntiguo = tokenAntiguo;
	}
	public String getTokenNuevo() {
		return tokenNuevo;
	}
	public void setTokenNuevo(String tokenNuevo) {
		this.tokenNuevo = tokenNuevo;
	}
	private String tokenAntiguo;
	 private String tokenNuevo;
	 
}
