package com.example.dricamp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "pedidoProducto")
public class PedidoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedidoProducto;

    @ManyToOne
    @JoinColumn(name = "idpedido", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idproducto", nullable = false)
    private Producto producto;

    @NotNull(message = "Requerido")
    @Column(nullable = false)
    private Integer cantidad;

    private Double valorTotal;
}
