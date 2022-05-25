package com.porfolio.SpringB.repository;

import com.porfolio.SpringB.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IdiomaRepository extends JpaRepository <Idioma, Long>{
    
}
