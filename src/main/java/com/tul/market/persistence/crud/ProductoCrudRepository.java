package com.tul.market.persistence.crud;

import com.tul.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductoCrudRepository extends CrudRepository<Producto,UUID> {

    @Query(value = "SELECT * FROM productos WHERE id_categoria=?",nativeQuery = true)
    List<Producto> getByCategoria(int idcategoria);



    //@Query(value = "SELECT * FROM productos WHERE id=?",nativeQuery = true)
    //Optional<Producto> findById(UUID id);
}
