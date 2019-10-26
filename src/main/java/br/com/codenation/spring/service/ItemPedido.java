package br.com.codenation.spring.service;

public class ItemPedido {

//	validar se as quantidades cadastradas para item_pedido
//	é maior ou igual a 1

	public boolean validaItemPedido(Integer itemPedido) {
		if (itemPedido >= 1) {
			return true;
		}
		return false;
	}

}
