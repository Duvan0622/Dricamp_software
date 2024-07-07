package com.example.dricamp.services;

import com.example.dricamp.models.Pedido;

import java.time.LocalDate;
import java.util.List;

public interface IPedidoServicio {
    public List<Pedido> findAll();
    public Pedido findById(Long id);
    public Pedido save(Pedido pedido);
    public void delete(Long id);
    List<Pedido> getPedidoByFecha(LocalDate date);
    List<Pedido> getPedidoByIdCliente(Long id);
    List<Pedido> getPedidoByEstado(String estado);
}
