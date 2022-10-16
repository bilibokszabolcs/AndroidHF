package com.example.hf03_2;

public class Product {

    public Integer code;
    public String name;
    public Double price;

    public Product(Integer code, String name, Double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " +name + " | Code: " + code + " | Price: " + price + "\n";
    }
}
