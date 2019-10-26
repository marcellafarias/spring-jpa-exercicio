package br.com.codenation.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.codenation.spring.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	public Produto findByDescricao(String descricao);

}
