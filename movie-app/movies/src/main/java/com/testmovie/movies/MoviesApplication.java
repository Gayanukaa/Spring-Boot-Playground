package com.testmovie.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//annotations tell the compiler what this class does
@SpringBootApplication
@RestController //lets the framework know this is a REST api controller and not a class
public class MoviesApplication {

	public static void main(String[] args) {

		SpringApplication.run(MoviesApplication.class, args);
		//this is the main method that runs the application
		//we pass the class name and the args to the SpringApplication.run method

	}

	//this is an endpoint that returns a string
	//endpoint is a URL that the API can be accessed from
	//this is a sample api
	//normally we divide application into several layers - service, data access, api
	/*@GetMapping("/root")
	public String apiRoot(){
		return "Welcome to the Movies API";
	}*/

}
