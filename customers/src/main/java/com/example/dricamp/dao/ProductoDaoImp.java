package com.example.dricamp.dao;

import com.example.dricamp.dao.ProductoDao;
import com.example.dricamp.models.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;


import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

//Ayuda a hacer la conexion con la base de datos en fragmentos de transacción
@Transactional
public class ProductoDaoImp implements ProductoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Producto> getProductos() {



        String query = "FROM Producto";
        return entityManager.createQuery(query).getResultList();

    }
}
