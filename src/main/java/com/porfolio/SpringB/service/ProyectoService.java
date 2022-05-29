package com.porfolio.SpringB.service;

import com.porfolio.SpringB.model.Proyecto;
import com.porfolio.SpringB.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
public ProyectoRepository proRepo;
   
    @Override
    public List<Proyecto> verProyecto() {
        return proRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto exp) {
        proRepo.save(exp);
    }

    @Override
    public void borrarProyecto(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarProyecto(Proyecto exp) {
        proRepo.save(exp);
    }
    
}
