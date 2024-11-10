package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.model.Produto;
import com.example.demo.persistence.ProdutoRepository;

@DataJpaTest
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    public void quandoSalvarProduto_entaoEncontrarPorNomeEId() {
        Produto produto = new Produto();
        produto.setNome("Maça");
        produto.setPreco(3.50); 

        produtoRepository.save(produto);

        Optional<Produto> encontradoPorId = produtoRepository.findById(produto.getId());
        assertTrue(encontradoPorId.isPresent());
        assertEquals("Maça", encontradoPorId.get().getNome());

        Optional<Produto> encontradoPorNome = produtoRepository.findByNome("Maça");
        assertTrue(encontradoPorNome.isPresent());
        assertEquals("Maça", encontradoPorNome.get().getNome());
    }
}
