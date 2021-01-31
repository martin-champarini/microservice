package com.client.microservice.Model;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class Cliente {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Date fechaNacimiento;
}
