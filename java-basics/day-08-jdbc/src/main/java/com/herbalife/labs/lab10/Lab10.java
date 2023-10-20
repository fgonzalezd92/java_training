package com.herbalife.labs.lab10;

import java.io.IOException;
import java.net.URISyntaxException;

public class Lab10 {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        var httpGetData = new HttpGetData("http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f&t=Top%20Gun");

        var result = httpGetData.GetMovieData();

        System.out.println(result);

//        MovieDBActions.Save(result);
        MovieDBActions.GetAll();
    }
}
