package com.gabrielsmm.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsmm.loja.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
}