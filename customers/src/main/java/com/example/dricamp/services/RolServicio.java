package com.example.dricamp.services;

import com.example.dricamp.Repositories.RolRepositorio;
import com.example.dricamp.models.Rol;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RolServicio implements IRolServicio{

    @Autowired
    private RolRepositorio rolRepositorio;

    @Override
    public List<Rol> findAll() {
        return rolRepositorio.findAll();
    }

    @Override
    public Rol findById(Long id) {
        Rol rol = null;
        rol = rolRepositorio.findById(id).orElse(null);
        return rol;
    }

    @Override
    public Rol save(Rol rol) {
        return rolRepositorio.save(rol);
    }

    @Override
    public void delete(Long id) {
        rolRepositorio.deleteById(id);
    }
}
