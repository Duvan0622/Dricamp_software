package com.example.dricamp.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "rutaParada")
public class RutaParada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRutaParada;

    @ManyToOne
    @JoinColumn(name = "idParada", nullable = false)
    private Parada parada;

    @ManyToOne
    @JoinColumn(name = "idRuta", nullable = false)
    private Ruta ruta;
}
