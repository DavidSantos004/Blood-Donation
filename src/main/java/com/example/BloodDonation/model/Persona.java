package com.example.BloodDonation.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    private String nombre;

    private String apellido;

    private String numeroDocumento;

    private String tipoUsuario;

    private String grupoSanguineo;

    private String rhFactor;

    private Date fechaNacimiento;

    private String direccion;

    private String telefono;

    private String email;

    private Date ultimaDonacion;

    private String cargo;
}
