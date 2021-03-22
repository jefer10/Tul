package com.tul.market.web.controller;

import com.tul.market.domain.service.ProductoService;
import com.tul.market.persistence.entity.ComprasProducto;
import com.tul.market.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @RequestMapping("/all")
    public List<Producto> getAll(){
        return productoService.getAll();
    }

    @PostMapping("/save")
    public Producto save(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @PostMapping("/update")
    public Producto update(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @GetMapping("/{id}")
    public Optional<Producto> getProducto(@PathVariable("id") UUID id){
        return productoService.getProducto(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") UUID id){
        productoService.delete(id);
    }
}
