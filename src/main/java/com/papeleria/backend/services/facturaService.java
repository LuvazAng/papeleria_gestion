package com.papeleria.backend.services;

import com.papeleria.backend.models.facturaModel;
import java.util.List;

public interface facturaService {

    List<facturaModel> listar();
    facturaModel registrar(facturaModel factura);
    facturaModel listarId(Integer id);
    
}
