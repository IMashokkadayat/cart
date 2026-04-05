package com.learningcart.cart_kart.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/home")
    public String welcome(){
        return "hi! welcome to the project";
    }

}
