package com.example.dricamp.Repositories;

import com.example.dricamp.models.PedidoProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PedidoProductoRepositorio extends JpaRepository<PedidoProducto, Long> {
    @Query("SELECT pp FROM PedidoProducto pp WHERE pp.producto.idProducto = :productoId")
    List<PedidoProducto> findByProductoId(Long productoId);

    @Query("SELECT pp FROM PedidoProducto pp WHERE pp.pedido.idPedido = :pedidoId")
    List<PedidoProducto> findByPedidoId(Long pedidoId);
}
