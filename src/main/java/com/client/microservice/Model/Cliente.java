package com.client.microservice.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Date fechaNacimiento;
}
