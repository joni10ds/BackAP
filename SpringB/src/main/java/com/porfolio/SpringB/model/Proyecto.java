package com.porfolio.SpringB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String fecharealizacion;
    private String descripcion;
    
@JoinColumn(name = "persona_id")
    @ManyToOne
    private Persona persona;  

 public Proyecto(){
    }

public Proyecto(Long id, String nombre, String fecharealizacion, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.fecharealizacion = fecharealizacion;
        this.descripcion = descripcion;
    }
}
