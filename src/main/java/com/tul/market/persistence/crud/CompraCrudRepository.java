package com.tul.market.persistence.crud;

import com.tul.market.persistence.entity.Compra;
import com.tul.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompraCrudRepository extends CrudRepository<Compra,Integer> {

    @Query(value = "SELECT * FROM productos INNER JOIN compras_productos ON productos.id_producto=compras_productos.id_producto WHERE id_compra=?",nativeQuery = true)
    List<Producto> getProductoByCompra(int id_compra);

}
