package com.example.shop.repository;

import com.example.shop.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> {

    //tim pants
    @Query(value = "SELECT * FROM product where productTypeId = 3 order by id desc",nativeQuery = true)
    public List<Product> findPants();

    //tim shirts
    @Query(value = "SELECT * FROM product where productTypeId = 1 or productTypeId = 2 order by id desc",nativeQuery = true)
    public  List<Product> findShirtsAndCoats();

    //sap xep giam theo id
    @Query(value = "SELECT * FROM product order by id desc ",nativeQuery = true )
    public List<Product> allDescId();
}
