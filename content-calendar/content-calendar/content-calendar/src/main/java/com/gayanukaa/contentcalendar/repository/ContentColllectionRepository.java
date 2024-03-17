package com.gayanukaa.contentcalendar.repository;

import com.gayanukaa.contentcalendar.model.Content;
import com.gayanukaa.contentcalendar.model.Status;
import com.gayanukaa.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentColllectionRepository {
    //Not talking to a database yet
    //Keep a collection of pieces of content in memory

    private final List<Content> contentList = new ArrayList<>();

    public ContentColllectionRepository() {
    }

    public List<Content> findAll() {
        return contentList;
    }

    //Optional - a container object which may or may not contain a non-null value
    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
        //what line 26 does is it takes the content list, streams it, filters it based on the condition
    }

    @PostConstruct
    //The PostConstruct annotation is used on a method that needs to be executed after dependency injection is done
    // to perform any initialization
    private void init() {
        Content content = new Content(
                1,
                "Blog Post",
                "My first blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                ""
        );
        contentList.add(content);
    }

    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean existsById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }
}
