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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String empresa;
    private String puesto;
    private String fechaingreso;
    private String fechasalida; 
    private String detalle;

@JoinColumn(name = "persona_id")
    @ManyToOne
    private Persona persona;


 public Experiencia(){
    }

public Experiencia(Long id, String empresa, String puesto, String fechaingreso, String fechasalida, String detalle){
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.fechaingreso = fechaingreso;
        this.fechasalida = fechasalida;
        this.detalle = detalle;
    }
}