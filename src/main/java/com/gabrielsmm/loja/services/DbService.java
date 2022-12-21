package com.gabrielsmm.loja.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielsmm.loja.domain.Categoria;
import com.gabrielsmm.loja.repositories.CategoriaRepository;

@Service
public class DbService {
	
	@Autowired
	private CategoriaRepository catRepo;
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		this.catRepo.saveAll(Arrays.asList(cat1, cat2));
	}
	
}
