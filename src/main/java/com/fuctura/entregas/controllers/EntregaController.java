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

import com.fuctura.entregas.models.Entrega;
import com.fuctura.entregas.service.EntregasService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/")
public class EntregaController  {
	
	@Autowired
	private EntregasService service;
	
	@GetMapping("/findAll")
	@Operation(summary="List all Entregas")
	public List<Entrega>findAll(){
		return service.listEntregas();
	}
	
	@GetMapping(value ="/{id}")
	@Operation(summary="Find by ID")
	public Entrega findById(@PathVariable Long id) {
		return service.findEntrega(id);
	}
	
	@PostMapping("/post")
	@Operation(summary="Insert Entrega informations")
	public Entrega post(@Valid @RequestBody Entrega entrega) {
		return service.postEntrega(entrega);
	}
	
	@PutMapping("/put")
	@Operation(summary="Update Entrega information like Status and dataFinalizacao")
	public void put(@RequestBody Entrega entrega) {
		service.putEntrega(entrega);
	}
	
	@DeleteMapping("/delete")
	@Operation(summary="Delete Entrega By Id")
	public void delete(@PathVariable Long id) {
		service.deleteEntrega(id);
	}

	


}
