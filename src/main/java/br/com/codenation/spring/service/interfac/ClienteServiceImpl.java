package br.com.codenation.spring.service.interfac;

import java.util.Optional;

import br.com.codenation.spring.model.Cliente;

public interface ClienteServiceImpl {

	public Optional<Cliente> buscar(Integer id);

	public Iterable<Cliente> pesquisar();

	public Cliente salvar(Cliente cidade);

	public void deletar(Integer id);

	public Cliente alterar(Cliente cidade);

	public void validaNome(String nome);

}
