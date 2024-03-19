package com.gayanukaa.contentcalendar;

import com.gayanukaa.contentcalendar.model.Content;
import com.gayanukaa.contentcalendar.model.Status;
import com.gayanukaa.contentcalendar.model.Type;
import com.gayanukaa.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;


//This is the entry point of the application
//@SpringBootApplication - tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
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
		/*ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		RestTemplate restTemplate = (RestTemplate) context.getBean("restTemplate");
		System.out.println(restTemplate);*/

		SpringApplication.run(Application.class, args);

	}

	//DataLoader is a functional interface, so we can use a lambda expression
	@Bean //To create an instance of a class using method
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		//great place to do some bootstrapping - the process of initializing a system
		//return args -> System.out.println("Hello");

		//to programmatically insert data into the database
		return args -> {
			//insert some data into the database using ContentRepository
			Content content = new Content(
					null,
					"Trial Post",
					"Using the command line runner to insert data",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					""
			);
			repository.save(content);
		};
	}

}
