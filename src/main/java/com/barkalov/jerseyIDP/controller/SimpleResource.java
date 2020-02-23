package com.barkalov.jerseyIDP.controller;

import com.barkalov.jerseyIDP.exception.MyCustomException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class SimpleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Hello, World!";
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getException(@PathParam("id") Integer id) {
        if(id < 0) {
            throw new MyCustomException("Id is less than 0!");
        }
        return "Your Id is " + id;
    }
}
