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
public interface ProductosRepository extends JpaRepository<Productos, Long> {
	
	
	
}
