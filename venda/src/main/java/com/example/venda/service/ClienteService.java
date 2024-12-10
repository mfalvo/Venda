package com.example.venda.service;

import com.example.venda.model.Cliente;
import com.example.venda.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Iterable<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarCliente(String cpf) {
        return clienteRepository.findById(cpf);
    }

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletarCliente(String cpf) {
        clienteRepository.deleteById(cpf);
    }
}

