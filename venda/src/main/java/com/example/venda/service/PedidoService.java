package com.example.venda.service;


import com.example.venda.model.Pedido;
import com.example.venda.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Iterable<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPedido(Long numeroPedido) {
        return pedidoRepository.findById(numeroPedido);
    }

    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public void deletarPedido(Long numeroPedido) {
        pedidoRepository.deleteById(numeroPedido);
    }
}
