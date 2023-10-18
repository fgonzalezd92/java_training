package com.herbalife.examples;

import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> randomSupplier =  () -> (int) (Math.random() *100);
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());

        Supplier<LocalTime> now = () -> LocalTime.now();
        System.out.println(now.get().toString());


    }
}
