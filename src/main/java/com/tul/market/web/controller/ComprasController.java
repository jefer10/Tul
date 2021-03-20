package com.tul.market.web.controller;

import com.tul.market.domain.service.CompraService;
import com.tul.market.persistence.CompraRepository;
import com.tul.market.persistence.crud.CompraCrudRepository;
import com.tul.market.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    @Autowired
    private CompraService compraService;

    @RequestMapping("/all")
    public List<Compra> getAll(){
        return compraService.getAll();
    }

    @RequestMapping("/checkout/{id}")
    public Compra checkout(@PathVariable("id")int id){
        return compraService.checkout(id);
    }

    @RequestMapping("/hola")
    public String hola(){
        return "hola";
    }

}
