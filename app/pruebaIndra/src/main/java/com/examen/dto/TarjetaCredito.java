package com.examen.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "TarjetaCredito")
public class TarjetaCredito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTarjetaCredito      ;
	public long getIdTarjetaCredito() {
		return idTarjetaCredito;
	}
	public void setIdTarjetaCredito(long idTarjetaCredito) {
		this.idTarjetaCredito = idTarjetaCredito;
	}
	public long getNroTarjetaCredito() {
		return nroTarjetaCredito;
	}
	public void setNroTarjetaCredito(long nroTarjetaCredito) {
		this.nroTarjetaCredito = nroTarjetaCredito;
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
	@Column(nullable = true)
	private long nroTarjetaCredito     ;
	@Column(nullable = true)
	private double monto                 ;
	@Column(nullable = true)
	private String description	         ;
}
