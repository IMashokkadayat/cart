package com.learningcart.cart_kart.Testdata;

import com.learningcart.cart_kart.controller.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ControllerTest {

    @Autowired
    ProductController productController;

    @Test
    public void Testcheck(){
        productController.getAllProduct();

    }
}
