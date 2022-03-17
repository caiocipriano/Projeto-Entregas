package com.fuctura.entregas.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fuctura.entregas.models.Cliente;
import com.fuctura.entregas.models.Entrega;
import com.fuctura.entregas.repository.EntregasRepository;

@Service
public class EntregasService {
	
	@Autowired
	EntregasRepository repository;
	
	public List<Cliente> listClient(){
		return repository.findAll();
	}
	
	
	
	//Função a ser chamada no Controller 
	public Entrega postEntrega(@RequestBody Entrega entrega) {
		entrega.setDataPedido(LocalDateTime.now());
		entrega.setDataFinalizacao(LocalDateTime.now());
		return repository.save(entrega);
	}
	
	public Entrega putEntrega(@RequestBody Entrega entrega) {
		return repository.save(entrega);
	}
	
	
}
