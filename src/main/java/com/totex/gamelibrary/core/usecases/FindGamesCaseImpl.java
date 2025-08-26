package com.totex.gamelibrary.core.usecases;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.core.gateway.GameGateway;

import java.util.List;

public class FindGamesCaseImpl implements FindGamesCase {
    private final GameGateway gameGateway;

    public FindGamesCaseImpl(GameGateway gameGateway) {
        this.gameGateway = gameGateway;
    }

    public List<Game> execute() {
        return gameGateway.findGames();
    }
}
