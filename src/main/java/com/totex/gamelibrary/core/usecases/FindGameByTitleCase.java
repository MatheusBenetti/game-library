package com.totex.gamelibrary.core.usecases;

import com.totex.gamelibrary.core.entities.Game;

public interface FindGameByTitleCase {
    public Game execute(String title);
}
