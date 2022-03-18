package com.fuctura.entregas.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

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
	@NotNull
	private BigDecimal taxa;
	private LocalDateTime dataPedido;
	private LocalDateTime dataFinalizacao;
	
	@Enumerated(EnumType.STRING) 
	@NotNull(message="Digite um status de entrega")
	private StatusEntrega status;
	
	@Embedded //Anotação faz com que a entidadade receba atributos de outra classe
	//@OneToOne(cascade = CascadeType.ALL)
	private Destinatario destinatario;

}
