package com.gayanukaa.contentcalendar.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gayanukaa.contentcalendar.model.Content;
import com.gayanukaa.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.io.InputStream;
import java.util.List;

//CommandLineRunner - an interface which is used to indicate that a bean should run when it is contained within a SpringApplication
//Runs after dependency injection is done as a part of the application startup

@Profile("!dev")  //Specify which profile(s) the component is intended for
@Component
public class DataLoader implements CommandLineRunner {

    //Load data from json using command line runner
    private final ContentRepository repository; //to persist into the database
    private final ObjectMapper objectMapper; //from jackson library to convert json to java object

    public DataLoader(ContentRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        //System.out.println("Hello from the command line runner");
            //above condition to check if the database is empty
        try (InputStream inputStream = TypeReference.class.getResourceAsStream("data/content.json")) {
            //read the data from the json file and save it into the database
            repository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Content>>() {}));
            //readValue - method to convert json to java object
            //inputStream - the source of the data
            //TypeReference - a class from jackson library
            //List<Content> - the type of the data
        }
    }
}
