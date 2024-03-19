package com.gayanukaa.contentcalendar.contoller;


import com.gayanukaa.contentcalendar.config.ContentCalendarProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RESTController - tells Spring that this class will be used to handle HTTP requests
@RestController
public class HomeController {

    //Get value from application.properties into the controller
    //$ is SpEL spring expression language
    /*@Value("${cc.welcomeMessage: Default Welcome Message}")
    private String welcomeMessage;

    @Value("${cc.about}")
    private String about;*/

    /*
    @GetMapping("/")
    public String home() {
        return welcomeMessage;
    }
    */

    //For multiple values
    /*@GetMapping("/")
    public Map<String,String> home() {
        return Map.of("welcomeMessage", welcomeMessage, "about", about);
    }*/

    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public ContentCalendarProperties home() {
        return properties;
    }

}
