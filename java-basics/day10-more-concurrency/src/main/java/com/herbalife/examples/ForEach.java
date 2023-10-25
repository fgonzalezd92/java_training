package com.herbalife.examples;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(11,45,126,23,4,99,3411,45,126,23,4,99,3411,45,126,23,4,99,34, 24,99,54,75,35,22,42,13,45);

        List<Integer> resultList = new ArrayList<>();
        numbers
                .parallelStream()
                .map(e -> e % e)
                .forEach(e -> {
                    resultList.add(e);
                });
        System.out.println("Numbers: " + numbers.size());
        System.out.println("Result: " + resultList.size());
    }
}
