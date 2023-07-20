package com.examen.logica;

import com.examen.dto.User;
import com.examen.models.CuentaRequest;
import com.examen.models.Producto;
import com.examen.models.UserFindProductsRequest;
import com.examen.models.UserRequest;

public interface UserInterface {
	
public boolean	saveUser(UserRequest user);
public User	LoginUser(UserRequest user);
public Producto	FindProduct(UserFindProductsRequest user);

public boolean saveCuentaAhorro (CuentaRequest cuentaRequest);

}
