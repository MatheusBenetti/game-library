package com.totex.gamelibrary.infrastructure.gateway;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.core.gateway.GameGateway;

import java.util.List;

public class GameRepositoryGateway implements GameGateway {
    @Override
    public Game createGame(Game game) {
        return null;
    }

    @Override
    public List<Game> findGames() {
        return List.of();
    }

    @Override
    public Game findGame() {
        return null;
    }
}
