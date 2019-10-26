package br.com.codenation.spring.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "itemPedido")
public class ItemPedido {

	@EmbeddedId
	private ItemPedidoPK id;

	@Column
	private Integer quantidade;

	@Column
	private Double valorUnitario;

}
