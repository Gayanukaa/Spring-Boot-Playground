package com.testmovie.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data //takes care of getters, setters, equals, hashcode, and toString
@AllArgsConstructor //creates a constructor with all the fields in the class
@NoArgsConstructor //creates a constructor with no arguments
public class Review {

    @Id
    private ObjectId id;
    private String body;

    public Review(String body) {
        this.body = body;
    }
}
