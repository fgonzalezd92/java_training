package com.herbalife.labs.lab10;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class HttpGetData {
    private String  url;
    private HttpClient httpClient;

    public HttpGetData(String url) {
        this.url = url;
        httpClient =  HttpClient.newBuilder().build();
    }

//    public Movie GetMovieData() throws URISyntaxException, IOException, InterruptedException, JsonProcessingException {
//        HttpRequest request = HttpRequest.newBuilder(new URI(url)).GET().build();
//        Movie result = null;
//
//        var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//        String stringResult = response.body();
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        result = objectMapper.readValue(stringResult, Movie.class);
//
//        return result;
//    }
}
