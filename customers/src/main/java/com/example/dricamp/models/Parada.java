package com.example.dricamp.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Entity
@Builder
@Table(name = "parada")
@AllArgsConstructor
@NoArgsConstructor
public class Parada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParada;
    
    @NotNull
    @Size(max = 100)
    private String ciudad;
    
    @NotNull
    @Size(max = 100)
    private String departamento;
    
    @NotNull
    private Boolean paraEstacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ruta_id")
    private Ruta ruta;
}
