package com.tul.market.web.controller;

import com.tul.market.domain.service.ProductoService;
import com.tul.market.persistence.entity.ComprasProducto;
import com.tul.market.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @RequestMapping("/all")
    public List<Producto> getAll(){
        return productoService.getAll();
    }
}
