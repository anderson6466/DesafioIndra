package com.examen.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TypeDocument")
public class TypeDocument {
	
private static final long serialVersionUID = -7322199606479196556L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
private long 	idTipoDocumento;
public long getIdTipoDocumento() {
	return idTipoDocumento;
}
public void setIdTipoDocumento(long idTipoDocumento) {
	this.idTipoDocumento = idTipoDocumento;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
private String	descripcion;
}
