package com.example.dricamp.services;

import com.example.dricamp.models.Transportista;

import java.util.List;

public interface ITransportistaServicio {
    public List<Transportista> findAll();
    public Transportista findById(Long id);
    public Transportista save(Transportista transportista);
    public void delete(Long id);
}
