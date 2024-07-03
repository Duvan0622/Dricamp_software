package com.example.dricamp.controllers;



import com.example.dricamp.dao.ProductoDao;
import com.example.dricamp.models.Campesino;
import com.example.dricamp.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;


@RestController
public class CustomerController {

    @Autowired
    private ProductoDao productoDao;

    @RequestMapping(value="campesino")
    public Campesino tener(@PathVariable int id){

        Producto manzana = new Producto(id, "Fresco", "Fruta", "A granel", "Manzana", 0.5,"2020", "Manzana roja fresca");
        Campesino c1= new Campesino("Juan Pérez", "juan@example.com", "555-1234", "Calle Falsa 123");
        c1.addProducto(manzana);

        return c1;

    }


    @RequestMapping(value="modify3")
    public Campesino modificar(){

        Producto manzana = new Producto(1, "Fresco", "Fruta", "A granel", "Manzana", 0.5, "2024", "Manzana roja fresca");
        Producto pera = new Producto(2, "Fresco", "Fruta", "A granel", "Pera", 0.75, "2025", "Pera verde");
        Campesino c1= new Campesino("Juan Pérez", "juan@example.com", "555-1234", "Calle Falsa 123");
        c1.addProducto(manzana);
        c1.addProducto(pera);
        return c1;

}

    @RequestMapping(value="modify4")
    public Campesino eliminar(){

        Producto manzana = new Producto(1, "Fresco", "Fruta", "A granel", "Manzana", 0.5, "Pera", "Manzanas aún maduras");
        Producto pera = new Producto(2, "Fresco", "Fruta", "A granel", "Pera", 0.75, "20", "Pera verde");
        Campesino c1= new Campesino("Juan Pérez", "juan@example.com", "555-1234", "Calle Falsa 123");
        c1.addProducto(manzana);
        c1.addProducto(pera);
        return c1;


    }
    @RequestMapping(value="productosCampo")
    public List <Producto> getProductos(){
    return productoDao.getProductos();


    }


}
