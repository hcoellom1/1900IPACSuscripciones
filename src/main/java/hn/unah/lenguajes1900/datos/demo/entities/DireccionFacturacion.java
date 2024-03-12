package hn.unah.lenguajes1900.datos.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="direccionfacturacion")
@Data
public class DireccionFacturacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDireccion;

    private String pais;

    private String estado;

    private String ciudad;

    @OneToOne(mappedBy = "direccionFacturacion")
    private Usuario usuario;
}
