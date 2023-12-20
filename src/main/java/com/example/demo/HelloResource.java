package com.example.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
    public String hello1() {
        return "Hello, 我是张三!";
    }
    public String hello2() {
        return "Hello,张三您好 我是李四!";
    }
}