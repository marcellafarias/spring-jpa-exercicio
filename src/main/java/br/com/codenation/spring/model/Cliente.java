package br.com.codenation.spring.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;

	@Column
	private String nome;

	@Column
	private String endereco;

	@Column
	private Integer cep;

	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;

	@ManyToOne
	@Column(name = "cod_cidade")
	private Cidade codCidade;

}
