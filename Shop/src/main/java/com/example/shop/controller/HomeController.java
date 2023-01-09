package com.example.shop.controller;

import com.example.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "home")
public class HomeController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/")
    public String Home(Model model){
        model.addAttribute("products",productService.all());
        return"Homepage";
    }


}
