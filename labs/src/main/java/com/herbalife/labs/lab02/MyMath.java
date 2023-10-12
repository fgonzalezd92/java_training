package com.herbalife.labs.lab02;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MyMath {
    public int SumOddNumbers(){
        int number = 0;

            for(int i=1; i<=10001; i++){
                if(i%2 == 1){
                    number+=i;
                }
            }
        return number;
    }

    public int SumOddNumbersLamba(){
        return IntStream
                .range(1,10002)
                .filter(e -> e%2 !=0)
                .sum();
    }

    public int Average(){
        int sum= 0;
        for (int i = 0; i<=10001;i++){
            sum+=i;
        }

        int[] exclude = new int[]{ 10, 19, 21, 39, 309, 431, 643, 942, 1209, 7981, 8888, 9910};
        for (int i = 0; i<exclude.length;i++){
            sum-= exclude[i];
        }

        return sum/(10001- exclude.length);

    }

    public int AverageLambda(){
        int sum= IntStream
                .range(1,10002)
                .sum();

        int[] exclude = new int[]{ 10, 19, 21, 39, 309, 431, 643, 942, 1209, 7981, 8888, 9910};
        sum-= Arrays.stream(exclude).sum();

        return sum/(10001- exclude.length);

    }

    public int sumOf(String input){
        int sum = 0;
        String[] items = input.split(" ");
        for (String item :
                items) {
            int number = Integer.parseInt(item);
            sum += number;
        }

        return sum;
    }

        public int sumOfLambda(String input){
        int sum = 0;
        String[] items = input.split(" ");


        return Arrays.stream(items)
                .map(e -> Integer.parseInt(e))
                .reduce((current, next) -> current + next)
                .get();
    }
}
