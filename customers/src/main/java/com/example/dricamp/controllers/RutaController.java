package com.example.dricamp.controllers;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.dricamp.models.Ruta;
import com.example.dricamp.services.RutaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rutas")
public class RutaController {

    @Autowired
    private RutaService rutaService;

    @Operation(summary = "Obtiene todos las rutas")
    @GetMapping
    public List<Ruta> getAllRutas() {
        return rutaService.getAllRutas();
    }

    @Operation(summary = "Obtiene un ruta por su ID")
    @GetMapping("/{id}")
    public Ruta getRutaById(@PathVariable Long id) {
       return  rutaService.getRutaById(id);
    }

    @Operation (summary = "Realiza la creación de una ruta")
    @PostMapping
    public ResponseEntity<Ruta> saveRuta(@RequestBody Ruta ruta) {
        Ruta obj = rutaService.saveRuta(ruta);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un ruta")
    @DeleteMapping("/{id}")
    public ResponseEntity<Ruta> deleteRuta(@PathVariable Long id) {
        Ruta obj = rutaService.getRutaById(id);
        if(obj != null){
            rutaService.deleteRuta(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Modifica una ruta")
    @PutMapping
    public ResponseEntity<Ruta> update(@Valid @RequestBody Ruta ruta){
        Ruta obj = rutaService.getRutaById(ruta.getIdRuta());
        if (obj != null){
            obj.setIdRuta(ruta.getIdRuta());
            obj.setFechaDestino(ruta.getFechaDestino());
            obj.setFechaSalida(ruta.getFechaSalida());
            rutaService.saveRuta(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
