package com.gayanukaa.contentcalendar.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

//To turn into properties that we can use in our application
@ConfigurationProperties(value = "cc") //prefix
public record ContentCalendarProperties (String welcomeMessage, String about) {

}
