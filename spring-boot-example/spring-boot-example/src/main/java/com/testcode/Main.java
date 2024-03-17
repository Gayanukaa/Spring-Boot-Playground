package com.testcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication //combination of @EnableAutoConfiguration @ComponentScan @Configuration
@RestController // Checks APIs
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @GetMapping("/greet")
    public GreetResponse greet() {
        GreetResponse response = new GreetResponse(
                "Hello",
                List.of("Java", "Python", "C++"),
                new Person("Alex", 30, 30_000.788)
                );
        return response;
    }
    //JSON: Jackson -> JSON Library/Parser
    record Person (String name, int age, double savings){}

    record GreetResponse( //these are the keys
            String greet,
            List <String> favProgrammingLang,
            Person person
            ){}

    //have to make classes with private final variable, constructor, getter and hashmap
    /*
    class GreetResponse{
        private final String greet;

        GreetResponse(String greet) {
            this.greet = greet;
        }

        public String getGreet() {
            return greet;
        }

        @Override
        public String toString() {
            return "GreetResponse{" +
                    "greet='" + greet + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GreetResponse that = (GreetResponse) o;
            return Objects.equals(greet, that.greet);
        }

        @Override
        public int hashCode() {
            return Objects.hash(greet);
        }
    }*/
}
