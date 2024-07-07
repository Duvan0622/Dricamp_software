package com.example.dricamp.services;

import com.example.dricamp.models.UsuarioRol;

import java.util.List;

public interface IUsuarioRolServicio {
    public List<UsuarioRol> findAll();
    public UsuarioRol findById(Long id);
    public UsuarioRol save(UsuarioRol usuarioRol);
    public void delete(Long id);

}
