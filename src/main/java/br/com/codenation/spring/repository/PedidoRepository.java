package br.com.codenation.spring.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codenation.spring.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

//	Consulta os pedidos dentro de determinado prazo

	public List<Pedido> findByNumeroBetween(LocalDate inicio, LocalDate fim);

//	Fazer um método que retorne todos os pedidos de
//	determinado vendedor e cliente

	public List<Pedido> findByCodVendedorAndCodCliente(Integer vendedor, Integer cliente);

}
