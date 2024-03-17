package com.gayanukaa.contentcalendar.contoller;

import com.gayanukaa.contentcalendar.model.Content;
import com.gayanukaa.contentcalendar.repository.ContentColllectionRepository;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content") //on a class level
//class that accepts HTTP requests and returns JSON responses
@CrossOrigin //setup cors to say that we are going to say which resources are allowed to talk  to the api
public class ContentController {

    /*
    private ContentColllectionRepository repository;

    public ContentController() {
        this.repository = new ContentColllectionRepository();
    }   */
    //Application context responsible for managing all instances of classes.
    //Wwe are not responsible for creating new instances of our classes.
    //Marking it with @Repository has @Component there is an instance of ContentColllectionRepository in the application context
    //This method creates two instances of ContentColllectionRepository in the application context.
    //So we want to get this from the Application context.
    //We want to inject any dependencies that this controller has into the constructor as form of dependency injection.
    //We are dependent on this ContentColllectionRepository to work, so it is a dependency

    private final ContentColllectionRepository repository;
    //final - Once created we don't want to change that

    public ContentController(ContentColllectionRepository repository) {
        this.repository = repository;
    }

    //make a request and find all the pieces of content in the system.
    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}") //using placeholder to make it dynamic
    public Content findById( @PathVariable Integer id) { //@PathVariable - to map method parameter to the URI template variable
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found!"));
                //to avoid returning null, we throw an exception
    }

    //method level
    @ResponseStatus(HttpStatus.CREATED) //to indicate something was created
    @PostMapping("") //will repsond to POST requests
    public void create (@Valid @RequestBody Content content) {
        //@RequestBody - to tell this is going to be sent as part of the request body
        //@Valid - to tell that this is going to be validated
        //this is content we are accepting from the client/ whoever calling the API
        //content needs to be in a particular format - Need data validation
        repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Content content, @PathVariable Integer id) {
        if(!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found!");
        }
        repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }

}

