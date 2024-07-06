package com.example.dricamp.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "ruta")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ruta;

    @Column(name = "id_transportista")
    private Long id_transportista;

    @Column(name = "fecha_salida")
    private String fecha_salida;

    @Column(name = "fecha_destino")
    private String fecha_destino;
}
