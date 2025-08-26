package com.totex.gamelibrary.core.usecases;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.core.gateway.GameGateway;

public class CreateGameCaseImpl implements CreateGameCase {
    private final GameGateway gameGateway;

    public CreateGameCaseImpl(GameGateway gameGateway) {
        this.gameGateway = gameGateway;
    }

    @Override
    public Game execute(Game game) {
        return gameGateway.createGame(game);
    }
}
