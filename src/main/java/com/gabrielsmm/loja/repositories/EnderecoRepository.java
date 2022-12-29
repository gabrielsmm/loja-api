package com.gabrielsmm.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsmm.loja.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
	
}