
package com.porfolio.SpringB.service;

import com.porfolio.SpringB.model.Educacion;
import java.util.List;


public interface IEducacionService {
 
    
    public List<Educacion> verEducaciones ();
 
    public void crearEducacion (Educacion exp);
    
    public void borrarEducacion (Long id);
    
    public Educacion buscarEducacion (Long id);
    
}
