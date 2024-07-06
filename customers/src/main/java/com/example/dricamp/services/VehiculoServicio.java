package com.example.dricamp.services;

import com.example.dricamp.Repositories.VehiculoRepositorio;
import com.example.dricamp.models.Vehiculo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class VehiculoServicio implements IVehiculoServicio{
    @Autowired
    private VehiculoRepositorio vehiculoRepositorio;

    @Override
    public List<Vehiculo> getVehiculos() {
        return vehiculoRepositorio.findAll();
    }

    @Override
    public Vehiculo getVehiculo(Long id) {
        Vehiculo vehiculo = null;
        vehiculo = vehiculoRepositorio.findById(id).orElse(null);
        if (vehiculo == null){
            return null;
        }
        return vehiculo;
    }

    @Override
    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepositorio.save(vehiculo);
    }

    @Override
    public void delete(Long id) {
        vehiculoRepositorio.deleteById(id);
    }
}
