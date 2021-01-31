package com.client.microservice.controller;

import com.client.microservice.Model.Cliente;
import com.client.microservice.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/kpideclientes")
    public ResponseEntity<Cliente> getKpiDeClientes(@RequestParam String nombre) throws ParseException {
        Cliente cliente = clienteService.getCliente(nombre);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }


}
