package com.totex.gamelibrary.infrastructure.dto;

import com.totex.gamelibrary.core.enums.ConsoleType;

import java.time.LocalDate;
import java.util.Set;

public record GameDto(
        Long id,
        String title,
        String developer,
        LocalDate releaseDate,
        String genre,
        Set<ConsoleType> console
) { }
