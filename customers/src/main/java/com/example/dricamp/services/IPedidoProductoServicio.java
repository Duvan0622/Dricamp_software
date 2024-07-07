package com.example.dricamp.services;

import com.example.dricamp.models.PedidoProducto;

import java.util.List;

public interface IPedidoProductoServicio {
    public List<PedidoProducto> findAll();
    public PedidoProducto findById(Long id);
    public PedidoProducto save(PedidoProducto pedidoProducto);
    public void delete(Long id);
    List<PedidoProducto> getPPByProductoId(Long productoId);
    List<PedidoProducto> getPPByPedidoId(Long pedidoId);
}
