
package com.porfolio.SpringB.service;

import com.porfolio.SpringB.model.Skill;
import java.util.List;

public interface ISkillService {
       
    
    public List<Skill> verSkills ();
 
    public void crearSkill (Skill exp);
    
    public void borrarSkill (Long id);
    
    public Skill buscarSkill (Long id);
    
    public void editarSkill (Skill exp);
}
