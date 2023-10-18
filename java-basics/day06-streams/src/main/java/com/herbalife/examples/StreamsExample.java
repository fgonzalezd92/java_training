package com.herbalife.examples;

import java.util.*;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);
        //Print all the numbers greater than 25

        //Stream is an abstraction of your collection
        //Stream cannot be reused
        Stream<Integer> numbersStream = numbers.stream();
        numbersStream.filter(x -> x > 25).forEach(System.out::println);
//        numbersStream.filter(x -> x > 25).forEach(System.out::println);


        Set<String> langs = new HashSet<>();
        langs
                .stream()
                .filter(lang -> lang.startsWith("J"))
                .forEach(System.out::println);

        Map<Integer,String> romanNumbers = new HashMap<>();
//        romanNumbers
//                .forEach();
    }
}
