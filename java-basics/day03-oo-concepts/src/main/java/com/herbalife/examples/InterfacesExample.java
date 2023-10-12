package com.herbalife.examples;

public class InterfacesExample {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.draw();
        Shape sq2 = new Square();
        sq2.draw();
    }
}

interface Figure{}

interface Shape{
    void draw();
}

class Square implements Shape, Figure{
    public void draw() {
        System.out.println("Drawing square");
    }
}