package com.gabrielsmm.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsmm.loja.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
}