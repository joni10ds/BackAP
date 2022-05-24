package com.porfolio.SpringB.repository;

import com.porfolio.SpringB.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long>{
    
}
