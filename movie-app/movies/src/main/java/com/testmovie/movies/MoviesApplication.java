package com.testmovie.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//annotations tell the compiler what this class does
@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {

		SpringApplication.run(MoviesApplication.class, args);
		//this is the main method that runs the application
		//we pass the class name and the args to the SpringApplication.run method

	}

}
