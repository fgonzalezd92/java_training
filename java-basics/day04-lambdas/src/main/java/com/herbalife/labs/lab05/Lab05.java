package com.herbalife.labs.lab05;

public class Lab05 {
    public static void main(String[] args) {
        Adder adder = ((num1, num2) -> num1+num2);
        System.out.println(adder.add(5,2));

        Square sq = ((num) -> num*num);
        System.out.println(sq.square(5));

        System.out.println(operate(adder));
        System.out.println(compute(sq));

        var a = operate((n1,n2) -> n1+n2);
        System.out.println(a);

        var b = compute((n) -> n*n);
        System.out.println(b);
    }

    public static int operate(Adder adder){
        return adder.add(5,10);
    }

    public static int compute(Square sq){
        return sq.square(15);
    }
}


