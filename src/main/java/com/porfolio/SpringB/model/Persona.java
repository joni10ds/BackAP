package com.porfolio.SpringB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String titulo1;
    private String titulo2;
    private String email;
    private String acercade;
    
    
    public Persona(){
    }
    
    public Persona(Long id, String nombre, String apellido, String titulo1, String titulo2, String email, String acercade){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo1 = titulo1;
        this.titulo2 = titulo2;
        this.email = email;
        this.acercade = acercade;
    }
    
}
