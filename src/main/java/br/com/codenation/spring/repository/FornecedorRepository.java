package br.com.codenation.spring.repository;

import java.util.List;

import br.com.codenation.spring.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {

//	Fazer um método que retorne os fornecedores em que o
//	limite de crédito está acima de 10.000

	public List<FornecedorRepository> findByLimiteCreditoGreaterThan(Integer limiteCredito);

//	– Fazer um método que retorne os fornecedores em que o
//	limite esteja abaixo de 100

	public List<FornecedorRepository> findByLimiteCreditoLessThan(Integer limiteCredito);

}
