package com.gabrielsmm.loja.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielsmm.loja.dto.CidadeDTO;
import com.gabrielsmm.loja.dto.EstadoDTO;
import com.gabrielsmm.loja.services.CidadeService;
import com.gabrielsmm.loja.services.EstadoService;

@RestController
@RequestMapping(value="/estados")
public class EstadoResource {
	
	@Autowired
	private EstadoService service;
	
	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping
	public ResponseEntity<List<EstadoDTO>> findAll() {
		List<EstadoDTO> listDto = service.findAll().stream().map(EstadoDTO::new).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@GetMapping(value="/{estadoId}/cidades")
	public ResponseEntity<List<CidadeDTO>> findCidades(@PathVariable Integer estadoId) {
		List<CidadeDTO> listDto = cidadeService.findByEstado(estadoId).stream().map(CidadeDTO::new).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
}
