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
@Table(name = "TipoProducto")
public class TipoProducto {
	public long getIdTipoProdcuto() {
		return idTipoProdcuto;
	}
	public void setIdTipoProdcuto(long idTipoProdcuto) {
		this.idTipoProdcuto = idTipoProdcuto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public long getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTipoProdcuto    ;
	 
	@Column(nullable = true)
	private String descripcion  ;
	@Column(nullable = true)
	private long codigoProducto    ; 

}
