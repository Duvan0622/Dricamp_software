package com.example.dricamp.controllers;

import com.example.dricamp.models.UsuarioRol;
import com.example.dricamp.models.Vehiculo;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.dricamp.models.Parada;
import com.example.dricamp.services.ParadaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/paradas")
public class ParadaController {

    @Autowired
    private ParadaService paradaService;

    @Operation(summary = "Obtiene todos las paradas")
    @GetMapping
    public List<Parada> getAllParadas() {
        return paradaService.getAllParadas();
    }

    @Operation(summary = "Obtiene una parada por su ID")
    @GetMapping("/{id}")
    public Parada getParadaById(@PathVariable Long id) {
        return paradaService.getParadaById(id);
    }

    @Operation(summary = "Realiza la creación de una parada")
    @PostMapping
    public ResponseEntity<Parada> saveParada(@RequestBody Parada parada) {
        Parada obj = paradaService.saveParada(parada);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un parada")
    @DeleteMapping("/{id}")
    public ResponseEntity<Parada> deleteParada(@PathVariable Long id) {
        Parada obj = paradaService.getParadaById(id);
        if(obj != null){
            paradaService.deleteParada(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Modifica una parada")
    @PutMapping
    public ResponseEntity<Parada> update(@Valid @RequestBody Parada parada){
        Parada obj = paradaService.getParadaById(parada.getIdParada());
        if (obj != null){
            obj.setIdParada(parada.getIdParada());
            obj.setDepartamento(parada.getDepartamento());
            obj.setCiudad(parada.getCiudad());
            obj.setEstacion(parada.getEstacion());
            paradaService.saveParada(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

}
