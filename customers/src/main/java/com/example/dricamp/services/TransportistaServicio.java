package com.example.dricamp.services;

import com.example.dricamp.Repositories.PedidoProductoRepositorio;
import com.example.dricamp.Repositories.PedidoRepositorio;
import com.example.dricamp.Repositories.TransportistaRepositorio;
import com.example.dricamp.models.Pedido;
import com.example.dricamp.models.Transportista;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TransportistaServicio implements ITransportistaServicio{
    @Autowired
    private TransportistaRepositorio transportistaRepositorio;


    @Override
    public List<Transportista> findAll() {
        return transportistaRepositorio.findAll();
    }

    @Override
    public Transportista findById(Long id) {
        Transportista transportista = null;
        transportista = transportistaRepositorio.findById(id).orElse(null);
        return transportista;
    }

    @Override
    public Transportista save(Transportista transportista) {
        return transportistaRepositorio.save(transportista);
    }

    @Override
    public void delete(Long id) {
        transportistaRepositorio.deleteById(id);
    }
}
