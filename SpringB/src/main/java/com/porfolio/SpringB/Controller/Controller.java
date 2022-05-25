package com.porfolio.SpringB.Controller;
import com.porfolio.SpringB.model.Educacion;
import com.porfolio.SpringB.model.Experiencia;
import com.porfolio.SpringB.model.Idioma;
import com.porfolio.SpringB.model.Persona;
import com.porfolio.SpringB.model.Skill;
import com.porfolio.SpringB.service.IEducacionService;
import com.porfolio.SpringB.service.IExperienciaService;
import com.porfolio.SpringB.service.IIdiomaService;
import com.porfolio.SpringB.service.IPersonaService;
import com.porfolio.SpringB.service.ISkillService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {
    
    //Personas
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }
 
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
  //Experiencias 
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping ("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping ("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return expServ.verExperiencias();
    }
 
    @DeleteMapping ("/delete/experiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }

  //Educaciones 
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion exp){
        eduServ.crearEducacion(exp);
    }
    
    @GetMapping ("/ver/educaciones")
    @ResponseBody
    public List<Educacion> verEducaciones() {
        return eduServ.verEducaciones();
    }
 
    @DeleteMapping ("/delete/educacion/{id}")
    public void borrarEducacion (@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    //Idiomas
    @Autowired
    private IIdiomaService idiServ;
    
    @PostMapping ("/new/idioma")
    public void agregarIdioma (@RequestBody Idioma exp){
        idiServ.crearIdioma(exp);
    }
    
    @GetMapping ("/ver/idiomas")
    @ResponseBody
    public List<Idioma> verIdiomas() {
        return idiServ.verIdiomas();
    }
 
    @DeleteMapping ("/delete/idioma/{id}")
    public void borrarIdioma (@PathVariable Long id){
        idiServ.borrarIdioma(id);
    }
    
    //Skills
    @Autowired
    private ISkillService skiServ;
    
    @PostMapping ("/new/skill")
    public void agregarSkill (@RequestBody Skill exp){
        skiServ.crearSkill(exp);
    }
    
    @GetMapping ("/ver/skills")
    @ResponseBody
    public List<Skill> verSkills() {
        return skiServ.verSkills();
    }
 
    @DeleteMapping ("/delete/skill/{id}")
    public void borrarSkill (@PathVariable Long id){
        skiServ.borrarSkill(id);
    }

    }
    
