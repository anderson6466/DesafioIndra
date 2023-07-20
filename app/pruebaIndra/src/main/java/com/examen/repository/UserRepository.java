package com.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.dto.Productos;
import com.examen.dto.User;
import com.examen.models.Cuentas;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
	@Query( value = "select count(*) from user where user= :usuario  and nombre= :name   or  dni = :nroDoc ", nativeQuery = true)
     public int  ValidateExistUser(String usuario,String name,String nroDoc );
	@Query( value = "select u from User u where u.user= :usuario  and u.password=:pass ")
    public User  ValidarLogin(String usuario,String pass );
	
	
	
	@Query(  value = "select u from Productos u   where u.idUser= :idUser ")
    public List<Productos>  ListaCuentaAhorro(long idUser );
	
	
	@Query(value="select id_user from user where dni=:dniuser", nativeQuery = true)
	public long  obtenerIdUser(String dniuser );
}
