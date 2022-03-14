package com.fuctura.entregas.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.fuctura.entregas.enums.StatusEntrega;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Embeddable
public class Entrega {
	
	private BigDecimal taxa;
	private LocalDateTime dataPedido;
	private LocalDateTime dataFinalizacao;
	
	@Enumerated(EnumType.STRING)
	private StatusEntrega status;
}
