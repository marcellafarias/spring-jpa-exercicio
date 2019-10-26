package br.com.codenation.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostPersist;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "pedido")
@EntityListeners(AuditingEntityListener.class)
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numero;

	@Column
	private Date prazo;

	// Usa-se o fetch eager para tornar a busca lazy, mas não é obrigatório
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_cliente")
	private Cliente codCliente;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_fornecedor")
	private Fornecedor codFornecedor;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_vendedor")
	private Vendedor codVendedor;

	@PostPersist
	public void aposInserir() {
		System.out.println("Novo pedido criado!");
	}

}
