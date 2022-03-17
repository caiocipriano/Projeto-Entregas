package com.fuctura.entregas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fuctura.entregas.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}
