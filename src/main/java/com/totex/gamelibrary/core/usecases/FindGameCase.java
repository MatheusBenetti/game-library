package com.totex.gamelibrary.core.usecases;

import com.totex.gamelibrary.core.entities.Game;

public interface FindGameCase {
    public Game execute(Long id);
}
