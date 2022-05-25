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
public class Skill {
    
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String capacidad;
    private String nivel;
        
@JoinColumn(name = "persona_id")
    @ManyToOne
    private Persona persona;  

 public Skill(){
    }

public Skill(Long id, String capacidad, String nivel){
        this.id = id;
        this.capacidad = capacidad;
        this.nivel = nivel;
    }
    
     
}
