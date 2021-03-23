package com.tul.market.persistence.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.validation.constraints.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id_compra")
    private UUID idCompra;

    @NotNull(message = "Debes especificar el id del cliente")
    @Column(name = "id_cliente")
    private String idCliente;

    private LocalDateTime fecha;


    @Pattern(regexp = "(E|T)")
    @Column(name = "medio_pago")
    private String medioPago;

    @NotNull(message = "Debes especificar el comentario de la compra")
    private String comentario;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private Estado estado;

    private Double total;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    //@ElementCollection
    @OneToMany(mappedBy = "compra")
    private List<ComprasProducto> comprasProductos;


    public UUID getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(UUID idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
/*
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
*/
    public List<ComprasProducto> getProductos() {
        return comprasProductos;
    }

    public void setProductos(List<ComprasProducto> comprasProductos) {
        this.comprasProductos = comprasProductos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "idCompra=" + idCompra +
                ", idCliente='" + idCliente + '\'' +
                ", fecha=" + fecha +
                ", medioPago='" + medioPago + '\'' +
                ", comentario='" + comentario + '\'' +
                ", estado=" + estado +
                ", total=" + total +
                ", cliente=" + cliente +
                ", comprasProductos=" + comprasProductos +
                '}';
    }


}