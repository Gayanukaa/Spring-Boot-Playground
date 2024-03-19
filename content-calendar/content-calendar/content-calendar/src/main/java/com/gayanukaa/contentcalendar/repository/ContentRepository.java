package com.gayanukaa.contentcalendar.repository;

import com.gayanukaa.contentcalendar.model.Content;
import com.gayanukaa.contentcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

//we are going to extend this to a spring data repository
//to get code out of that class and into a repository
public interface ContentRepository extends ListCrudRepository<Content, Integer>{
    //ListCrudRepository - provides methods for CRUD operations
    //Content - the entity type
    //Integer - the type of the id

    //We don't add the @Repository annotation because spring data will generate an implementation of this interface during runtime
    //At runtime spring will see that we have extended to one of the base repository interfaces and will generate an implementation of this interface

    //Has inbuilt methods - check the documentation

    //Query derivation
    List<Content> findAllByTitleContains(String keyword);
    //Not an actual method in the interface, but spring data will generate the implementation of this method

    @Query("SELECT * FROM Content " +
            "WHERE status = :status")
    List<Content> listByStatus(@Param("status") Status status);

}
