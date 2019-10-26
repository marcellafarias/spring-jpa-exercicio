package br.com.codenation.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "fornecedor")
public class Fornecedor {

    @Id
    private Integer codigo;

    @Column
    private String nome;

    @Column(name = "limite_credito")
    private Integer limiteCredito;

    @Column(name = "perc_comissao")
    private Double percComissao;

    @ManyToOne
    private Cidade codCidade;

}
