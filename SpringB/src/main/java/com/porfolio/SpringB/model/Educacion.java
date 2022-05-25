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
public class Educacion {
    
  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String tipo;
    private String carrera;
    private String establecimiento;
    private String fechainicio;
    private String fechafin; 
    
@JoinColumn(name = "persona_id")
    @ManyToOne
    private Persona persona;  

 public Educacion(){
    }

public Educacion(Long id, String tipo, String carrera, String establecimiento, String fechainicio, String fechafin){
        this.id = id;
        this.tipo = tipo;
        this.carrera = carrera;
        this.establecimiento = establecimiento;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }
    
}
