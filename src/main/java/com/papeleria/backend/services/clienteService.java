package com.papeleria.backend.services;

import com.papeleria.backend.models.clienteModel;
import java.util.List;

public interface clienteService {

    List<clienteModel> listar();
    clienteModel registrar(clienteModel cliente);
    clienteModel actualizar(clienteModel cliente);
    void eliminar(Integer codigo);
    clienteModel listarId(Integer codigo);
    
}
