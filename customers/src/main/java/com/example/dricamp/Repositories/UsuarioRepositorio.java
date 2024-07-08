package com.example.dricamp.Repositories;

import com.example.dricamp.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}

