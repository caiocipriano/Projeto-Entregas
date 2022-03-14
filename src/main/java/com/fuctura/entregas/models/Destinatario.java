package com.fuctura.entregas.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Destinatario {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private Long id;
	@Column(name="nome_destinatario")
	@NotNull(message="O nome não pode ser nulo")
	private String nome;
	
	@Column(name="nome_logradouro")
	@NotNull(message="O logradouro não pode ser nulo")
	private String logradouro;
	
	@Column(name="nome_numero")
	@NotNull(message="O numero não pode ser nulo")
	private String numero;
	
	@Column(name="nome_complemento")
	private String complemento;
	
	@Column(name="nome_bairro")
	private String bairro;
	
	@Embedded
	private Entrega entrega;
}
