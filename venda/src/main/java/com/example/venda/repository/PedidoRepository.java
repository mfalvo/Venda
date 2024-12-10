package com.example.venda.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.venda.model.Pedido;


public interface PedidoRepository extends CrudRepository<Pedido, Long> {
}
