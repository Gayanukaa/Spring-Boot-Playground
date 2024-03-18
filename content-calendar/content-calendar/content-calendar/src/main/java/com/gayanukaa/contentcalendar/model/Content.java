package com.gayanukaa.contentcalendar.model;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

//Records - Don't define properties, just components
//Immutable - Once created, can't be changed
//Data class - Just to hold data
public record Content(
    Integer id,
    @NotBlank //Data validation
    String title,
    String desc,
    Status status,
    Type contentType,
    LocalDateTime dateCreated,
    LocalDateTime dateUpdated,
    String url
    )
{
}
