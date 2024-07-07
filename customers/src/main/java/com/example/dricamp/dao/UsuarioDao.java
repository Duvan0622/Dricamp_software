package com.example.dricamp.dao;

import com.example.dricamp.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();
    void deleteUsuarios(int id);
    void registrar(Usuario usuario);
}
