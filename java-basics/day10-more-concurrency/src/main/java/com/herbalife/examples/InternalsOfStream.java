package com.herbalife.examples;

import java.util.List;

public class InternalsOfStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(11,45,126,23,4,99,34);
        //Print the square of all even numbers
        numbers
                .stream()
                .filter(e -> {
                    System.out.println("**** Filtering " + e);
                    return e % 2 == 0;
                })
                .map(e -> {
                    System.out.println("**** Squaring " + e);
                    return e * e;
                })
                .forEach(System.out::println);
    }


}
