package com.example.venda.controller;


import com.example.venda.model.Pedido;
import com.example.venda.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public Iterable<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    @GetMapping("/{numeroPedido}")
    public Optional<Pedido> buscarPedido(@PathVariable Long numeroPedido) {
        return pedidoService.buscarPedido(numeroPedido);
    }

    @PostMapping
    public Pedido salvarPedido(@RequestBody Pedido pedido) {
        return pedidoService.salvarPedido(pedido);
    }

    @DeleteMapping("/{numeroPedido}")
    public void deletarPedido(@PathVariable Long numeroPedido) {
        pedidoService.deletarPedido(numeroPedido);
    }
}

