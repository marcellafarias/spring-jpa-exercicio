package br.com.codenation.spring.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.codenation.spring.model.Pedido;
import br.com.codenation.spring.repository.PedidoRepository;

@RestController
@RequestMapping("/pedido")
public class PedidoControler {

	@Autowired
	private PedidoRepository pedidoRepository;

	@PostMapping
	public Pedido salvar(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido);

	}

	@GetMapping("/{id}")
	public Optional<Pedido> buscar(@PathVariable Integer id) {
		return pedidoRepository.findById(id);

	}

	@GetMapping
	public List<Pedido> pesquisar() {
		return pedidoRepository.findAll();
	}

	@DeleteMapping("/{id}")
	public List<Pedido> deletar(@PathVariable Integer id) {
		pedidoRepository.deleteById(id);
		return pesquisar();
	}

}
