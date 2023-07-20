package com.examen.logica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.dto.Productos;
import com.examen.dto.DetalleUser;
import com.examen.dto.User;
import com.examen.models.CuentaRequest;
import com.examen.models.Producto;
import com.examen.models.UserFindProductsRequest;
import com.examen.models.UserRequest;
 
import com.examen.repository.ProductosRepository;
import com.examen.repository.UserDetalleRepository;
import com.examen.repository.UserRepository;
import com.examen.utils.Encryption;

@Service
public class CreateUserImplements  implements  UserInterface  {

	@Autowired
	UserRepository userRepository;
	@Autowired
	UserDetalleRepository userDetalleRepository;
	
	@Autowired
	ProductosRepository cuentaAhorroRepository;
	@Override
	public boolean saveUser(UserRequest user) {
		
	int count=	userRepository.ValidateExistUser(user.getUser(),user.getNombre(),user.getDni());
	Encryption encr = new Encryption();
	if(count==0) {
		try {
			 
			User  userDto= new User();
			userDto.setApellido(user.getApellido());
			userDto.setDni(user.getDni());
			userDto.setIdTipoDocumento(user.getIdTipoDocumento());
			userDto.setNombre(user.getNombre());
			userDto.setIdUser(user.getIdUser());
			userDto.setUser(user.getUser());
			userDto.setPassword(encr.getMD5(user.getPassword()));
			userDto.setPhone(user.getPhone());
			 
			
			DetalleUser c = new DetalleUser();
			c.setIdUser(userRepository.save(userDto).getIdUser());
			userDetalleRepository.save( c);
			return true;
		} catch (Exception e) {
			return false; 
		}
		
	
		
		
	}
	
	
		return false; 
	}



	@Override
	public User LoginUser(UserRequest user) {
		Encryption encr = new Encryption();
		try {
			 
			return userRepository.ValidarLogin(user.getUser(), encr.getMD5(user.getPassword()));
		} catch (Exception e) {
		System.out.println(e.getMessage());
			return null;
		}
		
		
	}



	@Override
	public Producto FindProduct(UserFindProductsRequest user) {
		// TODO Auto-generated method stub
		try {
			 
			Producto prod = new Producto<>();
			
			prod.setData(userRepository.ListaCuentaAhorro(user.getCodigoUnico()));
			
			return  prod;
		} catch (Exception e) {
		System.out.println(e.getMessage());
			return null;
		}
	}



	@Override
	public boolean saveCuentaAhorro(CuentaRequest cuentaRequest) {
		try {
			 	 
			Productos cuentaAhorro = new Productos();
			cuentaAhorro.setIdProducto(0);
			cuentaAhorro.setIdUser(userRepository.obtenerIdUser(cuentaRequest.getDni()));
			cuentaAhorro.setMonto(cuentaRequest.getMonto());
			cuentaAhorro.setNroCuenta(cuentaRequest.getNroCuenta());
			cuentaAhorro.setDescripcion(cuentaRequest.getDescription());
			cuentaAhorroRepository.save(cuentaAhorro);
		return true;
		
		} catch (Exception e) {
			
			
			System.out.printf(e.getMessage());
			
		return false;
		}
		
	 
	}

}
