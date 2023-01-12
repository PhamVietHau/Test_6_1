package com.example.shop.repository;

import com.example.shop.entity.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface OrdersRepository extends CrudRepository<Orders,Integer> {
}
