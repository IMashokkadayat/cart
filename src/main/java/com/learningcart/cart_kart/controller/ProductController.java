package com.learningcart.cart_kart.controller;

import com.learningcart.cart_kart.entity.Product;
import com.learningcart.cart_kart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }




    @GetMapping("/products/{id}")
    public ResponseEntity<?> searchProduct(@PathVariable Long id){
//        Optional<Product> product = productRepository.findById(id);
//        if(product.isPresent()){
//            return ResponseEntity.ok(product.get());
//        }
//        return ResponseEntity.notFound().build();
        return productRepository.findById(id).
                map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        return productRepository.save(product);
    }


    @DeleteMapping("/products/{id}")
    public void deleteProduct( @PathVariable Long id){
        productRepository.deleteById(id);
    }

    @GetMapping("/search-product")
    public ResponseEntity<List<Product>> searchByName(@RequestParam String name){
        List<Product> products = productRepository.findByName(name);
        if (products.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(products);
    }




}
