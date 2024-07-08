package com.example.dricamp.models;

import java.util.List;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;



@Data
@Entity
@Builder
@Table(name = "vehiculo")
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehiculo;

    @NotNull
    @Size(max = 100)
    private String nombreConductor;
    
    @NotNull
    @Size(max = 10)
    private String placa;
    
    @NotNull
    @Size(max = 50)
    private String modelo;
    
    @NotNull
    private Double capacidadCarga;
    
    @NotNull
    @Size(max = 20)
    private String tipoVehiculo;
    
    @NotNull
    @Size(max = 50)
    private String marca;

   @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Parada> paradas;

    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ruta> rutas;

}
