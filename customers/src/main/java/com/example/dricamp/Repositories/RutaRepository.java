package com.example.dricamp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dricamp.models.Ruta;

@Repository
public interface RutaRepository extends JpaRepository<Ruta, Long> {
}
