package com.example.dricamp.services;

import com.example.dricamp.Repositories.PedidoProductoRepositorio;
import com.example.dricamp.Repositories.PedidoRepositorio;
import com.example.dricamp.models.Pedido;
import com.example.dricamp.models.PedidoProducto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PedidoProductoServicio implements IPedidoProductoServicio{
    @Autowired
    private PedidoProductoRepositorio pedidoProductoRepositorio;
    @Autowired
    private PedidoServicio pedidoServicio;

    @Override
    public List<PedidoProducto> findAll() {
        return pedidoProductoRepositorio.findAll();
    }

    @Override
    public PedidoProducto findById(Long id) {
        PedidoProducto pedidoProducto = null;
        pedidoProducto = pedidoProductoRepositorio.findById(id).orElse(null);
        return pedidoProducto;
    }

    @Override
    public PedidoProducto save(PedidoProducto pedidoProducto) {
        return pedidoProductoRepositorio.save(pedidoProducto);
    }

    @Override
    public void delete(Long id) {
        pedidoProductoRepositorio.deleteById(id);
    }

    @Override
    public List<PedidoProducto> getPPByProductoId(Long productoId) {
        return pedidoProductoRepositorio.findByProductoId(productoId);

    }

    @Override
    public List<PedidoProducto> getPPByPedidoId(Long pedidoId) {
        return pedidoProductoRepositorio.findByPedidoId(pedidoId);
    }
}
