package com.papeleria.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class clienteModel {
   
    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    
    @Column(name = "apll_pat_cliente")
    private String apellPaterno;
    
    @Column(name = "apll_mat_cliente")
    private String apellMaterno;
    
    @Column(name = "telefono_cliente")
    private String telefonoCliente;

    
    @Column(name = "fecha_cliente")
    private String fechaAgregado;
    
    @Column(name = "borrado_cliente")
    private String borradoCliente;

    public clienteModel() {
    }

    public clienteModel(Integer idCliente, String nombreCliente, String apellPaterno, String apellMaterno, String telefonoCliente, String fechaAgregado, String borradoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellPaterno = apellPaterno;
        this.apellMaterno = apellMaterno;
        this.telefonoCliente = telefonoCliente;
        this.fechaAgregado = fechaAgregado;
        this.borradoCliente = borradoCliente;
    }

    
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellPaterno() {
        return apellPaterno;
    }

    public void setApellPaterno(String apellPaterno) {
        this.apellPaterno = apellPaterno;
    }

    public String getApellMaterno() {
        return apellMaterno;
    }

    public void setApellMaterno(String apellMaterno) {
        this.apellMaterno = apellMaterno;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getFechaAgregado() {
        return fechaAgregado;
    }

    public void setFechaAgregado(String fechaAgregado) {
        this.fechaAgregado = fechaAgregado;
    }

    public String getBorradoCliente() {
        return borradoCliente;
    }

    public void setBorradoCliente(String borradoCliente) {
        this.borradoCliente = borradoCliente;
    }
    
    
    
    
}
