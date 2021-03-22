package com.tul.market.persistence;

import com.tul.market.persistence.crud.ProductoCrudRepository;
import com.tul.market.persistence.entity.ComprasProducto;
import com.tul.market.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ProductoRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }


    public Optional<Producto> getProducto(UUID productoId) {
        return productoCrudRepository.findById(productoId);
    }


    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }


    public void delete(UUID productId) {
        productoCrudRepository.deleteById(productId);
    }
}
