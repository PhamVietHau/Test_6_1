package com.example.shop.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;



import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shippingtype")
public class ShippingType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String service;
    private int cost;
}
