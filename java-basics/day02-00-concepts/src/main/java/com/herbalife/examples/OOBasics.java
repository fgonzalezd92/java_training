package com.herbalife.examples;

import java.util.Arrays;

public class OOBasics {
    public static void main(String[] args){
        Car bmw = new Car();
        bmw.setModel("BMW");
        bmw.setYearOfMake(2023);
        bmw.drive(100);

        Publisher publisher = new Publisher("Person");
        Book book = new Book("titulo", 100.00, publisher);

        System.out.println(book);
        book.buy("Flipkart");
        book.buy("Amazon", 12);

        Book b2 = new Book("Scala", 12.56);
        System.out.println(b2);
    }

}
