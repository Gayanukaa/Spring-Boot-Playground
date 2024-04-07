package com.testmovie.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.apache.tomcat.jni.SSLConf.apply;


@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    //MongoTemplate is a class that provides the main API for working with MongoDB
    //Without using repositories, we can use MongoTemplate to interact with the database
    public Review createReview(String reviewBody, String imdbId) {
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
                 .matching(Criteria.where("imdbId").is(imdbId))
                 .apply(new Update().push("reviewIds").value(review.getId()))
                 .first();
        //update the movie with the new review by pushing the review id to the reviewIds array where the imdbId matches the movie

        return review;
    }
}
