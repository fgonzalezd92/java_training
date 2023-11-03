package com.herbalife;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/sample")
public class SampleResource {
    @GET
    @Path("/division/{a}/{b}")
    public double divide(@PathParam("a") double a, @PathParam("b") double b){
        return a/b;
    }
}
