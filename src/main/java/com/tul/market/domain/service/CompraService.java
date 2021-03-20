package com.tul.market.domain.service;

import com.tul.market.persistence.CompraRepository;
import com.tul.market.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public List<Compra> getAll() {
        return (List<Compra>) compraRepository.getAll();
    }

    public Optional<Compra> getCompra(int compraId) {
        return compraRepository.getCompra(compraId);
    }


    public Compra save(Compra compra) {
        return compraRepository.save(compra);
    }


    public void delete(int productId) {
        compraRepository.delete(productId);
    }
}
