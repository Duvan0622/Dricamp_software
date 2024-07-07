package com.example.dricamp.services;
import com.example.dricamp.models.Producto;
import com.example.dricamp.models.Usuario;
import com.example.dricamp.Repositories.UsuarioRepositorio;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioServicio implements IUsuarioServicio{

    @Autowired
    private UsuarioRepositorio usuarioRepo;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepo.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        Usuario usuario = null;
        usuario = usuarioRepo.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    @Override
    public void delete(Long id) {
        usuarioRepo.deleteById(id);
    }

}
