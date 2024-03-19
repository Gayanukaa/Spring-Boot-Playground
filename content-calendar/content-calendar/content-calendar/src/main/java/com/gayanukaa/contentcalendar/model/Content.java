package com.gayanukaa.contentcalendar.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

//Records - Don't define properties, just components
//Immutable - Once created, can't be changed
//Data class - Just to hold data

//@Table(value = "tbl_content") //@Table - maps the class to the table in the database
public record Content(
        @Id //This is an identifier
        Integer id,
        @NotBlank //Data validation
        //@Column("str_title") //Column - maps the property to the column in the database
        String title,
        String description,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
    )
{
}

//DTO - Data Transfer Object is an object that carries data between processes (server and client)
//Entity - Class whose purpose is to store data in a database
//POJO - Plain Old Java Object. Doesn't have to extend or implement other framework code. Has no restrictions

//This content record class is an entity class