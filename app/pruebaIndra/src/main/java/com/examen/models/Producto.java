package com.examen.models;

import java.util.List;

public class Producto<T> {
	
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	T data;	
public List<Cuentas> listaProductos;

public List<Cuentas> getListaProductos() {
	return listaProductos;
}

public void setListaProductos(List<Cuentas> listaProductos) {
	this.listaProductos = listaProductos;
}
}
