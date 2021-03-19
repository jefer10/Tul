package com.tul.market.persistence;

import com.tul.market.persistence.crud.CompraProductoCrudRepository;
import com.tul.market.persistence.entity.Compra;
import com.tul.market.persistence.entity.ComprasProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ComprasProductoRepository {

    @Autowired
    private CompraProductoCrudRepository compraProductoCrudRepository;

    public List<ComprasProducto> getAll() {
        return (List<ComprasProducto>) compraProductoCrudRepository.findAll();
    }


    public Optional<ComprasProducto> getCompra(int compraId) {
        return compraProductoCrudRepository.findById(compraId);
    }


    public ComprasProducto save(ComprasProducto comprasProducto) {
        return compraProductoCrudRepository.save(comprasProducto);
    }


    public void delete(int productId) {
        compraProductoCrudRepository.deleteById(productId);
    }

}
