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
import com.examen.models.LoginRequest;
import com.examen.models.Response;
import com.examen.models.UserRequest;
import com.examen.utils.JwtService;



@RestController
public class LoginController {
	@Autowired
	JwtService jwtService;
	
	@Autowired
	UserInterface userInterface;
	
	   @GetMapping(value = "/	")
	    public String getUser( ) {
	  
	        return "hello work";
	    }
	   
	   
	   @RequestMapping(value = "/create", method = RequestMethod.POST)
	    public ResponseEntity<Response> create(@Valid @RequestBody UserRequest user) {
		   Response res = new Response();
		  
		   if(userInterface.saveUser(user)==true) {
			   
			   
		 
			   
			   res.setMessage("Se inserto");
			   res.setStatus("200");
			   
			   
		   }
		   else {
			   res.setMessage("No se inserto");
			   res.setStatus("200");
			   
			   
		   }
		   
		
	        return new ResponseEntity(res, HttpStatus.OK);
	    }
   
	   
	   @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public ResponseEntity<Response> login(@Valid @RequestBody LoginRequest user) {
		   Response res = new Response();
		   UserRequest u = new UserRequest();
		   u.setPassword(user.getPassword());
		   u.setUser(user.getUser());
		   User resp=userInterface.LoginUser(u);
		   
		   
  if(resp.getIdUser()!=0) {
			   
	 
	  
	  res.setTokenExpiration(jwtService.TIME_OUT_SECOND/1000);
	           res.setData(resp);
			   res.setMessage("lista exitosa");
			   res.setStatus("200");
			   res.setToken(jwtService.generateToken(userInterface.LoginUser(u).getUser()));
			   
		   }
		   else {
			   res.setMessage("No se encontro");
			   res.setStatus("200");
			   
			   
		   }
	        return new ResponseEntity(res, HttpStatus.OK);
	    }
	   
}
