package br.com.codenation.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemPedidoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@Column(name = "num_pedido")
	Integer numPedido;

	@ManyToOne
	@Column(name = "cod_produto")
	Integer codProduto;

}
