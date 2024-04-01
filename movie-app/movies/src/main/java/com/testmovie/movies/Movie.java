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
