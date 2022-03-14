package com.fuctura.entregas.models;

import javax.persistence.Embedded;

public class Destinatario {
	
	private String nome;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	
	@Embedded
	private Entrega entrega;
}
