package com.papeleria.backend.services;

import com.papeleria.backend.models.productoModel;
import java.util.List;

public interface productoService {
    
    List<productoModel> listar();
    productoModel registrar(productoModel producto);
    productoModel actualizar(productoModel producto);
    void eliminar(Integer codigo);
    productoModel listarId(Integer codigo);
}
