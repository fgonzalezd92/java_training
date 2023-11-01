package com.herbalife.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@ApplicationScoped
public class HttpService {
    @ConfigProperty(name="palindrome.api.domain")
    private String domain;
    @ConfigProperty(name="palindrome.api.endpoint")
    private String endpoint;

    public boolean GetIsPalindrome(String word) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient =  HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder(new URI(domain + endpoint + "/" + word)).GET().build();
        Boolean result = false;
        var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        String stringResult = response.body();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        result = objectMapper.readValue(stringResult, Boolean.class);

        return result;
    }
}
