package com.herbalife.examples;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //Predicate is a FI that takes value of ANY type and returns a BOOLEAN
        Predicate<Integer> isEven = num -> num %2 ==0;
        System.out.println(isEven.test(10));

        int number = 11;
        //Check if number is odd
        isEven
                .negate()
                .test(number);

        Predicate<Integer> isGreaterThan100 = num -> num>100;
        //check if number is even and also greater than 100
        isEven
                .and(isGreaterThan100)
                .test(number);

        isEven.and(num-> num>100).test(number);

        Predicate<String> isBlank = value -> value.isBlank();
        System.out.println(isBlank.test(""));
    }
}

interface Tester {
    boolean test(Object object);
}