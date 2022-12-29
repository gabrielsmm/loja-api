package com.gabrielsmm.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsmm.loja.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
	
}