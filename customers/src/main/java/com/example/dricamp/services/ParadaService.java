package com.example.dricamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dricamp.Repositories.ParadaRepository;
import com.example.dricamp.models.Parada;

import java.util.List;
import java.util.Optional;

@Service
public class ParadaService {

    @Autowired
    private ParadaRepository paradaRepository;

    public List<Parada> getAllParadas() {
        return paradaRepository.findAll();
    }

    public Optional<Parada> getParadaById(Long id) {
        return paradaRepository.findById(id);
    }

    public Parada saveParada(Parada parada) {
        return paradaRepository.save(parada);
    }

    public void deleteParada(Long id) {
        paradaRepository.deleteById(id);
    }
}
