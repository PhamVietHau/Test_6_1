package com.example.shop.controller;

import com.example.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "view")
public class ViewProductConntroller {
    @Autowired
    private ProductService productService;
}
