package com.herbalife.examples;

import java.util.Arrays;
import java.util.List;

public class MoreAboutStreams {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("Java", "Golang", "Python", "C#", "Ruby");

        langs
                .stream()
                .filter(lang -> {
                    System.out.println("***** Start with P ****");
                    return lang.startsWith("P");
                })
                .forEach(System.out::println);
    }
}
