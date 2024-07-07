package com.example.dricamp.services;

import com.example.dricamp.Repositories.ProductoRepositorio;
import com.example.dricamp.models.Producto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductoServicio implements IProductoServicio{
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> findAll() {
        return productoRepositorio.findAll();
    }

    @Override
    public Producto findById(Long id) {
        Producto usuario = null;
        usuario = productoRepositorio.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public Producto save(Producto usuario) {
        return productoRepositorio.save(usuario);
    }

    @Override
    public void delete(Long id) {
        productoRepositorio.deleteById(id);
    }

    @Override
    public List<Producto> getProductosByUsuarioId(Long usuarioId) {
        return productoRepositorio.findByUsuario(usuarioId);
    }
    @Override
    public List<Producto> getProductosByNombre(String nombre) {
        return productoRepositorio.findByNombre(nombre);
    }
    @Override
    public List<Producto> getProductosByPrecio(Double precio) {
        return productoRepositorio.findByPrecio(precio);
    }

    @Override
    public List<Producto> getProductosByCategoria(String categoria) {
        return productoRepositorio.findByCategoria(categoria);
    }
}
