package com.tul.market.persistence.crud;

import com.tul.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

public interface CompraCrudRepository extends CrudRepository<Compra,Integer> {
    
}
