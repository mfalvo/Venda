package com.example.venda.controller;


import com.example.venda.model.Cliente;
import com.example.venda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public Iterable<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    @GetMapping("/{cpf}")
    public Optional<Cliente> buscarCliente(@PathVariable String cpf) {
        return clienteService.buscarCliente(cpf);
    }

    @PostMapping
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        return clienteService.salvarCliente(cliente);
    }

    @DeleteMapping("/{cpf}")
    public void deletarCliente(@PathVariable String cpf) {
        clienteService.deletarCliente(cpf);
    }
}
