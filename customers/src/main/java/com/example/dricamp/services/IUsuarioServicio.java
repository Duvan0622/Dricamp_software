package com.example.dricamp.services;

import com.example.dricamp.models.Usuario;
import java.util.List;

public interface IUsuarioServicio {
    public List<Usuario> getUsuarios();
    public Usuario getUsuario(Long id);
    public Usuario guardarUsuario(Usuario usuario);
    public void delete(Long id);
}

