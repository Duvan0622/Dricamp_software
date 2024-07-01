package com.example.dricamp.controllers;



import com.example.dricamp.models.Campesino;
import com.example.dricamp.models.Productos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.xpath.XPathVariableResolver;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


@RestController
public class CustomerController {


    @RequestMapping(value="campesino/{id}")
    public Campesino tener(@PathVariable int id){

        Productos manzana = new Productos(id, "Fresco", "Fruta", "A granel", "Manzana", 0.5, new Date(), "Manzana roja fresca");
        Campesino c1= new Campesino("Juan Pérez", "juan@example.com", "555-1234", "Calle Falsa 123");
        c1.addProducto(manzana);

        return c1;

    }


    @RequestMapping(value="modify3")
    public Campesino modificar(){

        Productos manzana = new Productos(1, "Fresco", "Fruta", "A granel", "Manzana", 0.5, new Date(), "Manzana roja fresca");
        Productos pera = new Productos(2, "Fresco", "Fruta", "A granel", "Pera", 0.75, new Date(), "Pera verde");
        Campesino c1= new Campesino("Juan Pérez", "juan@example.com", "555-1234", "Calle Falsa 123");
        c1.addProducto(manzana);
        c1.addProducto(pera);
        return c1;

}

    @RequestMapping(value="modify4")
    public Campesino eliminar(){

        Productos manzana = new Productos(1, "Fresco", "Fruta", "A granel", "Manzana", 0.5, new Date(), "Manzana roja fresca");
        Productos pera = new Productos(2, "Fresco", "Fruta", "A granel", "Pera", 0.75, new Date(), "Pera verde");
        Campesino c1= new Campesino("Juan Pérez", "juan@example.com", "555-1234", "Calle Falsa 123");
        c1.addProducto(manzana);
        c1.addProducto(pera);
        return c1;


    }
    @RequestMapping(value="modify")
    public Campesino buscar(){

        Productos manzana = new Productos(1, "Fresco", "Fruta", "A granel", "Manzana", 0.5, new Date(), "Manzana roja fresca");
        Productos pera = new Productos(2, "Fresco", "Fruta", "A granel", "Pera", 0.75, new Date(), "Pera verde");
        Campesino c1= new Campesino("Juan Pérez", "juan@example.com", "555-1234", "Calle Falsa 123");
        c1.addProducto(manzana);
        c1.addProducto(pera);
        return c1;


    }


}
