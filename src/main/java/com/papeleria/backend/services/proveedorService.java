package com.papeleria.backend.services;

import com.papeleria.backend.models.proveedorModel;
import java.util.List;

public interface proveedorService {
  
    List<proveedorModel> listar();
    proveedorModel registrar(proveedorModel proveedor);
    proveedorModel actualizar(proveedorModel proveedor);
    void eliminar(Integer id);
    proveedorModel listarId(Integer id);
}
