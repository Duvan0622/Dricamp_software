package com.example.dricamp.services;

import com.example.dricamp.models.Vehiculo;
import java.util.List;

public interface IVehiculoServicio {
    public List<Vehiculo> getVehiculos();
    public Vehiculo getVehiculo(Long id);
    public Vehiculo guardarVehiculo(Vehiculo usuario);
    public void delete(Long id);
}
