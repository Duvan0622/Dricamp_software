package com.example.dricamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dricamp.Repositories.RutaRepository;
import com.example.dricamp.models.Ruta;

import java.util.List;
import java.util.Optional;

@Service
public class RutaService {

    @Autowired
    private RutaRepository rutaRepository;

    public List<Ruta> getAllRutas() {
        return rutaRepository.findAll();
    }

    public Ruta getRutaById(Long id) {
        return rutaRepository.findById(id).orElse(null);
    }

    public Ruta saveRuta(Ruta ruta) {
        return rutaRepository.save(ruta);
    }

    public void deleteRuta(Long id) {
        rutaRepository.deleteById(id);
    }
}
