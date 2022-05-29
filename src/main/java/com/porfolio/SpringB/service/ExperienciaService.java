package com.porfolio.SpringB.service;

import com.porfolio.SpringB.model.Experiencia;
import com.porfolio.SpringB.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

@Autowired
public ExperienciaRepository expRepo;
    
    
    @Override
    public List<Experiencia> verExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }
    
}
