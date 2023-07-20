package com.examen.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.*;
import com.examen.dto.User;
import com.examen.logica.UserInterface;
import com.examen.models.CuentaRequest;
import com.examen.models.LoginRequest;
import com.examen.models.Response;
import com.examen.models.UserFindProductsRequest;
import com.examen.models.UserRequest;
import com.examen.utils.JwtService;



@RestController
public class ProductosController {
	@Autowired
	JwtService jwtService;
	
	@Autowired
	UserInterface userInterface;
	
  
	   @RequestMapping(value = "/consulta", method = RequestMethod.POST)
	    public ResponseEntity<Response> consulta(@Valid @RequestBody UserFindProductsRequest user) {
		   Response res = new Response();
		  
		   
			   res.setData(userInterface.FindProduct(user).getData());
			   res.setMessage("Lista de Productos");
			   res.setStatus("200");
			   
		 
		   
		
	        return new ResponseEntity(res, HttpStatus.OK);
	    }
   
	   @RequestMapping(value = "/registrarProducto", method = RequestMethod.POST)
	    public ResponseEntity<Response> registrarCuentaAhorro(@Valid @RequestBody CuentaRequest cuentaRequest) {
		   Response res = new Response();
		  
		   if(userInterface.saveCuentaAhorro(cuentaRequest)==true)
			   
		   {
			   
			 
			   res.setMessage("Registro Exitoso");
			   res.setStatus("200");
			   
			 
			   
		   }
			  
		   else {
			   
			   res.setMessage("Error al registrar");
			   res.setStatus("200");
		   }   
		 
		   
		
	        return new ResponseEntity(res, HttpStatus.OK);
	    }
	  
}
