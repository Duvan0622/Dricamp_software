package com.example.dricamp.services;

import com.example.dricamp.models.Rol;

import java.util.List;

public interface IRolServicio {
    public List<Rol> findAll();
    public Rol findById(Long id);
    public Rol save(Rol rol);
    public void delete(Long id);
}
