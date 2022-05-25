package com.porfolio.SpringB.repository;

import com.porfolio.SpringB.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
 
}