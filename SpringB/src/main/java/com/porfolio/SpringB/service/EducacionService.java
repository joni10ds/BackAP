package com.porfolio.SpringB.service;

import com.porfolio.SpringB.model.Educacion;
import com.porfolio.SpringB.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    
@Autowired
public EducacionRepository eduRepo;
   
    @Override
    public List<Educacion> verEducaciones() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion exp) {
        eduRepo.save(exp);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
        @Override
    public void editarEducacion(Educacion exp) {
        eduRepo.save(exp);
    }
}
