package com.tul.market.web.controller;

import com.tul.market.domain.service.CompraService;
import com.tul.market.persistence.CompraRepository;
import com.tul.market.persistence.crud.CompraCrudRepository;
import com.tul.market.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    @Autowired
    private CompraService compraService;

    @RequestMapping("/all")
    public List<Compra> getAll(){
        return compraService.getAll();
    }

    @PostMapping("/save")
    public Compra save(@RequestBody @Valid Compra compra){
        return compraService.save(compra);
    }

    @PostMapping("/update")
    public Compra update(@RequestBody @Valid Compra compra){
        return compraService.save(compra);
    }

    @RequestMapping("/checkout/{id}")
    public Compra checkout(@PathVariable("id") UUID id){
        return compraService.checkout(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") UUID id){
        compraService.delete(id);
    }

    @RequestMapping("/hola")
    public String hola(){
        return "hola";
    }

}
