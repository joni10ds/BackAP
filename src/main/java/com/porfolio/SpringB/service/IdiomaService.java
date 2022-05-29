package com.porfolio.SpringB.service;

import com.porfolio.SpringB.model.Idioma;
import com.porfolio.SpringB.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService {


@Autowired
public IdiomaRepository idiRepo;
   
    @Override
    public List<Idioma> verIdiomas() {
        return idiRepo.findAll();
    }

    @Override
    public void crearIdioma(Idioma exp) {
        idiRepo.save(exp);
    }

    @Override
    public void borrarIdioma(Long id) {
        idiRepo.deleteById(id);
    }

    @Override
    public Idioma buscarIdioma(Long id) {
        return idiRepo.findById(id).orElse(null);
    }

    @Override
    public void editarIdioma(Idioma exp) {
        idiRepo.save(exp);
    }
}
