package com.totex.gamelibrary.core.usecases;

import com.totex.gamelibrary.core.entities.Game;

import java.util.List;

public interface FindGamesCase {
    public List<Game> execute();
}
