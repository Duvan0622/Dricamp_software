package com.example.dricamp.controllers;

import com.example.dricamp.models.RutaParada;
import com.example.dricamp.services.IRutaParadaServicio;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rutaParada")
public class RutaParadadControlador {
    @Autowired
    private IRutaParadaServicio rutaParadaServicio;

    @Operation(summary = "Obtiene todos las rutaParada")
    @GetMapping
    public List<RutaParada> findAll(){
        return rutaParadaServicio.findAll();
    }

    @Operation(summary = "Obtiene un rutaParada por su ID")
    @GetMapping("/{id}")
    public RutaParada findById(@PathVariable Long id){
        return rutaParadaServicio.findById(id);
    }

    @Operation(summary = "Realiza la creación de una rutaParada")
    @PostMapping
    public ResponseEntity<RutaParada> create (@Valid @RequestBody RutaParada rutaParada){
        RutaParada obj = rutaParadaServicio.save(rutaParada);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Modifica una rutaParada")
    @PutMapping
    public ResponseEntity<RutaParada> update(@Valid @RequestBody RutaParada rutaParada){
        RutaParada obj = rutaParadaServicio.findById(rutaParada.getIdRutaParada());
        if (obj != null){
            obj.setIdRutaParada(rutaParada.getIdRutaParada());
            obj.setRuta(rutaParada.getRuta());
            obj.setParada(rutaParada.getParada());
            rutaParadaServicio.save(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Elimina una rutaParada")
    @DeleteMapping("/{id}")
    public ResponseEntity<RutaParada> delete(
            @Parameter(description = "Id del producto que se desea eliminar")
            @PathVariable("Id") Long id){
        RutaParada obj = rutaParadaServicio.findById(id);
        if(obj != null){
            rutaParadaServicio.delete(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

}
