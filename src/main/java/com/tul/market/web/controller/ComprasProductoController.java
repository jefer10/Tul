package com.tul.market.web.controller;

import com.tul.market.domain.service.ComprasProductoService;
import com.tul.market.persistence.entity.ComprasProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("carro")
public class ComprasProductoController {

    @Autowired
    private ComprasProductoService comprasProductoService;

    @RequestMapping("/all")
    public List<ComprasProducto> getAll(){
        return comprasProductoService.getAll();
    }
}
