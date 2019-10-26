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

import br.com.codenation.spring.model.Produto;
import br.com.codenation.spring.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoControler {

	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
		// usamos save quando usamos POST
	}

	@GetMapping("/{id}")
	public Optional<Produto> buscar(@PathVariable Integer id) {
		return produtoRepository.findById(id);
		// Path variable signfica que eu vou receber essa variavel pela url
		// usa o Optional para evitar nullpointer
	}

	@GetMapping
	public List<Produto> pesquisar() {
		return produtoRepository.findAll();
	}

	@DeleteMapping("/{id}")
	public List<Produto> deletar(@PathVariable Integer id) {
		produtoRepository.deleteById(id);
		return pesquisar();
	}

}
