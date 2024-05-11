package com.papeleria.backend.repository;

import com.papeleria.backend.models.facturaModel;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface facturaRepository extends JpaRepository<facturaModel, Integer> {

    List<facturaModel> findByFechaFacturaBetween(LocalDate fechaInicio, LocalDate fechaFin);

}
