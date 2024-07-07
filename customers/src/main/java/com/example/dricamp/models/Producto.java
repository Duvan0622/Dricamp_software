package com.example.dricamp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @NotNull(message = "Requerido.")
    @NotBlank(message = "No puede estar en blanco.")
    @Size(max = 50, message = "Máximo 50 caracteres.")
    @Column(nullable = false, length = 50)
    private String estado;

    @NotNull(message = "Requerido")
    @NotBlank(message = "No puede estar en blanco")
    @Size(min = 3, max = 50, message = "Máximo 50 Caracteres")
    @Column(nullable = false, length = 50)
    private String categoria;

    @NotNull(message = "Requerido")
    @NotBlank(message = "No puede estar en blanco")
    @Size(min = 3, max = 150, message = "Máximo 150 Caracteres")
    @Column(nullable = false, length = 150)
    private String presentacion;

    @NotNull(message = "Requerido")
    @NotBlank(message = "No puede estar en blanco")
    @Size(min = 3, max = 150, message = "Máximo 150 Caracteres")
    @Column(nullable = false, length = 150)
    private String nombre;

    @NotNull(message = "Requerido")
    @Column(nullable = false)
    private Double precio;

    @NotNull(message = "Requerido")
    @NotBlank(message = "No puede estar en blanco")
    @Column(nullable = false, length = 150)
    private String fechaProduccion;

    @Column(nullable = true, length = 150)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<PedidoProducto> pedidoProducto;
}
