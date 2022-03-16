package com.fuctura.entregas.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fuctura.entregas.models.Entrega;
import com.fuctura.entregas.repository.EntregasRepository;

@Service
public class EntregasService {
	
	@Autowired
	EntregasRepository repository;
	
	//Função a ser chamada no Controller como POST
	public Entrega postEntrega(@RequestBody Entrega entrega) {
		entrega.setDataPedido(LocalDateTime.now());
		entrega.setDataFinalizacao(LocalDateTime.now());
		return repository.save(entrega);
	}
	
	
}
