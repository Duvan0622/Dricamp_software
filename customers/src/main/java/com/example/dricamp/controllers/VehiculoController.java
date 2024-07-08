package com.example.dricamp.controllers;

import com.example.dricamp.models.Usuario;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.dricamp.models.Vehiculo;
import com.example.dricamp.services.VehiculoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @Operation(summary = "Obtiene todos los vehiculos")
    @GetMapping
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoService.getAllVehiculos();
    }

    @Operation(summary = "Obtiene un vehiculo por su ID")
    @GetMapping("/{id}")
    public Vehiculo getVehiculoById(@PathVariable Long id) {
        return vehiculoService.getVehiculoById(id);
    }

    @Operation(summary = "Realiza la creación de un vehiculo")
    @PostMapping
    public ResponseEntity<Vehiculo> saveVehiculo(@RequestBody Vehiculo vehiculo) {
        Vehiculo obj = vehiculoService.saveVehiculo(vehiculo);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un vehiculo")
    @DeleteMapping("/{id}")
    public ResponseEntity<Vehiculo> deleteVehiculo(@PathVariable Long id) {
        Vehiculo obj = vehiculoService.getVehiculoById(id);
        if(obj != null){
            vehiculoService.deleteVehiculo(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Modifica un vehiculo")
    @PutMapping
    public ResponseEntity<Vehiculo> update(@Valid @RequestBody Vehiculo vehiculo){
        Vehiculo obj = vehiculoService.getVehiculoById(vehiculo.getIdVehiculo());
        if (obj != null){
            obj.setIdVehiculo(vehiculo.getIdVehiculo());
            obj.setPlaca(vehiculo.getPlaca());
            obj.setMarca(vehiculo.getMarca());
            obj.setModelo(vehiculo.getModelo());
            obj.setTipoVehiculo(vehiculo.getTipoVehiculo());
            obj.setCapacidadCarga(vehiculo.getCapacidadCarga());
            vehiculoService.saveVehiculo(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
