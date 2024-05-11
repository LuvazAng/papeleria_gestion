package com.papeleria.backend.repository;

import com.papeleria.backend.models.productoModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoRepository extends JpaRepository<productoModel, Integer> {

    List<productoModel> findByStockLessThan(Integer cantidad);
}
