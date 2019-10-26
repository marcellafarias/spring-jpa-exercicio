package br.com.codenation.spring.service;

import br.com.codenation.spring.service.interfac.EstadoServiceImpl;

public class EstadoService implements EstadoServiceImpl {

	public void validaSigla(String sigla) {
		int sg = sigla.length();
		if (sg == 2) {
			System.out.println("Sigla correta");
		} else {
			System.out.println("Sigla incorreta");
		}
	}
}