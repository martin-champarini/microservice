package com.client.microservice.repository;

import com.client.microservice.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findByNombre(String nombre);
}
