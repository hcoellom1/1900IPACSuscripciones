package hn.unah.lenguajes1900.datos.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.datos.demo.entities.Usuario;
import hn.unah.lenguajes1900.datos.demo.services.impl.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/usuario/guardar")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return this.usuarioServiceImpl.crearUsuario(usuario);        
    }
    
}
