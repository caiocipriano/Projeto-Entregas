package com.fuctura.entregas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuctura.entregas.models.Cliente;
import com.fuctura.entregas.service.ClienteService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/")
public class ClienteController {

	@Autowired
	ClienteService service;
	
	@GetMapping("/findAllClients")
	@Operation(summary="List all clientes")
	public List<Cliente> findAll(){
		return service.listClients();
	}
	
	@GetMapping(value ="/findCliente/{id}")
	@Operation(summary="Find by ID")
	public Cliente findId(@PathVariable Long id) {
		return service.findClient(id);
	}
	@GetMapping(value ="/findClienteByName/{nome}")
	@Operation(summary="Find by Name")
	public List<Cliente> findByName(@PathVariable String nome) {
		return service.findClientByName(nome);
	}
	
	@PostMapping("/postCliente")
	@Operation(summary="Insert Cliente informations")
	public Cliente post(@Valid @RequestBody Cliente cliente) {
		return service.postCliente(cliente);
	}
	
	@PutMapping("/putCliente")
	@Operation(summary="Update Cliente informations")
	public void put(@RequestBody Cliente cliente) {
		service.putCliente(cliente);
	}
	
	@DeleteMapping("/deleteCliente")
	@Operation(summary="Delete Cliente By Id")
	public void delete(@PathVariable Long id) {
		service.deleteCliente(id);
	}

}
