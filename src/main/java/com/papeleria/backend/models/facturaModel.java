package com.papeleria.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "facturacion")
public class facturaModel {

    @Id
    @Column(name = "id_facturacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFacturacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private usuarioModel idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private clienteModel idCliente;

    @Column(name = "fecha_factura")
    private LocalDate fechaFactura;

    @Column(name = "total_venta")
    private Double totalVenta;

    public facturaModel() {
    }

    public facturaModel(Integer idFacturacion, usuarioModel idUsuario, clienteModel idCliente, LocalDate fechaFactura, Double totalVenta) {
        this.idFacturacion = idFacturacion;
        this.idUsuario = idUsuario;
        this.idCliente = idCliente;
        this.fechaFactura = fechaFactura;
        this.totalVenta = totalVenta;
    }

    public Integer getIdFacturacion() {
        return idFacturacion;
    }

    public void setIdFacturacion(Integer idFacturacion) {
        this.idFacturacion = idFacturacion;
    }

    public usuarioModel getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(usuarioModel idUsuario) {
        this.idUsuario = idUsuario;
    }

    public clienteModel getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(clienteModel idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }



    
}
