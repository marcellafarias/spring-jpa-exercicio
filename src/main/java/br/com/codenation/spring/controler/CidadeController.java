package br.com.codenation.spring.controler;

import br.com.codenation.spring.model.Cidade;
import br.com.codenation.spring.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

    @Autowired
    private CidadeRepository cidadeRepository;

    @PostMapping
    public Cidade salvar(@RequestBody Cidade cidade) {
        return cidadeRepository.save(cidade);
        // usamos save quando usamos POST ou PUT, a magia acontece com a annotation
    }

    @GetMapping("/{id}")
    public Optional<Cidade> buscar(@PathVariable Integer id) {
        return cidadeRepository.findById(id);
        // Path variable signfica que eu vou receber essa variavel pela url
        // usa o Optional para evitar nullpointer
        //passando o endpoint id como parametro para buscar um específico
    }

    @GetMapping
    public List<Cidade> pesquisar() {

        return cidadeRepository.findAll();
    }

    @PutMapping
    public Cidade atualizar(@RequestBody Cidade cidade) {
        return cidadeRepository.save(cidade);
    }


    @DeleteMapping("/{id}")
    public List<Cidade> deletar(@PathVariable Integer id) {
        cidadeRepository.deleteById(id);
        return pesquisar();
    }

}
