package com.herbalife.labs.lab04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab04 {
    public static void main(String[] args) {

        Map<String, List<City>> citiesByCountry = new HashMap<>();

        try {
            List<String> data = GetData.ReturnListOfData("C:\\Projects\\cities.csv");

            for (int i = 0; i < data.size(); i++) {
                String line = data.get(i);
                var result = line.split(",");
                var country =  result[1];
                var city = new City(result[0], Integer.parseInt(result[2]));

                if(citiesByCountry.get(country) == null)
                {
                    List<City> cities = new ArrayList<>();
                    cities.add(city);
                    citiesByCountry.put(country, cities);
                }
                else{
                    var listOfCitiesByCountry = citiesByCountry.get(country);
                    listOfCitiesByCountry.add(city);
                }


            }
            City largest = null;
            City smallest = null;
            for (Map.Entry<String, List<City>> entry : citiesByCountry.entrySet())
                {
                System.out.println("Country: %s".formatted(entry.getKey()));
                for (City city: entry.getValue()) {
                    System.out.println("\t- %s".formatted(city.getName()));
                    if(largest==null)
                        largest = city;
                    if(largest==null)
                        smallest = city;
                }
            }


            
        }
        catch (IOException ex){
            System.out.format("I/O error: %s%n", ex);
        }
        catch (NullPointerException ex){
            System.out.format("NullPointerException error: %s%n", ex);
        }
    }
}
 class  GetData{
    public static List<String> ReturnListOfData(String url) throws IOException {
        Path filePath = Paths.get(url);
        List<String> lines = Files.readAllLines(filePath);
        lines.remove(0);
        return lines;
    }
}

