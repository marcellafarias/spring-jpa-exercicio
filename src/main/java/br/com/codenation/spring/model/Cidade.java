package br.com.codenation.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name = "cidade")
public class Cidade {

	@Column
	private Integer codigo;

	@ManyToOne
	@Column(name = "cod_estado")
	private Estado codEstado;

	@Column
	private String nome;
}
