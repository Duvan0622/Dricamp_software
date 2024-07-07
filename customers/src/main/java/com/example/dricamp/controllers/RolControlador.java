package com.example.dricamp.controllers;

import com.example.dricamp.models.Rol;
import com.example.dricamp.services.IRolServicio;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rol")
public class RolControlador {
    @Autowired
    private IRolServicio iRolServicio;

    @Operation(summary = "Obtiene todos los rol")
    @GetMapping
    public List<Rol> findAll(){
        return iRolServicio.findAll();
    }

    @Operation(summary = "Obtiene un rol por su ID")
    @GetMapping("/{id}")
    public Rol findById(@PathVariable Long id){
        return iRolServicio.findById(id);
    }

    @Operation(summary = "Realiza la creación de un rol")
    @PostMapping
    public ResponseEntity<Rol> create (@Valid @RequestBody Rol rol){
        Rol obj = iRolServicio.save(rol);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Modifica un rol")
    @PutMapping
    public ResponseEntity<Rol> update(@Valid @RequestBody Rol rol){
        Rol obj = iRolServicio.findById(rol.getIdRol());
        if (obj != null){
            obj.setIdRol(rol.getIdRol());
            obj.setNombre(rol.getNombre());
            iRolServicio.save(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un rol")
    @DeleteMapping("/{id}")
    public ResponseEntity<Rol> delete(
            @Parameter(description = "Id del rol que se desea eliminar")
            @PathVariable("Id") Long id){
        Rol obj = iRolServicio.findById(id);
        if(obj != null){
            iRolServicio.delete(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

}
