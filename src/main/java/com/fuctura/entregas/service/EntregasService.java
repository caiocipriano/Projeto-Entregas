package com.fuctura.entregas.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.fuctura.entregas.models.Cliente;
import com.fuctura.entregas.models.Entrega;
import com.fuctura.entregas.repository.ClienteRepository;
import com.fuctura.entregas.repository.EntregasRepository;

@Service
public class EntregasService {
	
	@Autowired
	EntregasRepository entregasRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	//Cliente HTTP methods
	
	public List<Cliente> listClients(){
		return clienteRepository.findAll();
	}
	
	public Cliente findClient(@PathVariable Long id){
		return this.clienteRepository.findById(id).get();
	}
	
	public Cliente postCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente putCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public void deleteCliente(Long id){
		clienteRepository.deleteById(id);
	}
	
	
	//Entrega HTTP methods
	
	public List<Entrega> listEntregas(){
		return entregasRepository.findAll();
	}
	
	public Entrega findEntrega(@PathVariable Long id) {
		return entregasRepository.findById(id).get();
	}
	
	public Entrega postEntrega(@RequestBody Entrega entrega) {
		entrega.setDataPedido(LocalDateTime.now());
		entrega.setDataFinalizacao(LocalDateTime.now());
		return entregasRepository.save(entrega);
	}
	
	
	//Update Delivery Status and End Date and Time
	public Entrega putEntrega(@RequestBody Entrega entrega) {
		return entregasRepository.save(entrega);
	}
	
	public void deleteEntrega(Long id) {
		entregasRepository.deleteById(id);
	}
	
	
}
