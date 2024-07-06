package com.example.dricamp.controllers;


import com.example.dricamp.models.Parada;
import com.example.dricamp.models.Usuario;
import com.example.dricamp.services.IParadaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parada")
public class ParadaControlador {

    @Autowired
    private IParadaServicio paradaServicio;

    @GetMapping("/list")
    public List<Parada> listar(){
        return paradaServicio.getParadas();
    }

    @GetMapping("/list/{id}")
    public Parada buscarPorId(@PathVariable Long id){
        return paradaServicio.getParada(id);
    }

    @GetMapping("/agregar")
    public ResponseEntity<Parada> agregar (@RequestBody Parada parada){
        Parada obj = paradaServicio.guardarParada(parada);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @PutMapping("/editar")
    public ResponseEntity<Parada> editar(@RequestBody Parada parada){
        Parada obj = paradaServicio.getParada(parada.getId_parada());
        if (obj != null){
            obj.setId_parada(parada.getId_parada());
            obj.setCiudad(parada.getCiudad());
            obj.setDepartamento(parada.getDepartamento());
            obj.setParadaEstacion(parada.getParadaEstacion());
            paradaServicio.guardarParada(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/rm/{id}")
    public ResponseEntity<Parada> eliminar(@PathVariable Long id){
        Parada obj = paradaServicio.getParada(id);
        if(obj != null){
            paradaServicio.delete(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
