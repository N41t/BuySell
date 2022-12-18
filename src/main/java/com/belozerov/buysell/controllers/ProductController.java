package com.belozerov.buysell.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    //Главная страница сайта с отображ. товаров
    @GetMapping("/")
    public String products() {
        return "products";
    }
}
