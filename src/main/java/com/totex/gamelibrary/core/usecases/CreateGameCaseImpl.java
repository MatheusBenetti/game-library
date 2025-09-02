package com.totex.gamelibrary.core.usecases;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.core.gateway.GameGateway;
import com.totex.gamelibrary.infrastructure.exception.DuplicateGameException;

public class CreateGameCaseImpl implements CreateGameCase {
    private final GameGateway gameGateway;

    public CreateGameCaseImpl(GameGateway gameGateway) {
        this.gameGateway = gameGateway;
    }

    @Override
    public Game execute(Game game) {
        if (gameGateway.existsByTitle(game.title())) {
            throw new DuplicateGameException("The title: " + game.title() + " already exists!");
        }

        return gameGateway.createGame(game);
    }
}
