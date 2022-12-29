package com.gabrielsmm.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsmm.loja.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
}