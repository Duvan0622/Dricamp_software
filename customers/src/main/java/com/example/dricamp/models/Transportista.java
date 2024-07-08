package com.example.dricamp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transportista")
public class Transportista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransportista;

    @NotNull(message = "Requerido")
    @NotBlank(message = "No puede estar en blanco")
    @Column(nullable = false, length = 50)
    private String categoriaLicencia;

    @NotNull
    @Column(nullable = false)
    private Long numeroLicencia;

    @ManyToOne
    @JoinColumn(name = "fk_idUsuario", nullable = true)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idVehiculo", nullable = true)
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "idRuta", nullable = true)
    private Ruta ruta;

    @OneToMany(mappedBy = "transportista", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Pedido> pedidos;
}
