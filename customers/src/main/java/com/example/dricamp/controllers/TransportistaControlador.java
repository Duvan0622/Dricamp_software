package com.example.dricamp.controllers;

import com.example.dricamp.models.Transportista;
import com.example.dricamp.services.ITransportistaServicio;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transportista")
public class TransportistaControlador {
    @Autowired
    private ITransportistaServicio transportistaServicio;

    @Operation(summary = "Obtiene todos los Transportista")
    @GetMapping
    public List<Transportista> findAll(){
        return transportistaServicio.findAll();
    }

    @Operation(summary = "Obtiene un transportista por su ID")
    @GetMapping("/{id}")
    public Transportista findById(@PathVariable Long id){
        return transportistaServicio.findById(id);
    }

    @Operation(summary = "Realiza la creación de un transportista")
    @PostMapping
    public ResponseEntity<Transportista> create (@Valid @RequestBody Transportista transportista){
        Transportista obj = transportistaServicio.save(transportista);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Modifica un transportista")
    @PutMapping
    public ResponseEntity<Transportista> update(@Valid @RequestBody Transportista transportista){
        Transportista obj = transportistaServicio.findById(transportista.getIdTransportista());
        if (obj != null){
            obj.setIdTransportista(transportista.getIdTransportista());
            obj.setUsuario(transportista.getUsuario());
            obj.setPedidos(transportista.getPedidos());
            obj.setRuta(transportista.getRuta());
            obj.setVehiculo(transportista.getVehiculo());
            obj.setNumeroLicencia(transportista.getNumeroLicencia());
            obj.setCategoriaLicencia(transportista.getCategoriaLicencia());
            transportistaServicio.save(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un transportista")
    @DeleteMapping("/{id}")
    public ResponseEntity<Transportista> delete(
            @Parameter(description = "Id del usuario que se desea eliminar")
            @PathVariable("Id") Long id){
        Transportista obj = transportistaServicio.findById(id);
        if(obj != null){
            transportistaServicio.delete(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
