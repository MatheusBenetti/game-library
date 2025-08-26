package com.totex.gamelibrary.core.entities;

import com.totex.gamelibrary.core.enums.ConsoleType;

import java.time.LocalDate;
import java.util.Set;

public record Game(
        Long id,
        String title,
        String developer,
        LocalDate releaseDate,
        String genre,
        Set<ConsoleType> console
) { }
