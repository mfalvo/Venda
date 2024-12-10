package com.example.venda.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.venda.model.Produto;


public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}