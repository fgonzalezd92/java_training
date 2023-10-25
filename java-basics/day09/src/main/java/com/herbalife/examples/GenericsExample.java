package com.herbalife.examples;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");

        MyCollection<String> words =  new MyCollection<>();
        words.add("a");
        words.add("b");

        System.out.println(words.getClass().getName());

        MyCollection<Integer> numbers =  new MyCollection<>();
        numbers.add(1);
        numbers.add(2);

        System.out.println(numbers.getClass().getName());
    }
}

interface Entertainment { }

class CD implements Entertainment{ }

class DVD implements Entertainment { }

class MovieCollection<T extends Entertainment>{
    private T item;

    public MovieCollection(T item){
        this.item = item;
    }
}

class MyCollection<T>{
    public static int count = 0;

    public MyCollection() {
        count++;
    }

    private List<T> items = new ArrayList<>();

    public void add(T value){
        items.add(value);
    }
}