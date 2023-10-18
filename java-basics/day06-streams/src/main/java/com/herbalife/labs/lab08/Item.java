package com.herbalife.labs.lab08;



public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return "Name %s, Price %s".formatted(this.name, this.price);
    }
}