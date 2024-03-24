package com.papeleria.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class proveedorModel {

    @Id
    @Column(name = "id_proveedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProvedor;

    @Column(name = "nombre_proveedor")
    private String nombreProveedor;
    
    @Column(name = "telefono_proveedor")
    private String telefonoProveedor;
    
    
    @Column(name = "direccion_proveedor")
    private String direccionProveedor;
    
    @Column(name = "borrado_proveedor")
    private boolean borradoProveedor;

    public proveedorModel() {
    }

    public proveedorModel(Integer idProvedor, String nombreProveedor, String telefonoProveedor, String direccionProveedor, boolean borradoProveedor) {
        this.idProvedor = idProvedor;
        this.nombreProveedor = nombreProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.direccionProveedor = direccionProveedor;
        this.borradoProveedor = borradoProveedor;
    }

    public Integer getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(Integer idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public boolean isBorradoProveedor() {
        return borradoProveedor;
    }

    public void setBorradoProveedor(boolean borradoProveedor) {
        this.borradoProveedor = borradoProveedor;
    }
    
    
}
