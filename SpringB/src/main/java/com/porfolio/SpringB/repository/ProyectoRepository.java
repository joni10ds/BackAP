package com.porfolio.SpringB.repository;

import com.porfolio.SpringB.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long>{
    
}