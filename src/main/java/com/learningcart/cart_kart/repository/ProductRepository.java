package com.learningcart.cart_kart.repository;

import com.learningcart.cart_kart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductRepository  extends JpaRepository<Product,Long> {
    List<Product> findByName(String name);
}
