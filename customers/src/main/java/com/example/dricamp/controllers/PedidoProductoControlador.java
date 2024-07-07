package com.example.dricamp.controllers;

import com.example.dricamp.models.PedidoProducto;
import com.example.dricamp.services.IPedidoProductoServicio;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidoProducto")
public class PedidoProductoControlador {

    @Autowired
    private IPedidoProductoServicio pedidoProductoServicio;

    @Operation(summary = "Obtiene todos los PedidoProducto")
    @GetMapping
    public List<PedidoProducto> findAll(){
        return pedidoProductoServicio.findAll();
    }

    @Operation(summary = "Obtiene un pedidoProducto por su ID")
    @GetMapping("/{id}")
    public PedidoProducto findById(@PathVariable Long id){
        return pedidoProductoServicio.findById(id);
    }

    @Operation(summary = "Realiza la creación de un pedidoProducto")
    @PostMapping
    public ResponseEntity<PedidoProducto> create (@Valid @RequestBody PedidoProducto pedidoProducto){
        PedidoProducto obj = pedidoProductoServicio.save(pedidoProducto);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Modifica un pedidoProducto")
    @PutMapping
    public ResponseEntity<PedidoProducto> update(@Valid @RequestBody PedidoProducto pedidoProducto){
        PedidoProducto obj = pedidoProductoServicio.findById(pedidoProducto.getIdPedidoProducto());
        if (obj != null){
            obj.setIdPedidoProducto(pedidoProducto.getIdPedidoProducto());
            obj.setPedido(pedidoProducto.getPedido());
            obj.setProducto(pedidoProducto.getProducto());
            obj.setCantidad(pedidoProducto.getCantidad());
            pedidoProductoServicio.save(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un pedidoProducto")
    @DeleteMapping("/{id}")
    public ResponseEntity<PedidoProducto> delete(
            @Parameter(description = "Id del pedidoProducto que se desea eliminar")
            @PathVariable("Id") Long id){
        PedidoProducto obj = pedidoProductoServicio.findById(id);
        if(obj != null){
            pedidoProductoServicio.delete(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Obtiene PedidoProducto por idProducto")
    @GetMapping("/producto/{idProducto}")
    public List<PedidoProducto> findByProductoId(@PathVariable Long idProducto) {
        return pedidoProductoServicio.getPPByProductoId(idProducto);
    }

    @Operation(summary = "Obtiene PedidoProducto por idPedido")
    @GetMapping("/pedido/{idPedido}")
    public List<PedidoProducto> findByPedidoId(@PathVariable Long idPedido) {
        return pedidoProductoServicio.getPPByPedidoId(idPedido);
    }
}
