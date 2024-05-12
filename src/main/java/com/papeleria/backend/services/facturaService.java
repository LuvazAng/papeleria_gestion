package com.papeleria.backend.services;

import com.papeleria.backend.models.facturaModel;
import java.time.LocalDate;
import java.util.List;

public interface facturaService {

    List<facturaModel> listar();
    facturaModel registrar(facturaModel factura);
    facturaModel listarId(Integer id);
    List<facturaModel> ventaPorMes(int mes, int anio);
    List<facturaModel> ventaPorFecha(LocalDate fecha);
}
