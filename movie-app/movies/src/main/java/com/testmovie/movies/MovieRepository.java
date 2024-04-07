package com.testmovie.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//MongoRepository is an interface that provides methods to interact with the database
//it takes the type of the entity and the type of the id
//we can use the methods provided by the MongoRepository interface
@Repository //indicates that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{

    //the repository comes with built-in to perform by id
    //but for other search criteria, we have to implement custom methods
    //we can use automatic queries that lets you form queries dynamically from method names

    Optional<Movie> findMovieByImdbId(String imdbId);
    //spring data mongodb will automatically generate the query for us
}