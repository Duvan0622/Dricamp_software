package com.example.dricamp.controllers;

import com.example.dricamp.models.Vehiculo;
import com.example.dricamp.services.IVehiculoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoControlador {
    @Autowired
    private IVehiculoServicio vehiculoServicio;

    @GetMapping("/list")
    public List<Vehiculo> listar(){
        return vehiculoServicio.getVehiculos();
    }

    @GetMapping("/list/{id}")
    public Vehiculo buscarPorId(@PathVariable Long id){
        return vehiculoServicio.getVehiculo(id);
    }

    @PostMapping("/agregar")
    public ResponseEntity<Vehiculo> agregar (@RequestBody Vehiculo vehiculo){
        Vehiculo obj = vehiculoServicio.guardarVehiculo(vehiculo);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @PutMapping("/editar")
    public ResponseEntity<Vehiculo> editar(@RequestBody Vehiculo vehiculo){
        Vehiculo obj = vehiculoServicio.getVehiculo(vehiculo.getIdVehiculo());
        if (obj != null){
            obj.setIdVehiculo(vehiculo.getIdVehiculo());
            obj.setPlaca(vehiculo.getPlaca());
            obj.setTipovehiculo(vehiculo.getTipovehiculo());
            obj.setMarca(vehiculo.getMarca());
            obj.setModelo(vehiculo.getModelo());
            obj.setCapacidadcarga(vehiculo.getCapacidadcarga());
            obj.setId_transportista(vehiculo.getId_transportista());
            vehiculoServicio.guardarVehiculo(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/rm/{id}")
    public ResponseEntity<Vehiculo> eliminar(@PathVariable Long id){
        Vehiculo obj = vehiculoServicio.getVehiculo(id);
        if(obj != null){
            vehiculoServicio.delete(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
