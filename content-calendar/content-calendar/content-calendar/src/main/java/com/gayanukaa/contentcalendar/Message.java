package com.gayanukaa.contentcalendar;

import org.springframework.stereotype.Component;

//Spring needs to be told about the classes it needs to manage for you
//This is done by annotating the class with @Component
@Component
public class Message {

    public String getMessage() {
        return "Hello World";
    }
}
