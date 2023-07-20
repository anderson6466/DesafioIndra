package com.examen.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.models.RefreshResponse;

 

 

@RestController
public class ApiResource {
    private final static String JWT_HEADER_NAME = "Authorization";

    @GetMapping("/tokenRefresh")
    public RefreshResponse testApi(HttpServletRequest request, HttpServletResponse response) {
        
    	RefreshResponse rsp= new RefreshResponse();
    	
    	String oldJwt = request.getHeader(JWT_HEADER_NAME);
        String newJwt = response.getHeader(JWT_HEADER_NAME);
        rsp.setTokenAntiguo(oldJwt);
        rsp.setTokenNuevo(newJwt);

        return rsp;
    }
}
