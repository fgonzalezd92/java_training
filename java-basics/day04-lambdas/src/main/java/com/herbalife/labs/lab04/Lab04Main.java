package com.herbalife.labs.lab04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Lab04Main {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Projects/cities.csv";
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        System.out.println(lines);
    }

    private static void generateCitiesList(List<String> lines){
        for (String line :lines) {

        }
    }
}
