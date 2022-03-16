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
@Embeddable
public class Destinatario {
	
	
	@Column(name="nome_destinatario")
	@NotNull(message="O nome não pode ser nulo")
	private String nome;
	
	@Column(name="logradouro_destinatario")
	@NotNull(message="O logradouro não pode ser nulo")
	private String logradouro;
	
	@Column(name="numero_destinatario")
	@NotNull(message="O numero não pode ser nulo")
	private String numero;
	
	@Column(name="complemento_destinatario")
	private String complemento;
	
	@Column(name="bairro_destinatario")
	private String bairro;
	

}
