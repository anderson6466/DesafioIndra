package com.examen.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
@Table(name = "Productos")
public class Productos {
	public long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}
	public String  getTipoproducto() {
		return Tipoproducto;
	}
	public void setTipoproducto(String tipoproducto) {
		Tipoproducto = tipoproducto;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProducto    ;
	 
	@Column(nullable = true)
	private long idUser  ;
	
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	@Column(nullable = true)
	private String Tipoproducto  ;
	@Column(nullable = true)
	private String descripcion  ;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Column(nullable = true)
	@DecimalMin("0.00")
	private double monto;
	@Column(nullable = true)
	 
	private String  nroCuenta;

	public String getNroCuenta() {
		return nroCuenta;
	}
	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

}
