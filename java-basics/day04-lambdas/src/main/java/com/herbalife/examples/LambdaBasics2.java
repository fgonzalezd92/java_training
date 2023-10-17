package com.herbalife.examples;

import java.time.LocalDate;

public class LambdaBasics2 {
    public static void main(String[] args) {
        Greetings greetings = name -> System.out.println("Hey " +name);

        DateFetcher dateFetcher = () -> LocalDate.now().toString();
        var date = dateFetcher.now();
    }
}

interface DateFetcher{
    String now();
}

interface Greetings{
    void hello(String name);
//    void bye(String name);
}
