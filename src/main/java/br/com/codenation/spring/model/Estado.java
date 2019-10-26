package br.com.codenation.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "estado")
public class Estado {

	@Column
	private Integer codigo;

	@Column
	private String sigla;

	@Column
	private String nome;

}
