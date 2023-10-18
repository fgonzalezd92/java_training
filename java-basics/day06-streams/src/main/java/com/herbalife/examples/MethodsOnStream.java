package com.herbalife.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsOnStream {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("Java", "Golang", "Python", "C#", "Ruby");
        //All the methods on stream API addres a single item only and not the collection
        //filter
        //It takes a collection of size n and applies the Predicate on each item and returns a collection of size 0 .. n
        langs
                .stream()
                .filter(lang -> lang.startsWith("P"))
                .forEach(lang -> System.out.println(lang));

        //Print all the items that start with P in UpperCase
        //map
        //It takes a collection of size n and applies the Function on each item and returns a collection of size n
        langs
                .stream()
                .map(lang -> lang.toUpperCase())
                .forEach(System.out::println);


        langs
                .stream()
                .filter(lang -> lang.startsWith("P"))
                .map(lang -> lang.toUpperCase())
                .forEach(System.out::println);

        List<String> langsInUpperCase = langs
                .stream()
                .map(lang -> lang.toUpperCase())
                .collect(Collectors.toList());
        langsInUpperCase.forEach(System.out::println);
    }
}
