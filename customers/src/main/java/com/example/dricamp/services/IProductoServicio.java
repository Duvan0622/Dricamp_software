package com.example.dricamp.services;

import com.example.dricamp.models.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> findAll();
    public Producto findById(Long id);
    public Producto save(Producto usuario);
    public void delete(Long id);
    List<Producto> getProductosByUsuarioId(Long usuarioId);
    List<Producto> getProductosByNombre(String nombre);
    List<Producto> getProductosByPrecio(Double precio);
    List<Producto> getProductosByCategoria(String categoria);
}
