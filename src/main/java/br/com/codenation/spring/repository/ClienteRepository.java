package br.com.codenation.spring.repository;

import java.util.List;

import br.com.codenation.spring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

//	– Pesquisar todos os clientes de uma determinada cidade
	public List<ClienteRepository> findByCidade(Integer cidade);

}
