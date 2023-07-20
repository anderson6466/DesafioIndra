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
@Table(name = "DetalleUser")
public class DetalleUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long idDetalleUser      ;
	public long getIdDetalleUser() {
		return idDetalleUser;
	}
	public void setIdDetalleUser(long idDetalleUser) {
		this.idDetalleUser = idDetalleUser;
	}
	public long getIdCuentaAhorro() {
		return IdCuentaAhorro;
	}
	public void setIdCuentaAhorro(long idCuentaAhorro) {
		IdCuentaAhorro = idCuentaAhorro;
	}
	public long getIdTrajetaCredito() {
		return IdTrajetaCredito;
	}
	public void setIdTrajetaCredito(long idTrajetaCredito) {
		IdTrajetaCredito = idTrajetaCredito;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	@Column(nullable = true)
	private long IdCuentaAhorro	  ;
	@Column(nullable = true)
	private long IdTrajetaCredito   ;
	@Column(nullable = true)
	private long idUser             ;
}
