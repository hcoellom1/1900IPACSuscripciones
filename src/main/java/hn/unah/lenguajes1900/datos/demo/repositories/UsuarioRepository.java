package hn.unah.lenguajes1900.datos.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.datos.demo.entities.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    
}
