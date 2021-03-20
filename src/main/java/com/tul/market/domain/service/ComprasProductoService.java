package com.tul.market.domain.service;

import com.tul.market.persistence.ComprasProductoRepository;
import com.tul.market.persistence.entity.ComprasProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComprasProductoService {

    @Autowired
    private ComprasProductoRepository comprasProductoRepository;

    public List<ComprasProducto> getAll() {

        return (List<ComprasProducto>) comprasProductoRepository.getAll();
    }


    public Optional<ComprasProducto> getCompra(int compraId) {
        return comprasProductoRepository.getCompra(compraId);
    }


    public ComprasProducto save(ComprasProducto comprasProducto) {
        comprasProducto.setTotal(
                comprasProducto.getCantidad()*comprasProducto.getProducto().getPrecioVenta());
        return comprasProductoRepository.save(comprasProducto);
    }


    public void delete(int productId) {
        comprasProductoRepository.delete(productId);
    }

}
