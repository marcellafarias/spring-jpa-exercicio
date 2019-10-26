package br.com.codenation.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "estado")
public class Estado {

	@Id
	private Integer codigo;

	@Column
	private String sigla;

	@Column
	private String nome;

}
