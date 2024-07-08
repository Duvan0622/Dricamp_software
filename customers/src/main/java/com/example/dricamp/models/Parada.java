package com.example.dricamp.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

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
    @Size(max = 100)
    private String estacion;

    @OneToMany(mappedBy = "parada", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<RutaParada> rutaParadas;
}
