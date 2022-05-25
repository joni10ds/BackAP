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
public class Idioma {
    
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String idioma;
    private String escrito;
    private String oral;
    
@JoinColumn(name = "persona_id")
    @ManyToOne
    private Persona persona;  

 public Idioma(){
    }

public Idioma(Long id, String idioma, String escrito, String oral){
        this.id = id;
        this.idioma = idioma;
        this.escrito = escrito;
        this.oral = oral;
    }
    
    
}
