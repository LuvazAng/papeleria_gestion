
package com.papeleria.backend.repository;

import com.papeleria.backend.models.usuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface usuarioRepository extends JpaRepository<usuarioModel, Integer>{
    usuarioModel findByCorreoUsuarioAndContrasenaUsuario(String correo, String contrasena);
}
