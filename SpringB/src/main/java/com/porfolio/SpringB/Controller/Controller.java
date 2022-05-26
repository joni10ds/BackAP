package com.porfolio.SpringB.Controller;
import com.porfolio.SpringB.model.Educacion;
import com.porfolio.SpringB.model.Experiencia;
import com.porfolio.SpringB.model.Idioma;
import com.porfolio.SpringB.model.Persona;
import com.porfolio.SpringB.model.Proyecto;
import com.porfolio.SpringB.model.Skill;
import com.porfolio.SpringB.service.IEducacionService;
import com.porfolio.SpringB.service.IExperienciaService;
import com.porfolio.SpringB.service.IIdiomaService;
import com.porfolio.SpringB.service.IPersonaService;
import com.porfolio.SpringB.service.IProyectoService;
import com.porfolio.SpringB.service.ISkillService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    @PutMapping ("/editar/persona/{id}")
    public void editarPersona (@PathVariable Long id, @RequestBody Persona pers){
        var expToModify= persoServ.buscarPersona(id);
        expToModify.setNombre(pers.getNombre());
        expToModify.setApellido(pers.getApellido());
        expToModify.setTitulo1(pers.getTitulo1());
        expToModify.setTitulo2(pers.getTitulo2());
        expToModify.setEmail (pers.getEmail());
        expToModify.setAcercade (pers.getAcercade());
        persoServ.editarPersona(expToModify);
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
    
    @PutMapping ("/editar/experiencia/{id}")
    public void editarExperiencia (@PathVariable Long id, @RequestBody Experiencia exp){
        var expToModify= expServ.buscarExperiencia(id);
        expToModify.setEmpresa(exp.getEmpresa());
        expToModify.setPuesto(exp.getPuesto());
        expToModify.setFechaingreso(exp.getFechaingreso());
        expToModify.setFechasalida(exp.getFechasalida());
        expToModify.setDetalle (exp.getDetalle());
        expServ.editarExperiencia(expToModify);
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
    
    @PutMapping ("/editar/educacion/{id}")
    public void editarEducacion (@PathVariable Long id, @RequestBody Educacion exp){
        var expToModify= eduServ.buscarEducacion(id);
        expToModify.setTipo(exp.getTipo());
        expToModify.setCarrera(exp.getCarrera());
        expToModify.setEstablecimiento(exp.getEstablecimiento());
        expToModify.setFechainicio(exp.getFechainicio());
        expToModify.setFechafin (exp.getFechafin());
        eduServ.editarEducacion(expToModify);
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
    
    @PutMapping ("/editar/idioma/{id}")
    public void editarIdioma (@PathVariable Long id, @RequestBody Idioma exp){
        var expToModify= idiServ.buscarIdioma(id);
        expToModify.setIdioma(exp.getIdioma());
        expToModify.setEscrito(exp.getEscrito());
        expToModify.setOral(exp.getOral()); 
        idiServ.editarIdioma(expToModify);
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
    
    @PutMapping ("/editar/skill/{id}")
    public void editarSkill (@PathVariable Long id, @RequestBody Skill exp){
        var expToModify= skiServ.buscarSkill(id);
        expToModify.setCapacidad(exp.getCapacidad());
        expToModify.setNivel(exp.getNivel());
        skiServ.editarSkill(expToModify);
    }
    
    //Proyectos
    @Autowired
    private IProyectoService proServ;
    
    @PostMapping ("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyecto exp){
        proServ.crearProyecto(exp);
    }
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return proServ.verProyecto();
    }
 
    @DeleteMapping ("/delete/proyecto/{id}")
    public void borrarProyecto (@PathVariable Long id){
        proServ.borrarProyecto(id);
    }
    
    @PutMapping ("/editar/proyecto/{id}")
    public void editarProyecto (@PathVariable Long id, @RequestBody Proyecto exp){
        var expToModify= proServ.buscarProyecto(id);
        expToModify.setNombre(exp.getNombre());
        expToModify.setFecharealizacion(exp.getFecharealizacion());
        expToModify.setDescripcion(exp.getDescripcion()); 
        proServ.editarProyecto(expToModify);
    }

    }
    
