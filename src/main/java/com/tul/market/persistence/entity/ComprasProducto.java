package com.tul.market.persistence.entity;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "compras_productos")
public class ComprasProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compras_productos")
    private Integer id;

    private UUID id_compra;
    private UUID id_producto;
    private Integer cantidad;
    private Double total;
    private Boolean estado;


    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;


    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UUID getId_compra() {
        return id_compra;
    }

    public void setId_compra(UUID id_compra) {
        this.id_compra = id_compra;
    }

    public UUID getId_producto() {
        return id_producto;
    }

    public void setId_producto(UUID id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return "ComprasProducto{" +
                "id=" + id +
                ", id_compra=" + id_compra +
                ", id_producto=" + id_producto +
                ", cantidad=" + cantidad +
                ", total=" + total +
                ", estado=" + estado +
                ", compra=" + compra +
                ", producto=" + producto +
                '}';
    }
}