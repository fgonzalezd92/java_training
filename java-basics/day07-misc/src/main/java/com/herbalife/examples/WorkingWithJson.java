package com.herbalife.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WorkingWithJson {
    private static List<String> lines = null;
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Projects/cities.csv";
        lines = Files.readAllLines(Paths.get(fileName));

//        var result =lines.stream()
//                .skip(1)
//                .map(x -> {var tokens = x.split("1"); return new City(tokens[0], tokens[1], Long.parseLong(tokens[2]));}).toList();

    }
}
