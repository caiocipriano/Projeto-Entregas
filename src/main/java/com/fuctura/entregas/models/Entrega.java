package com.fuctura.entregas.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import com.fuctura.entregas.enums.StatusEntrega;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Entrega {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private Long id;
	private BigDecimal taxa;
	private LocalDateTime dataPedido;
	private LocalDateTime dataFinalizacao;
	
	@Enumerated(EnumType.STRING) 
	private StatusEntrega status;
	
	@Embedded //Anotação que faz com que a entidadade receba atributos de outra classe
	private Destinatario destinatario;

}
