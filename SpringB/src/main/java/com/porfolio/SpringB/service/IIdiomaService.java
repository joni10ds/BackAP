
package com.porfolio.SpringB.service;

import com.porfolio.SpringB.model.Idioma;
import java.util.List;


public interface IIdiomaService {
    
    
    public List<Idioma> verIdiomas ();
 
    public void crearIdioma (Idioma exp);
    
    public void borrarIdioma (Long id);
    
    public Idioma buscarIdioma (Long id);
    
}
