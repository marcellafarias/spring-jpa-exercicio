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

import br.com.codenation.spring.model.Vendedor;
import br.com.codenation.spring.repository.VendedorRepository;

@RestController
@RequestMapping("/vendedor")
public class VendedorControler {

	@Autowired
	private VendedorRepository vendedorRepository;

	@PostMapping
	public Vendedor salvar(@RequestBody Vendedor vendedor) {
		return vendedorRepository.save(vendedor);
		// usamos save quando usamos POST
	}

	@GetMapping("/{id}")
	public Optional<Vendedor> buscar(@PathVariable Integer id) {
		return vendedorRepository.findById(id);
		// Path variable signfica que eu vou receber essa variavel pela url
		// usa o Optional para evitar nullpointer
	}

	@GetMapping
	public List<Vendedor> pesquisar() {
		return vendedorRepository.findAll();
	}

	@DeleteMapping("/{id}")
	public List<Vendedor> deletar(@PathVariable Integer id) {
		vendedorRepository.deleteById(id);
		return pesquisar();
	}

}
