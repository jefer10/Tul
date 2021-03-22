package com.tul.market.persistence;

import com.tul.market.persistence.crud.CompraCrudRepository;
import com.tul.market.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class CompraRepository {

    @Autowired
    private CompraCrudRepository compraCrudRepository;

    public List<Compra> getAll() {
        return (List<Compra>) compraCrudRepository.findAll();
    }


    public Optional<Compra> getCompra(UUID compraId) {
        return compraCrudRepository.findById(compraId);
    }


    public Compra save(Compra compra) {
        return compraCrudRepository.save(compra);
    }


    public void delete(UUID productId) {
        compraCrudRepository.deleteById(productId);
    }

}
