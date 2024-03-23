package com.papeleria.backend.repository;

import com.papeleria.backend.models.productoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoRepository extends JpaRepository<productoModel, Integer>{

}
