package com.tul.market.web.controller;

import com.tul.market.domain.service.ComprasProductoService;
import com.tul.market.persistence.entity.ComprasProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("carro")
public class ComprasProductoController {

    @Autowired
    private ComprasProductoService comprasProductoService;

    @RequestMapping("/all")
    public List<ComprasProducto> getAll(){
        return comprasProductoService.getAll();
    }

    @RequestMapping("/{id]")
    public Optional<ComprasProducto> getComprasProductos(@PathVariable("id")int id){
        return comprasProductoService.getCompra(id);
    }
    @PostMapping("/save")
    public ComprasProducto save(@RequestBody ComprasProducto comprasProducto){
        return comprasProductoService.save(comprasProducto);
    }

    @PostMapping("/update")
    public ComprasProducto update(@RequestBody ComprasProducto comprasProducto){
        return comprasProductoService.save(comprasProducto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){
        comprasProductoService.delete(id);
    }
}
