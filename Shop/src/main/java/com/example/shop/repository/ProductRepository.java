package com.example.shop.repository;

import com.example.shop.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    //tim quan
    @Query(value = "SELECT * FROM product where productTypeId = 3",nativeQuery = true)
    public List<Product> findPants();
    //tim ao


    //sap xep giam
    @Query(value = "SELECT * FROM product order by id desc ",nativeQuery = true )
    public List<Product> allDescId();
}
