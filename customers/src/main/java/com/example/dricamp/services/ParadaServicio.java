package com.example.dricamp.services;

import com.example.dricamp.Repositories.ParadaRepositorio;
import com.example.dricamp.models.Parada;
import com.example.dricamp.models.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ParadaServicio implements IParadaServicio{

    @Autowired
    private ParadaRepositorio paradaRepositorio;

    @Override
    public List<Parada> getParadas() {
        return paradaRepositorio.findAll();
    }

    @Override
    public Parada getParada(Long id) {
        Parada parada = null;
        parada = paradaRepositorio.findById(id).orElse(null);
        if (parada == null){
            return null;
        }
        return parada;
    }

    @Override
    public Parada guardarParada(Parada parada) {
        return paradaRepositorio.save(parada);
    }

    @Override
    public void delete(Long id) {
        paradaRepositorio.deleteById(id);
    }
}
