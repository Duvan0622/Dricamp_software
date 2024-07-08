package com.example.dricamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.dricamp.models.Ruta;
import com.example.dricamp.services.RutaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rutas")
public class RutaController {

    @Autowired
    private RutaService rutaService;

    @GetMapping
    public List<Ruta> getAllRutas() {
        return rutaService.getAllRutas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ruta> getRutaById(@PathVariable Long id) {
        Optional<Ruta> ruta = rutaService.getRutaById(id);
        return ruta.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Ruta saveRuta(@RequestBody Ruta ruta) {
        return rutaService.saveRuta(ruta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRuta(@PathVariable Long id) {
        rutaService.deleteRuta(id);
        return ResponseEntity.ok().build();
    }
}
