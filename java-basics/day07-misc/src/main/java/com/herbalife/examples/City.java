package com.herbalife.examples;

import java.util.List;

public class City {
    private String name;
    private String country;
    private long population;

    public City(String name, String country, long population) {
        this.country = country;
        this.name = name;
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", population=" + population +
                '}';
    }
}
