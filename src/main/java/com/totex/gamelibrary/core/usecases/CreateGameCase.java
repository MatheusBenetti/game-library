package com.totex.gamelibrary.core.usecases;

import com.totex.gamelibrary.core.entities.Game;

public interface CreateGameCase {
    public Game execute(Game game);
}
