package com.papeleria.backend.repository;

import com.papeleria.backend.models.proveedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface proveedorRepository extends JpaRepository<proveedorModel, Integer>{
    
}
