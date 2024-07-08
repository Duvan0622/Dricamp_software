package com.example.dricamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.dricamp.models.Parada;
import com.example.dricamp.services.ParadaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paradas")
public class ParadaController {

    @Autowired
    private ParadaService paradaService;

    @GetMapping
    public List<Parada> getAllParadas() {
        return paradaService.getAllParadas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Parada> getParadaById(@PathVariable Long id) {
        Optional<Parada> parada = paradaService.getParadaById(id);
        return parada.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Parada saveParada(@RequestBody Parada parada) {
        return paradaService.saveParada(parada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParada(@PathVariable Long id) {
        paradaService.deleteParada(id);
        return ResponseEntity.ok().build();
    }
}
