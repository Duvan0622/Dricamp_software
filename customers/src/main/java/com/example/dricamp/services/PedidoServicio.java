package com.example.dricamp.services;

import com.example.dricamp.Repositories.PedidoProductoRepositorio;
import com.example.dricamp.Repositories.PedidoRepositorio;
import com.example.dricamp.models.Pedido;
import com.example.dricamp.models.PedidoProducto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class PedidoServicio implements IPedidoServicio{
    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Override
    public List<Pedido> findAll() {
        return pedidoRepositorio.findAll();
    }

    @Override
    public Pedido findById(Long id) {
        Pedido pedido = null;
        pedido = pedidoRepositorio.findById(id).orElse(null);
        return pedido;
    }

    @Override
    public Pedido save(Pedido pedido) {
        return pedidoRepositorio.save(pedido);
    }

    @Override
    public void delete(Long id) {
        pedidoRepositorio.deleteById(id);
    }

    @Override
    public List<Pedido> getPedidoByFecha(LocalDate date) {
        return pedidoRepositorio.findByFechaCreacion(date);
    }

    @Override
    public List<Pedido> getPedidoByIdCliente(Long id) {
        return pedidoRepositorio.findByClienteId(id);
    }

    @Override
    public List<Pedido> getPedidoByEstado(String estado) {
        return pedidoRepositorio.findByEstado(estado);
    }
}
