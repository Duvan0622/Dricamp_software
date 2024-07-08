package com.example.dricamp.services;

import com.example.dricamp.models.RutaParada;

import java.util.List;

public interface IRutaParadaServicio {
    public List<RutaParada> findAll();
    public RutaParada findById(Long id);
    public RutaParada save(RutaParada rol);
    public void delete(Long id);
}
