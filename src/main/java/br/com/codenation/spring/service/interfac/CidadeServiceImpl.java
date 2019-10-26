package br.com.codenation.spring.service.interfac;

import java.util.Optional;

import br.com.codenation.spring.model.Cidade;

public interface CidadeServiceImpl {

	public Optional<Cidade> buscar(Integer id);

	public Iterable<Cidade> pesquisar();

	public Cidade salvar(Cidade cidade);

	public void deletar(Integer id);

	public Cidade alterar(Cidade cidade);

}
