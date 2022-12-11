package com.example.hf07;

public class Animal {
    private String name;
    private String description;
    private Integer image;

    public Animal(String name, String description, Integer image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getImage() {
        return image;
    }
}
