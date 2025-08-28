package com.totex.gamelibrary.infrastructure.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Set;

public record GameDto(
        Long id,
        String title,
        String developer,
        @JsonProperty("release_date") LocalDateTime releaseDate,
        String genre,
        Set<String> console
) { }
