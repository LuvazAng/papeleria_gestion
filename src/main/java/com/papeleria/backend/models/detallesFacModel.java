package com.papeleria.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalles_venta")
public class detallesFacModel {

    @Id
    @Column(name = "id_detallesv")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetallesFac;

    @ManyToOne
    @JoinColumn(name = "id_facturacion")
    private facturaModel idFactura;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private productoModel idProducto;

    @Column(name = "cantidad_vendida")
    private Integer cantidadVendida;
    
    @Column(name = "total_venta_unit")
    private Double totalVentaUnit;

    public detallesFacModel() {
    }

    public detallesFacModel(Integer idDetallesFac, facturaModel idFactura, productoModel idProducto, Integer cantidadVendida, Double totalVentaUnit) {
        this.idDetallesFac = idDetallesFac;
        this.idFactura = idFactura;
        this.idProducto = idProducto;
        this.cantidadVendida = cantidadVendida;
        this.totalVentaUnit = totalVentaUnit;
    }

    public Integer getIdDetallesFac() {
        return idDetallesFac;
    }

    public void setIdDetallesFac(Integer idDetallesFac) {
        this.idDetallesFac = idDetallesFac;
    }

    public facturaModel getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(facturaModel idFactura) {
        this.idFactura = idFactura;
    }

    public productoModel getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(productoModel idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Integer cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public Double getTotalVentaUnit() {
        return totalVentaUnit;
    }

    public void setTotalVentaUnit(Double totalVentaUnit) {
        this.totalVentaUnit = totalVentaUnit;
    }
    
    
    
}
