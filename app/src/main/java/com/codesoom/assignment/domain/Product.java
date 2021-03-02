package com.codesoom.assignment.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// 1. Entity (domain)
//  ** RDB의 Entity와 다름
// 2. JPA의 Entity 역할도 같이 함
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String maker;

    private Integer price;

    private String image;

    @Builder
    public Product(String name, String maker, Integer price, String image) {
        this.name = name;
        this.maker = maker;
        this.price = price;
        this.image = image;
    }

    public Product updateWith(Product source) {
        this.name = source.name;
        this.maker = source.maker;
        this.price = source.price;
        this.image = source.image;

        return this;
    }
}