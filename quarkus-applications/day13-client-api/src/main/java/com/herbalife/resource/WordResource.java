package com.herbalife.resource;

import com.herbalife.service.HttpService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.io.IOException;
import java.net.URISyntaxException;

@Path("/word")
public class WordResource {
    @Inject
    HttpService httpService;

    @GET
    @Path("/{word}")
    public boolean GetWord(@PathParam("word") String word) throws URISyntaxException, IOException, InterruptedException {
        return httpService.GetIsPalindrome(word);
    }
}
