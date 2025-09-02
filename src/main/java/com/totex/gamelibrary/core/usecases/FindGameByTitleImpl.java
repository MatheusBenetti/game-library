package com.totex.gamelibrary.core.usecases;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.core.gateway.GameGateway;
import com.totex.gamelibrary.infrastructure.exception.NotFoundGameException;

public class FindGameByTitleImpl implements FindGameByTitleCase {

    private final GameGateway gameGateway;

    public FindGameByTitleImpl(GameGateway gameGateway) {
        this.gameGateway = gameGateway;
    }

    @Override
    public Game execute(String title) {
        return gameGateway.findGameByTitle(title).orElseThrow(() -> new NotFoundGameException("Game with name: " + title + " not found!"));
    }
}
