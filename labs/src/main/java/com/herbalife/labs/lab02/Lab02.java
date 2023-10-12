package com.herbalife.labs.lab02;

public class Lab02 {
    public static void main(String[] args){
        MyMath myMath = new MyMath();

        int sum = myMath.SumOddNumbers();
        System.out.println("Sum odd numbers %s".formatted(sum));

        int avg = myMath.AverageLambda();
        System.out.println("Average %s".formatted(avg));

        String input = "+5 -1 +9 +5 -67 +5 -3 +2 -4 +6 +8 -13 +2 -4 +6 +18 -3 +2 -4 +6 +88 +15 -1 +9 +5 -67 +45 -3 +2 -4 +36 +8 -13 +2 -4 +6 +18 -3 +2 -74 +11 +109";
        int suma = myMath.sumOf(input);
        System.out.println("Sum of numbers %s".formatted(suma));

    }
}
