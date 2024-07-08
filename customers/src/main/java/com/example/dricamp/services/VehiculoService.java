package com.example.dricamp.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dricamp.Repositories.VehiculoRepository;
import com.example.dricamp.models.Vehiculo;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> getAllVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Vehiculo getVehiculoById(Long id) {
        return vehiculoRepository.findById(id).orElse(null);
    }

    public Vehiculo saveVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public void deleteVehiculo(Long id) {
        vehiculoRepository.deleteById(id);
    }
}
