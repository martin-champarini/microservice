package com.client.microservice.controller;

import com.client.microservice.Model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

@RestController
public class ClienteController {


    @GetMapping("/kpideclientes")
    public ResponseEntity<Cliente> getKpiDeClientes() throws ParseException {
        Date date = DateFormat.getDateInstance().parse("20/11/1984");
        Cliente cliente = Cliente.builder()
                .nombre("Martin")
                .apellido("Champarini")
                .edad(36)
                .fechaNacimiento(date)
                .build();
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }


}
