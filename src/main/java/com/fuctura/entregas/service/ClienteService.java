package com.fuctura.entregas.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.fuctura.entregas.models.Cliente;
import com.fuctura.entregas.repository.ClienteRepository;

@Service
public class ClienteService {
	
	
	@Autowired
	ClienteRepository clienteRepository; 
	
	//@Autowired
	//ModelMapper modelMapper;
	
	   //Cliente HTTP methods
	
		public List<Cliente> listClients(){
			return clienteRepository.findAll();
		}
		
		public Cliente findClient(@PathVariable Long id){
			return this.clienteRepository.findById(id).get();
		}
		
		public List<Cliente> findClientByName(String nome){
			List<Cliente>clientes=this.clienteRepository.findClientByName(nome);
			return clientes;
		}
		//
		public Cliente postCliente(@RequestBody Cliente cliente) {
			//Cliente cli = modelMapper.map(cliente, Cliente.class);
			return clienteRepository.save(cliente);
		}
		
		public Cliente putCliente(@RequestBody Cliente cliente) {
			return clienteRepository.save(cliente);
		}
		
		public void deleteCliente(Long id){
			clienteRepository.deleteById(id);
		}
}
