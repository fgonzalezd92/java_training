package com.herbalife.labs.lab10;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Movie {
    private int id;
    @JsonSetter("Title")
    private String title;
    @JsonSetter("Year")
    private Integer year;
    @JsonSetter("Language")
    private String language;
    @JsonSetter("Genre")
    private String genre;

    public Movie() {
    }

    public Movie(String title, Integer year, String language, String genre) {
        this.title = title;
        this.year = year;
        this.language = language;
        this.genre = genre;
    }

    public Movie(int id, String title, Integer year, String language, String genre) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.language = language;
        this.genre = genre;
    }

    @JsonGetter("Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonGetter("Year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @JsonGetter("Language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonGetter("Genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", language='" + language + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
