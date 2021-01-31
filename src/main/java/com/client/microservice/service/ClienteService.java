package com.client.microservice.service;

import com.client.microservice.Model.Cliente;
import com.client.microservice.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente getCliente(String nombre) {
        return clienteRepository.findByNombre(nombre);
    }
}
