package com.example.dricamp.controllers;

import com.example.dricamp.services.IUsuarioServicio;
import com.example.dricamp.models.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioControlador {

    @Autowired
    private IUsuarioServicio usuarioServicio;

    @GetMapping("/list")
    public List<Usuario> listar(){
        return usuarioServicio.getUsuarios();
    }

    @GetMapping("/list/{id}")
    public Usuario buscarPorId(@PathVariable Long id){
        return usuarioServicio.getUsuario(id);
    }

    @PostMapping("/agregar")
    public ResponseEntity<Usuario> agregar (@RequestBody Usuario usuario){
        Usuario obj = usuarioServicio.guardarUsuario(usuario);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @PutMapping("/editar")
    public ResponseEntity<Usuario> editar(@RequestBody Usuario usuario){
        Usuario obj = usuarioServicio.getUsuario(usuario.getIdUsuario());
        if (obj != null){
            obj.setIdUsuario(usuario.getIdUsuario());
            obj.setNombre(usuario.getNombre());
            obj.setTipoDocumento(usuario.getTipoDocumento());
            obj.setNumDocumento(usuario.getNumDocumento());
            obj.setEmail(usuario.getEmail());
            obj.setTelefono(usuario.getTelefono());
            obj.setDireccion(usuario.getDireccion());
            usuarioServicio.guardarUsuario(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/rm/{id}")
    public ResponseEntity<Usuario> eliminar(@PathVariable Long id){
        Usuario obj = usuarioServicio.getUsuario(id);
        if(obj != null){
            usuarioServicio.delete(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}

