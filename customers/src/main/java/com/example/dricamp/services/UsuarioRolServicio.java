package com.example.dricamp.services;

import com.example.dricamp.Repositories.UsuarioRolRepositorio;
import com.example.dricamp.models.UsuarioRol;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UsuarioRolServicio implements IUsuarioRolServicio{

    @Autowired
    private UsuarioRolRepositorio usuarioRolRepositorio;


    @Override
    public List<UsuarioRol> findAll() {
        return usuarioRolRepositorio.findAll();
    }

    @Override
    public UsuarioRol findById(Long id) {
        UsuarioRol usuarioRol = null;
        usuarioRol =  usuarioRolRepositorio.findById(id).orElse(null);
        return usuarioRol;
    }

    @Override
    public UsuarioRol save(UsuarioRol usuarioRol) {
        return usuarioRolRepositorio.save(usuarioRol);
    }

    @Override
    public void delete(Long id) {
        usuarioRolRepositorio.deleteById(id);
    }
}
