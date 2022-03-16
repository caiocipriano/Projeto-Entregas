package com.fuctura.entregas.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuctura.entregas.models.Cliente;
import com.fuctura.entregas.models.Entrega;
import com.fuctura.entregas.repository.EntregasRepository;

@RestController
@RequestMapping("/")
public class EntregaController  {
	
	@Autowired
	private EntregasRepository repository;
	
	//@PostMapping("/post")
	//public Cliente postCliente(@RequestBody Cliente cliente) {
	//	return repository.save(cliente);
//	}
	
	@PostMapping("/post")
	public Entrega postEntrega(@RequestBody Entrega entrega) {
		entrega.setDataPedido(LocalDateTime.now());
		entrega.setDataFinalizacao(LocalDateTime.now());
		return repository.save(entrega);
	}
}
