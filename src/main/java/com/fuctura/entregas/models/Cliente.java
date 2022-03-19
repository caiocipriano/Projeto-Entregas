package com.fuctura.entregas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private Long id;
	@NotNull(message="Nome não pode ser vazio")
	private String nome;
	@Email
	private String email;
	@NotNull(message="Numero não pode ser vazio")
	private String telefone;
}
