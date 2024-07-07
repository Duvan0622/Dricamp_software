package com.example.dricamp.services;

import com.example.dricamp.models.Producto;
import com.example.dricamp.models.Usuario;

import java.util.*;

public interface IUsuarioServicio {
    public List<Usuario> findAll();
    public Usuario findById(Long id);
    public Usuario save(Usuario usuario);
    public void delete(Long id);
}

