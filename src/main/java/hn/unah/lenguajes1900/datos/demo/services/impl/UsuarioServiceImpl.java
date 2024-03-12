package hn.unah.lenguajes1900.datos.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.datos.demo.entities.Usuario;
import hn.unah.lenguajes1900.datos.demo.repositories.UsuarioRepository;
import hn.unah.lenguajes1900.datos.demo.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        return (List<Usuario>) this.usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarPorId(long id) {
        return this.usuarioRepository.findById(id).get();
    }

    
    
}
