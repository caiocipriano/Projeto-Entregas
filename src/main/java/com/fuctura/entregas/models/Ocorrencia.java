package com.fuctura.entregas.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Ocorrencia {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private Long id;
	private String descricao;
	private LocalDateTime dataRegistro;
	
	
	
}
