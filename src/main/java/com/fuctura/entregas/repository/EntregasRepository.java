package com.fuctura.entregas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fuctura.entregas.models.Entrega;

@Repository
public interface EntregasRepository extends JpaRepository<Entrega, Long>{

}
