package com.example.dricamp.controllers;



import com.example.dricamp.dao.UsuarioDao;
import com.example.dricamp.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {

    @Autowired
    private UsuarioDao usuarioDao;


    @RequestMapping(value="api/productos", method= RequestMethod.GET)
    public List <Usuario> getUsuarios(){
    return usuarioDao.getUsuarios();

    }

    //Requestbody pasa de json a Producto automaticamente
    @RequestMapping(value="api/productos", method= RequestMethod.POST)
    public void registrarUsuarios(@RequestBody Usuario usuario){

        usuarioDao.registrar(usuario);

    }



    @RequestMapping(value="api/productos/{id}", method= RequestMethod.DELETE)
    public void eliminarUsuarios(@PathVariable int id){

        usuarioDao.deleteUsuarios(id);

    }

}
