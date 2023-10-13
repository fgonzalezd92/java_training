package com.herbalife.examples.day03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;

public class CorePackages {
    public static void main(String[] args) throws IOException {
        //java lang is the base package which contains classes like String, Object, Exception, etc

        //java.sql package is used to work with DB


        Date dt = new Date();
        LocalDate localDate = LocalDate.now();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("en-US"));

        List<String> lines = Files.readAllLines(Paths.get("~/readme.txt"));
        System.out.println(lines);


        List<String> langs = new LinkedList<>();
        langs.add("Java");
        langs.add("C#");
        langs.add("Golang");

        for (int i = 0; i < langs.size(); i++) {
            System.out.println(langs.get(i));
        }

        Set<String> cities = new HashSet<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Houston");
        cities.add("Pune");
        System.out.println(cities.size());

        Map<Integer, String> romanNumerals = new HashMap<>();
        romanNumerals.put(1,"I");
        romanNumerals.put(2,"II");
        romanNumerals.put(3,"IIII");
    }
}
