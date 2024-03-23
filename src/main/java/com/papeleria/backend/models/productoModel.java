package com.papeleria.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalTime;

@Entity
@Table(name = "productos")
public class productoModel {

    @Id
    @Column(name = "id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio_unit ")
    private Double precioUnitario;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "fecha_producto")
    private LocalTime fechaProducto;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private proveedorModel idProveedor;

    @Column(name = "borrado_product")
    private boolean borradoProducto;

    public productoModel() {
    }

    public productoModel(Integer idProducto, String nombreProducto, String descripcion, Double precioUnitario, Integer stock, LocalTime fechaProducto, proveedorModel idProveedor, boolean borradoProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.fechaProducto = fechaProducto;
        this.idProveedor = idProveedor;
        this.borradoProducto = borradoProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public LocalTime getFechaProducto() {
        return fechaProducto;
    }

    public void setFechaProducto(LocalTime fechaProducto) {
        this.fechaProducto = fechaProducto;
    }

    public proveedorModel getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(proveedorModel idProveedor) {
        this.idProveedor = idProveedor;
    }

    public boolean isBorradoProducto() {
        return borradoProducto;
    }

    public void setBorradoProducto(boolean borradoProducto) {
        this.borradoProducto = borradoProducto;
    }
    
}
