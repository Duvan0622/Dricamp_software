package com.example.dricamp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Entity
@Builder
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @NotNull
    @NotBlank(message = "Obligatorio")
    @Column(name = "tipodocumento", nullable = false, length = 50)
    private String tipoDocumento;

    @Column(name = "numDocumento")
    private Long numDocumento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "telefono")
    private Long telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "contrasena")
    private String contrasena;
}

