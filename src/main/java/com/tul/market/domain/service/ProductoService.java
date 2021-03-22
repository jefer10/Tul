package com.tul.market.domain.service;

import com.tul.market.persistence.ProductoRepository;
import com.tul.market.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    public List<Producto> getAll() {
        return (List<Producto>) productoRepository.getAll();
    }


    public Optional<Producto> getProducto(UUID productoId) {
        return productoRepository.getProducto(productoId);
    }


    public Producto save(Producto producto) {
        if(producto.getDescuento()){
           producto.setPrecioVenta((producto.getPrecioVenta())/2);
        }
        return productoRepository.save(producto);
    }

    public Producto update(Producto producto){
        Optional<Producto> old=getProducto(producto.getIdProducto());
        if (old.get().getDescuento()!=producto.getDescuento()){
            if(producto.getDescuento()==true){
                producto.setPrecioVenta((producto.getPrecioVenta())/2);
            }else{
                producto.setPrecioVenta((producto.getPrecioVenta())*2);
            }
            return productoRepository.save(producto);
        }
        return productoRepository.save(producto);
    }


    public void delete(UUID productId) {
        productoRepository.delete(productId);
    }
}
