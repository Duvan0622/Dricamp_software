package com.example.dricamp.services;

import com.example.dricamp.Repositories.RolRepositorio;
import com.example.dricamp.Repositories.RutaParadaRepositorio;
import com.example.dricamp.models.Rol;
import com.example.dricamp.models.RutaParada;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RutaParadaServicio implements IRutaParadaServicio{
    @Autowired
    private RutaParadaRepositorio rutaParadaRepositorio;

    @Override
    public List<RutaParada> findAll() {
        return rutaParadaRepositorio.findAll();
    }

    @Override
    public RutaParada findById(Long id) {
        RutaParada rutaParada = null;
        rutaParada = rutaParadaRepositorio.findById(id).orElse(null);
        return rutaParada;
    }

    @Override
    public RutaParada save(RutaParada rutaParada) {
        return rutaParadaRepositorio.save(rutaParada);
    }

    @Override
    public void delete(Long id) {
        rutaParadaRepositorio.deleteById(id);
    }
}
