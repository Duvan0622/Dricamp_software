package com.example.dricamp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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

    @NotNull(message = "Requerido.")
    @NotBlank(message = "No puede estar en blanco.")
    @Size(max = 50, message = "Máximo 50 caracteres.")
    @Column(name = "tipodocumento", nullable = false, length = 50)
    private String tipoDocumento;

    @NotNull(message = "Requerido")
    @Min(value = 1, message = "Debe ser un número válido")
    @Digits(integer = 12, fraction = 0, message = "Debe tener como máximo 12 dígitos")
    @Column(name = "numDocumento", nullable = false)
    private Long numDocumento;

    @NotNull(message = "Requerido")
    @NotBlank(message = "No puede estar en blanco")
    @Size(min = 3, max = 50, message = "Máximo 50 Caracteres")
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @NotNull(message = "Requerido")
    @Min(value = 1, message = "Debe ser un telefono válido")
    @Digits(integer = 16, fraction = 0, message = "Ingresa un telefono válido")
    @Column(name = "telefono", nullable = false)
    private Long telefono;

    @NotNull(message = "Requerido")
    @NotBlank(message = "No puede estar en blanco")
    @Size(min = 10, message = "El email debe tener mas de 10 caracteres")
    @Email(message = "El email tiene un formato no válido")
    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @NotNull(message = "Requerido")
    @NotBlank(message = "No puede estar en blanco")
    @Column(name = "direccion", nullable = false, length = 200)
    private String direccion;

    @NotNull(message = "Requerido")
    @NotBlank(message = "Requerido")
    @Size(min = 8, max = 8, message = "La contraseña debe ser de 8 caracteres")
    @Column(name = "contrasena", nullable = false, length = 8)
    private String contrasena;
}

