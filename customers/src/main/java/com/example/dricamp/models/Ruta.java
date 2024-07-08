package com.example.dricamp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;


@Data
@Entity
@Builder
@Table(name = "ruta")
@AllArgsConstructor
@NoArgsConstructor
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRuta;
     
    @Column(name = "fecha_salida")
    private LocalDateTime fechaSalida;

    @Column(name = "fecha_destino")
    @FutureOrPresent(message = "La fecha destino debe ser mayor o igual a la fecha de salida")
    private LocalDateTime fechaDestino;

    @OneToMany(mappedBy = "ruta", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<RutaParada> rutaParadas;

    @OneToMany(mappedBy = "ruta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Transportista> transportistas;

    @PrePersist
    @PreUpdate
    private void validateDates() {
        if (fechaDestino.isBefore(fechaSalida)) {
            throw new IllegalArgumentException("La fecha destino no puede ser anterior a la fecha de salida");
        }
    }
}
