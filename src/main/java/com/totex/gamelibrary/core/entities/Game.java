package com.totex.gamelibrary.core.entities;

import java.time.LocalDateTime;
import java.util.Set;

public record Game(
        Long id,
        String title,
        String developer,
        LocalDateTime releaseDate,
        String genre,
        Set<String> console
) { }
