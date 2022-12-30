package com.gabrielsmm.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsmm.loja.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	
}