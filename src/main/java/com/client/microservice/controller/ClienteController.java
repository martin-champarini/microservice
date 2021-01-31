package com.client.microservice.controller;

import com.client.microservice.Model.Cliente;
import com.client.microservice.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping(path = "/kpideclientes")
    public ResponseEntity<Cliente> getKpiDeClientes(@RequestParam String nombre) throws ParseException {
        Cliente cliente = clienteService.getCliente(nombre);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }


}
