package com.example.dricamp.controllers;

import com.example.dricamp.models.Producto;
import com.example.dricamp.services.IProductoServicio;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/producto")
public class ProductoControlador {

    @Autowired
    private IProductoServicio productoServicio;

    @Operation(summary = "Obtiene todos los Productos")
    @GetMapping
    public List<Producto> findAll(){
        return productoServicio.findAll();
    }

    @Operation(summary = "Obtiene un producto por su ID")
    @GetMapping("/{id}")
    public Producto findById(@PathVariable Long id){
        return productoServicio.findById(id);
    }

    @Operation(summary = "Realiza la creación de un producto")
    @PostMapping
    public ResponseEntity<Producto> create (@Valid @RequestBody Producto producto){
        Producto obj = productoServicio.save(producto);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Modifica un producto")
    @PutMapping
    public ResponseEntity<Producto> update(@Valid @RequestBody Producto producto){
        Producto obj = productoServicio.findById(producto.getIdProducto());
        if (obj != null){
            obj.setIdProducto(producto.getIdProducto());
            obj.setEstado(producto.getEstado());
            obj.setCategoria(producto.getCategoria());
            obj.setPresentacion(producto.getPresentacion());
            obj.setNombre(producto.getNombre());
            obj.setPrecio(producto.getPrecio());
            obj.setFechaProduccion(producto.getFechaProduccion());
            obj.setDescripcion(producto.getDescripcion());
            obj.setUsuario(producto.getUsuario());
            productoServicio.save(obj);

        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un producto")
    @DeleteMapping("/{id}")
    public ResponseEntity<Producto> delete(
            @Parameter(description = "Id del producto que se desea eliminar")
            @PathVariable("Id") Long id){
        Producto obj = productoServicio.findById(id);
        if(obj != null){
            productoServicio.delete(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }


    @Operation(summary = "Obtiene productos por ID de Usuario")
    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Producto>> getProductosByUsuario(@PathVariable Long usuarioId) {
        List<Producto> productos = productoServicio.getProductosByUsuarioId(usuarioId);
        if (productos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productos);
    }

    @Operation(summary = "Obtiene productos por Nombre")
    @GetMapping("/nombre")
    public ResponseEntity<List<Producto>> getProductosByNombre(@RequestParam String nombre) {
        List<Producto> productos = productoServicio.getProductosByNombre(nombre);
        if (productos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productos);
    }

    @Operation(summary = "Obtiene productos por Precio")
    @GetMapping("/precio")
    public ResponseEntity<List<Producto>> getProductosByPrecio(@RequestParam Double precio) {
        List<Producto> productos = productoServicio.getProductosByPrecio(precio);
        if (productos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productos);
    }

    @Operation(summary = "Obtiene productos por Categoria")
    @GetMapping("/categoria")
    public ResponseEntity<List<Producto>> getProductosByCategoria(@RequestParam String categoria) {
        List<Producto> productos = productoServicio.getProductosByCategoria(categoria);
        if (productos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productos);
    }

}
