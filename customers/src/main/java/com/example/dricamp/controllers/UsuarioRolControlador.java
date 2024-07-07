package com.example.dricamp.controllers;

import com.example.dricamp.models.UsuarioRol;
import com.example.dricamp.services.IUsuarioRolServicio;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarioRol")
public class UsuarioRolControlador {
    @Autowired
    private IUsuarioRolServicio usuarioRolServicio;

    @Operation(summary = "Obtiene todos los usuariosRol")
    @GetMapping
    public List<UsuarioRol> findAll(){
        return usuarioRolServicio.findAll();
    }

    @Operation(summary = "Obtiene un usuarioRol por su ID")
    @GetMapping("/{id}")
    public UsuarioRol findById(@PathVariable Long id){
        return usuarioRolServicio.findById(id);
    }

    @Operation(summary = "Realiza la creación de un usuarioRol")
    @PostMapping
    public ResponseEntity<UsuarioRol> create (@Valid @RequestBody UsuarioRol usuarioRol){
        UsuarioRol obj = usuarioRolServicio.save(usuarioRol);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Modifica un usuarioRol")
    @PutMapping
    public ResponseEntity<UsuarioRol> update(@Valid @RequestBody UsuarioRol usuarioRol){
        UsuarioRol obj = usuarioRolServicio.findById(usuarioRol.getIdUsuarioRol());
        if (obj != null){
            obj.setIdUsuarioRol(usuarioRol.getIdUsuarioRol());
            obj.setRol(usuarioRol.getRol());
            obj.setUsuario(usuarioRol.getUsuario());
            usuarioRolServicio.save(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un usuarioRol")
    @DeleteMapping("/{id}")
    public ResponseEntity<UsuarioRol> delete(
            @Parameter(description = "Id del usuarioRol que se desea eliminar")
            @PathVariable("Id") Long id){
        UsuarioRol obj = usuarioRolServicio.findById(id);
        if(obj != null){
            usuarioRolServicio.delete(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
