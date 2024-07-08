package com.example.dricamp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    @NotNull(message = "Requerido.")
    @NotBlank(message = "No puede estar en blanco.")
    @Size(max = 50, message = "Máximo 50 caracteres.")
    @Column(nullable = false, length = 50)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Usuario cliente;

    @ManyToOne
    @JoinColumn(name = "idTransportista", nullable = true)
    private Transportista transportista;

    @Column(nullable = false)
    private LocalDate fechaPedido;

    private Double valorTotal;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<PedidoProducto> productos;

    @PrePersist
    @PreUpdate
    private void calcularValorTotal() {
        if (productos != null && !productos.isEmpty()) {
            this.valorTotal = productos.stream()
                    .mapToDouble(PedidoProducto::getValorTotal)
                    .sum();
        } else {
            this.valorTotal = 2.0;
        }
    }
}


