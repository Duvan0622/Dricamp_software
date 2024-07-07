package com.example.dricamp.dao;

import com.example.dricamp.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;


import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

//Ayuda a hacer la conexion con la base de datos en fragmentos de transacción
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {

        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void deleteUsuarios(int id) {
        Usuario usuario = entityManager.find(Usuario.class,id);
        entityManager.remove(usuario);
    }

    @Override
    public void registrar(Usuario usuario) {
//Para agregarlo a la base de datos
        entityManager.merge(usuario);
    }


}
