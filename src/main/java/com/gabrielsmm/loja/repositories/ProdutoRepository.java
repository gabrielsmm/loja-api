package com.gabrielsmm.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsmm.loja.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
