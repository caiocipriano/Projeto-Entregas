package com.fuctura.entregas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fuctura.entregas.models.Cliente;
import com.fuctura.entregas.models.Entrega;

public interface EntregasRepository extends JpaRepository<Entrega, Long>{

}
