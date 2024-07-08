package com.example.dricamp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dricamp.models.Parada;

@Repository
public interface ParadaRepository extends JpaRepository<Parada, Long> {
}
