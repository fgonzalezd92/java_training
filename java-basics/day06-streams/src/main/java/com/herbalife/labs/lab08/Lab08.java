package com.herbalife.labs.lab08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab08 {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));

        System.out.println(items
                .stream()
                .max((it1, it2) -> {
                    return Double.compare(it1.getPrice(), it2.getPrice());
                })
                .get());
        System.out.println(items
                .stream()
                .min((it1, it2) -> {
                    return Double.compare(it1.getPrice(), it2.getPrice());
                })
                .get());



        System.out.println(items
                .parallelStream()
                .map(x -> x.getName())
                .collect(Collectors.joining(",")));

    }
}
