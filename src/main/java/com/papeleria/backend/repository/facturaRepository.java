
package com.papeleria.backend.repository;

import com.papeleria.backend.models.facturaModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface facturaRepository extends JpaRepository<facturaModel, Integer>{
    
}
