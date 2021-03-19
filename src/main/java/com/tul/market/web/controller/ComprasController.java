package com.tul.market.web.controller;

import com.tul.market.persistence.CompraRepository;
import com.tul.market.persistence.crud.CompraCrudRepository;
import com.tul.market.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    @Autowired
    private CompraRepository compraRepository;

    @RequestMapping("/all")
    public List<Compra> getAll(){
        return compraRepository.getAll();
    }

    @RequestMapping("/hola")
    public String hola(){
        return "hola";
    }

}
