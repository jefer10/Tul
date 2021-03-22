package com.tul.market.persistence.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id_producto")
    private UUID id;

    private String nombre;

    @Column(name = "codigo_barras")
    private String sku;

    @Column(name = "precio")
    private Double precioVenta;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> comprasProducto;

    private Boolean descuento;


    private String descripcion;


    public UUID getIdProducto() {
        return id;
    }

    public void setIdProducto(UUID id) {
        this.id = id;
    }
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCodigoBarras() {
        return sku;
    }

    public void setCodigoBarras(String sku) {
        this.sku = sku;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }


}