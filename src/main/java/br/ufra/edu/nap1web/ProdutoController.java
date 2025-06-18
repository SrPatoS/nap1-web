package br.ufra.edu.nap1web;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtos;

    @GetMapping
    public List<Produto> listar() {
        return produtos.findAll();
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto) {
        return produtos.save(produto);
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        return produtos.findById(id).orElseThrow(() -> new EntityNotFoundException("Produto não encontrado com o ID: " + id));
    }

    @PutMapping("/{id}")
    public Produto atualizar(@RequestBody Produto produto, @PathVariable Long id) {
        Produto res = produtos.findById(id).orElseThrow(() -> new EntityNotFoundException("Produto não encontrado com o ID: " + id));

        res.setNome(produto.getNome());
        res.setDescricao(produto.getDescricao());
        res.setPreco(produto.getPreco());
        res.setQuantidade(produto.getQuantidade());
        return produtos.save(res);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        Optional<Produto> produto = produtos.findById(id);
        if (produto.isPresent()) {
            produtos.deleteById(id);
            return "Produto com ID " + id + " foi deletado com sucesso.";
        } else {
            throw new EntityNotFoundException("Produto não encontrado com o ID: " + id);
        }
    }
}
