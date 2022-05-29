
package com.porfolio.SpringB.service;

import com.porfolio.SpringB.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public List<Proyecto> verProyecto ();
 
    public void crearProyecto (Proyecto exp);
    
    public void borrarProyecto (Long id);
    
    public Proyecto buscarProyecto (Long id);
    
    public void editarProyecto (Proyecto exp);
}
