package com.gabrielsmm.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsmm.loja.domain.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
	
}