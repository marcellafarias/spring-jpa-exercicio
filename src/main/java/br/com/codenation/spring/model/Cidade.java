package br.com.codenation.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "cidade")
public class Cidade {

	@Id
	private Integer codigo;

	@ManyToOne
	private Estado codEstado;

	@Column
	private String nome;
}
