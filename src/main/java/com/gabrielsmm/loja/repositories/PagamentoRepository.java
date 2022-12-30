package com.gabrielsmm.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsmm.loja.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
	
}