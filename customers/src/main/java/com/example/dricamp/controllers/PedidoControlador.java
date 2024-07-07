package com.example.dricamp.controllers;

import com.example.dricamp.models.Pedido;
import com.example.dricamp.services.IPedidoServicio;
import com.example.dricamp.services.PedidoServicio;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/pedido")
public class PedidoControlador{

    @Autowired
    private IPedidoServicio pedidoServicio;

    @Operation(summary = "Obtiene todos los pedidos")
    @GetMapping
    public List<Pedido> findAll(){
        return pedidoServicio.findAll();
    }

    @Operation(summary = "Obtiene un pedido por su ID")
    @GetMapping("/{id}")
    public Pedido findById(@PathVariable Long id){
        return pedidoServicio.findById(id);
    }

    @Operation(summary = "Realiza la creación de un pedido")
    @PostMapping
    public ResponseEntity<Pedido> create (@Valid @RequestBody Pedido pedido){
        Pedido obj = pedidoServicio.save(pedido);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Modifica un pedido")
    @PutMapping
    public ResponseEntity<Pedido> update(@Valid @RequestBody Pedido pedido){
        Pedido obj = pedidoServicio.findById(pedido.getIdPedido());
        if (obj != null){
            obj.setIdPedido(pedido.getIdPedido());
            obj.setEstado(pedido.getEstado());
            obj.setCliente(pedido.getCliente());
            obj.setTransportista(pedido.getTransportista());
            obj.setFechaPedido(pedido.getFechaPedido());
            pedidoServicio.save(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un pedido")
    @DeleteMapping("/{id}")
    public ResponseEntity<Pedido> delete(
            @Parameter(description = "Id del pedido que se desea eliminar")
            @PathVariable("Id") Long id){
        Pedido obj = pedidoServicio.findById(id);
        if(obj != null){
            pedidoServicio.delete(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }


    @Operation(summary = "Obtiene pedidos por fecha")
    @GetMapping("/fecha")
    public ResponseEntity<List<Pedido>> getPedidoByFecha(@RequestParam LocalDate fecha) {
        List<Pedido> pedidos = pedidoServicio.getPedidoByFecha(fecha);
        if (pedidos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(pedidos);
    }

    @Operation(summary = "Obtiene pedidos por ID del Cliente")
    @GetMapping("/idCliente/{id}")
    public ResponseEntity<List<Pedido>> getPedidoByCliente(@PathVariable Long id) {
        List<Pedido> pedidos = pedidoServicio.getPedidoByIdCliente(id);
        if (pedidos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(pedidos);
    }

    @Operation(summary = "Obtiene pedidos por Estado")
    @GetMapping("/estado")
    public ResponseEntity<List<Pedido>> getPedidoByEstado(@RequestParam String estado) {
        List<Pedido> pedidos = pedidoServicio.getPedidoByEstado(estado);
        if (pedidos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(pedidos);
    }
}
