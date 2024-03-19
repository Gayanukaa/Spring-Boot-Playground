package com.gayanukaa.contentcalendar.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//CommandLineRunner - an interface which is used to indicate that a bean should run when it is contained within a SpringApplication
//Runs after dependency injection is done as a part of the application startup

@Profile("!dev")  //Specify which profile(s) the component is intended for
@Component
public class DataLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from the command line runner");
    }
}
