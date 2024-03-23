
package com.papeleria.backend.services;

import com.papeleria.backend.models.usuarioModel;
import java.util.List;


public interface usuarioService {
    
    List<usuarioModel> listar();
    usuarioModel registrar(usuarioModel usuario);
    usuarioModel actualizar(usuarioModel usuario);
    void eliminar(Integer codigo);
    usuarioModel listarId(Integer codigo);
}
