package com.example.dricamp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;



@Data
@Entity
@Builder
@Table(name = "ruta")
@AllArgsConstructor
@NoArgsConstructor
public class Ruta {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehiculo;
     
    @Column(name = "fecha_salida")
    private LocalDateTime fechaSalida;

    @Column(name = "fecha_destino")
    @FutureOrPresent(message = "La fecha destino debe ser mayor o igual a la fecha de salida")
    private LocalDateTime fechaDestino;

    @Column(name = "nombre_transportista", length = 90)
    @Size(max = 90, message = "El nombre del transportista no debe ser mayor a 90 caracteres")
    private String nombreTransportista;

    @OneToMany(mappedBy = "ruta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Parada> paradas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    @PrePersist
    @PreUpdate
    private void validateDates() {
        if (fechaDestino.isBefore(fechaSalida)) {
            throw new IllegalArgumentException("La fecha destino no puede ser anterior a la fecha de salida");
        }
    }
}
