package com.examen.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.dto.DetalleUser;
import com.examen.dto.User;
import com.examen.models.Cuentas;
@Repository
public interface UserDetalleRepository extends JpaRepository<DetalleUser, Long> {
	
	
	@Transactional
	@Modifying
	@Query(	value="update detalle_user  set id_cuenta_ahorro= :idCuentaAhorro  where id_detalle_user= :idDetalleUser",nativeQuery = true)
	public int updateProducto(long idCuentaAhorro, long idDetalleUser);
	
}
