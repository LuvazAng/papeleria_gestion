package com.papeleria.backend.services;

import com.papeleria.backend.models.detallesFacModel;
import java.util.List;

public interface detallesFacService {

    List<detallesFacModel> listar();

    detallesFacModel registrar(detallesFacModel detallesFac);

    detallesFacModel listarId(Integer codigo);

}
