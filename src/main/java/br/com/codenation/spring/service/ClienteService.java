package br.com.codenation.spring.service;

import java.util.Optional;

import br.com.codenation.spring.model.Cliente;
import br.com.codenation.spring.service.interfac.ClienteServiceImpl;

public class ClienteService implements ClienteServiceImpl {

//	validar se a quantidade de caracteres do nome está entre
//	3 e 50 caracteres

	@Override
	public void validaNome(String nome) {
		int name = nome.length();
		if (name >= 3 && name <= 50) {
			System.out.println("Nome correto");
		} else {
			System.out.println("Nome incorreto");
		}
	}

	@Override
	public Optional<Cliente> buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Cliente> pesquisar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente salvar(Cliente cidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente alterar(Cliente cidade) {
		// TODO Auto-generated method stub
		return null;
	}
}
