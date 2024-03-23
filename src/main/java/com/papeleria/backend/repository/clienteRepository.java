package com.papeleria.backend.repository;

import com.papeleria.backend.models.clienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface clienteRepository extends JpaRepository<clienteModel, Integer>{
    
}
