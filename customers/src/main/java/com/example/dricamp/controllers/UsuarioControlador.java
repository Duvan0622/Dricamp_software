package com.example.dricamp.controllers;

import com.example.dricamp.models.Producto;
import com.example.dricamp.services.IUsuarioServicio;
import com.example.dricamp.models.Usuario;
import java.util.List;
import java.util.Set;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioControlador {

    @Autowired
    private IUsuarioServicio usuarioServicio;

    @Operation(summary = "Obtiene todos los usuarios")
    @GetMapping
    public List<Usuario> findAll(){
        return usuarioServicio.findAll();
    }

    @Operation(summary = "Obtiene un usuario por su ID")
    @GetMapping("/{id}")
    public Usuario findById(@PathVariable Long id){
        return usuarioServicio.findById(id);
    }

    @Operation(summary = "Realiza la creación de un usuario")
    @PostMapping
    public ResponseEntity<Usuario> create (@Valid @RequestBody Usuario usuario){
        Usuario obj = usuarioServicio.save(usuario);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Modifica un usuario")
    @PutMapping
    public ResponseEntity<Usuario> update(@Valid @RequestBody Usuario usuario){
        Usuario obj = usuarioServicio.findById(usuario.getIdUsuario());
        if (obj != null){
            obj.setIdUsuario(usuario.getIdUsuario());
            obj.setNombre(usuario.getNombre());
            obj.setApellido(usuario.getApellido());
            obj.setTipoDocumento(usuario.getTipoDocumento());
            obj.setNumDocumento(usuario.getNumDocumento());
            obj.setEmail(usuario.getEmail());
            obj.setTelefono(usuario.getTelefono());
            obj.setDireccion(usuario.getDireccion());
            usuarioServicio.save(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un usuario")
    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> delete(
            @Parameter(description = "Id del usuario que se desea eliminar")
            @PathVariable("Id") Long id){
        Usuario obj = usuarioServicio.findById(id);
        if(obj != null){
            usuarioServicio.delete(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}

