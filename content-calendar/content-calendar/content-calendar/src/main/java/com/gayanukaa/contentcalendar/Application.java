package com.gayanukaa.contentcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		//Happening in the background. Framework has created beans based on the application being built

		//Bean - objects managed by the Spring framework's inversion of control (IoC) container.
		//Essentially, beans are Java objects that are instantiated, assembled, and managed by Spring,
		//rather than being created manually by the application developer.
		//Define a bean on a method that returns some class
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		RestTemplate restTemplate = (RestTemplate) context.getBean("restTemplate");
		System.out.println(restTemplate);
	}

}
