package com.papeleria.backend.services;

import com.papeleria.backend.models.productoModel;
import java.util.List;
import java.util.Map;

public interface productoService {

    List<productoModel> listar();

    productoModel registrar(productoModel producto);

    productoModel actualizar(productoModel producto);

    void eliminar(Integer id);

    productoModel listarId(Integer id);
    
    productoModel actualizarParcial(Integer id, Map<String, Object> campos) throws Exception;
    
    List<productoModel> obtenerProductosBajoStock(Integer cantidad);
}
