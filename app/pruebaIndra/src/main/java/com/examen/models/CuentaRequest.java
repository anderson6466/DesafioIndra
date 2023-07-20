package com.examen.models;

public class CuentaRequest {
private 	 String  nroCuenta;
private 	 double monto;
private 	 String description; 
private 	 String dni;
public String getNroCuenta() {
	return nroCuenta;
}
public void setNroCuenta(String nroCuenta) {
	this.nroCuenta = nroCuenta;
}

 
public double getMonto() {
	return monto;
}
public void setMonto(double monto) {
	this.monto = monto;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}

	 
}
