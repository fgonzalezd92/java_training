package com.herbalife.labs.lab09;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab09 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Projects/cities.csv";
        String fileNameCities = "C:/Projects/cities.txt";
        String fileNameCountries = "C:/Projects/countries.txt";

        List<String> lines = Files.readAllLines(Paths.get(fileName));
        List<City> cities = new ArrayList<>();
//        lines.forEach(System.out::println);
        for (String line :lines) {
            var tokens = line.split(",");
            if(tokens[0].equals("City"))
                continue;
            var city = new City(tokens[0],tokens[1], Double.parseDouble(tokens[2]));
            cities.add(city);
        }

//        cities.forEach(System.out::println);

        var buffer = Files.newBufferedWriter(Paths.get(fileNameCities), StandardCharsets.UTF_8);
        cities.stream()
                .map(x -> x.getName())
                .distinct()
                        .forEach(city -> {

                            try {
                                buffer.write(city);
                                buffer.newLine();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
        buffer.flush();

        var bufferCountries = Files.newBufferedWriter(Paths.get(fileNameCountries), StandardCharsets.UTF_8);
        cities.stream()
                .map(x -> x.getCountry())
                .distinct()
                .forEach(country -> {

                    try {
                        bufferCountries.write(country);
                        bufferCountries.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        bufferCountries.flush();

        Function<City, String> clasifyCitiesByCountry = city -> city.getCountry();
        cities.stream()
                .collect(Collectors.groupingBy(clasifyCitiesByCountry, Collectors.counting())).forEach((key, value) -> System.out.println("Country: %s -> #cities: %d".formatted(key,value)));


        cities.stream().map(x -> x.getName()).forEach(System.out::println);
    }
}
