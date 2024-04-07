package com.testmovie.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

//Document - used to indicate that a class is a candidate for mapping to the database
@Document(collection = "movies")
@Data //takes care of getters, setters, equals, hashcode, and toString
@AllArgsConstructor //creates a constructor with all the fields in the class
@NoArgsConstructor //creates a constructor with no arguments
public class Movie {
    @Id //let the framwork know this is the id field
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;

    private String poster;
    private List<String> backdrops;
    private List<String> genres;
    @DocumentReference //store only ids of reviews and reviews will be stored in a separate collection
    private List<Review> reviewIds; //an embedded relationship
}

//What do these classes do

//Movie - this class is a model class that represents a movie object
//MovieRepository - this class is a repository class that provides methods to interact with the database
//MovieService - this class is a service class that provides logic to interact with the repository and return data to the controller
//MovieController - this class is a controller class that handles incoming requests and returns responses to the client
//Review - this class is a model class that represents a review object

//Explaining all the layers involved - API, Repository, Service, Controller, Model, Database

//Controller layer - this layer handles incoming requests, processes them, and returns responses to the client. It is responsible for routing requests to the appropriate service and returning the response to the client.
//Service layer - this layer contains the business logic of the application. It interacts with the repository layer to fetch data and perform operations on it. It returns the processed data to the controller layer.
//Repository layer - this layer interacts with the database to perform CRUD operations. It provides methods to fetch, save, update, and delete data from the database. It is responsible for interacting with the database and returning data to the service layer.
//Model layer - this layer contains the model classes that represent the data objects in the application. It defines the structure of the data objects and provides methods to access and manipulate the data.
//Api layer - this layer contains the REST API endpoints that the client can interact with. It defines the routes and methods to handle incoming requests and return responses to the client.
//Database - this is the storage layer where the data is stored. It is responsible for persisting the data and providing methods to interact with it.
