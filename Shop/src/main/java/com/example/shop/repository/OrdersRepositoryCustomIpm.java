package com.example.shop.repository;

import com.example.shop.entity.Orders;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;


public class OrdersRepositoryCustomIpm implements OrdersRepositoryCustom{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Orders> testAll() {
        return entityManager.createNativeQuery("select * from orders").getResultList();

    }
}
