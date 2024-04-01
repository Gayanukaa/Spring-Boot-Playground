package com.testmovie.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String,String> payload) {
        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"),payload.get("imdbId")),HttpStatus.CREATED);
    }
    //this is a POST request that takes in a JSON payload
    //the payload is a map of key value pairs
    //the key is the name of the field in the JSON payload
    //the value is the value of the field in the JSON payload
    //the @RequestBody annotation tells the framework to map the JSON payload to the payload parameter
    //the ResponseEntity is a wrapper around the response
}
