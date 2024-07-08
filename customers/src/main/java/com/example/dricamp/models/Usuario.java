package com.example.dricamp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;
import java.util.Set;

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

    @Size(max = 50, message = "Máximo 50 caracteres.")
    @Column(nullable = true, length = 50)
    private String tipoDocumento;


    @Min(value = 1, message = "Debe ser un número válido")
    @Digits(integer = 12, fraction = 0, message = "Debe tener como máximo 12 dígitos")
    @Column(nullable = true)
    private Long numDocumento;

    @NotNull(message = "Requerido")
    @NotBlank(message = "No puede estar en blanco")
    @Size(min = 3, max = 50, message = "Máximo 50 Caracteres")
    @Column(nullable = false, length = 50)
    private String nombre;

    @NotNull(message = "Requerido")
    @NotBlank(message = "No puede estar en blanco")
    @Size(min = 3, max = 50, message = "Máximo 50 Caracteres")
    @Column(nullable = false, length = 50)
    private String apellido;

    @Min(value = 1, message = "Debe ser un telefono válido")
    @Digits(integer = 16, fraction = 0, message = "Ingresa un telefono válido")
    @Column(nullable = true)
    private Long telefono;

    @NotNull(message = "Requerido")
    @NotBlank(message = "No puede estar en blanco")
    @Size(min = 10, message = "El email debe tener mas de 10 caracteres")
    @Email(message = "El email tiene un formato no válido")
    @Column(nullable = false, length = 150)
    private String email;

    @NotBlank(message = "No puede estar en blanco")
    @Column(nullable = true, length = 200)
    private String direccion;

    @NotNull(message = "Requerido")
    @NotBlank(message = "Requerido")
    @Size(min = 8, max = 8, message = "La contraseña debe ser de 8 caracteres")
    @Column(nullable = false, length = 8)
    private String contrasena;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UsuarioRol>  usuarioRols;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Producto> productos;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Pedido> pedidos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Transportista> transportistas;
}

