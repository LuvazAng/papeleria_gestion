
package com.papeleria.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class usuarioModel {
    
    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    
    @Column(name = "contrasena_usuario")
    private String contrasenaUsuario;
    
    @Column(name = "correo_usuario")
    private String correoUsuario;
    
    @Column(name = "rol")
    private String rol;
    
    @Column(name = "borrado_usuario")
    private boolean borradoUsuario;

    public usuarioModel() {
    }

    public usuarioModel(Integer idUsuario, String nombreUsuario, String contrasenaUsuario, String correoUsuario, String rol, boolean borradoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.correoUsuario = correoUsuario;
        this.rol = rol;
        this.borradoUsuario = borradoUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isBorradoUsuario() {
        return borradoUsuario;
    }

    public void setBorradoUsuario(boolean borradoUsuario) {
        this.borradoUsuario = borradoUsuario;
    }
    
    
}
