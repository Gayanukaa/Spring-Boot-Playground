package com.gayanukaa.contentcalendar.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//this file and package are created for
// file - to define beans
// package - to keep all the configuration classes
@Configuration // When to define a bean it is inside a configuration class
public class MyWebConfig {

    @Bean //Spring will manage this bean. It will be available for autowiring
    //RestTemplate - client to call out to public API within organisation
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build(); // return new instance of RestTemplate
    }
}
