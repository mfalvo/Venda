package com.example.venda.controller;


import com.example.venda.model.Produto;
import com.example.venda.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public Iterable<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }

    @GetMapping("/{codigo}")
    public Optional<Produto> buscarProduto(@PathVariable Long codigo) {
        return produtoService.buscarProduto(codigo);
    }

    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto) {
        return produtoService.salvarProduto(produto);
    }

    @DeleteMapping("/{codigo}")
    public void deletarProduto(@PathVariable Long codigo) {
        produtoService.deletarProduto(codigo);
    }
}
