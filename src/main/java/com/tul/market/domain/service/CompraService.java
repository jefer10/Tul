package com.tul.market.domain.service;

import com.tul.market.persistence.CompraRepository;
import com.tul.market.persistence.entity.Compra;
import com.tul.market.persistence.entity.ComprasProducto;
import com.tul.market.persistence.entity.Producto;
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

    public Compra checkout(int compraId){
        Optional<Compra>compraFinal= getCompra(compraId);
        compraFinal.map(compra -> {
          List<ComprasProducto>comprasProductos= compra.getProductos();
            double totalf = 0.0;
            for (ComprasProducto comprasProducto : comprasProductos) {
                double total = comprasProducto.getTotal();
                totalf += total;
            }
            compra.setTotal(totalf);
            return compra;
        });
        return compraRepository.save(compraFinal.get());
    }
}
