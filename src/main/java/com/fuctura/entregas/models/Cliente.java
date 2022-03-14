package com.fuctura.entregas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Cliente {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private Long id;
	private String nome;
	private String email;
	private String telefone;
}
