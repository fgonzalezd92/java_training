package com.herbalife.labs.lab06;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Lab06 {
    public static void main(String[] args) {
        IntBinaryOperator adder = (num1, num2) -> num1 + num2;
        System.out.println(adder.applyAsInt(5,2));

        Function<Integer, Integer> sq = (num) -> num * num;
        System.out.println(sq.apply(10));


        System.out.println(operate(adder));
        System.out.println(compute(sq));
    }

    public static int operate(IntBinaryOperator adder){
        return adder.applyAsInt(5,10);
    }

    public static int compute(Function<Integer, Integer> square){
        return square.apply(11);
    }
}
