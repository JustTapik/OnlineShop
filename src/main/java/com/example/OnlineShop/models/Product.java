package com.example.OnlineShop.models;

import lombok.Data;

@Data
public class Product {
    private long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;

    public Product(long id, String title, String description, int price, String city, String author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.city = city;
        this.author = author;
    }
}
