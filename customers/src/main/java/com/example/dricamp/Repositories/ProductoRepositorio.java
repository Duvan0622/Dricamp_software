package com.example.dricamp.Repositories;

import com.example.dricamp.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

    @Query("SELECT p FROM Producto p WHERE p.usuario.idUsuario = :usuarioId")
    List<Producto> findByUsuario(Long usuarioId);

    @Query("SELECT p FROM Producto p WHERE lower(p.nombre) like  %:nombre%")
    List<Producto> findByNombre(String nombre);

    @Query("SELECT p FROM Producto p WHERE lower(p.categoria) like  %:categoria%")
    List<Producto> findByCategoria(String categoria);

    @Query("SELECT p FROM Producto p WHERE p.precio <= :precio")
    List<Producto> findByPrecio(Double precio);
}
