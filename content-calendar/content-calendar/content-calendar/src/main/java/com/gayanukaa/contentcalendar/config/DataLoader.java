package com.gayanukaa.contentcalendar.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

//CommandLineRunner - an interface which is used to indicate that a bean should run when it is contained within a SpringApplication
//Runs after dependency injection is done as a part of the application startup

@Controller
public class DataLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from the command line runner");
    }
}
