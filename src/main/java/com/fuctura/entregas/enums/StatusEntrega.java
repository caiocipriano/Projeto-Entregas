package com.fuctura.entregas.enums;

import lombok.AllArgsConstructor;


public enum StatusEntrega {
	
	PENDENTE("Pendente"),
	FINALIZADA("Finalizada"),
	CANCELADA("Cancelada");
	
	private String StatusEntrega;
	
	private StatusEntrega(String Servico) {
		this.StatusEntrega = StatusEntrega; 
	}
}
