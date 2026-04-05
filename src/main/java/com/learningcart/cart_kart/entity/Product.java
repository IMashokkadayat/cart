package com.learningcart.cart_kart.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
//@Table(name = "Items")
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String price;

}
