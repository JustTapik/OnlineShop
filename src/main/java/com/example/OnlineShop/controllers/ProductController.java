package com.example.OnlineShop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import services.ProductService;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;



    @GetMapping("/")
    public String products(Model model){
        model.addAttribute("products", productService.list());
        return "products";
    }
}
