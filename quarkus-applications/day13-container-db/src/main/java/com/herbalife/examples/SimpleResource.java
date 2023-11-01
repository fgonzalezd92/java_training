package com.herbalife.examples;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.List;

@Path("/simple")
public class SimpleResource {
    @ConfigProperty(name="welcome.message")
    private String welcome;

    @GET
    public String sayHello(){
        return welcome;
    }
}
