package com.porfolio.SpringB.service;

import com.porfolio.SpringB.model.Skill;
import com.porfolio.SpringB.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {


@Autowired
public SkillRepository skiRepo;
   
    @Override
    public List<Skill> verSkills() {
        return skiRepo.findAll();
    }

    @Override
    public void crearSkill(Skill exp) {
        skiRepo.save(exp);
    }

    @Override
    public void borrarSkill(Long id) {
        skiRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skiRepo.findById(id).orElse(null);
    }
    @Override
    public void editarSkill(Skill exp) {
        skiRepo.save(exp);
    }    
}