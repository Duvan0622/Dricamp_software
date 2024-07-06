package com.example.dricamp.services;

import com.example.dricamp.models.Parada;
import java.util.List;

public interface IParadaServicio {
    public List<Parada> getParadas();
    public Parada getParada(Long id);
    public Parada guardarParada(Parada parada);
    public void delete(Long id);
}
