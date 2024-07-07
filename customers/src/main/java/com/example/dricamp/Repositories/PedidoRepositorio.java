package com.example.dricamp.Repositories;

import com.example.dricamp.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

    @Query("SELECT p FROM Pedido p WHERE p.fechaPedido = :fechaPedido")
    List<Pedido> findByFechaCreacion(LocalDate fechaPedido);

    @Query("SELECT p FROM Pedido p WHERE p.cliente.idUsuario = :idCliente")
    List<Pedido> findByClienteId(Long idCliente);

    @Query("SELECT p FROM Pedido p WHERE p.estado = :estado")
    List<Pedido> findByEstado(String estado);
}
