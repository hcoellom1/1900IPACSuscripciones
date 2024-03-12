package hn.unah.lenguajes1900.datos.demo.services;

import java.util.List;

import hn.unah.lenguajes1900.datos.demo.entities.Usuario;

public interface UsuarioService {
    
    public Usuario crearUsuario(Usuario usuario);

    public List<Usuario> obtenerUsuarios();

    public Usuario buscarPorId(long id);

}
