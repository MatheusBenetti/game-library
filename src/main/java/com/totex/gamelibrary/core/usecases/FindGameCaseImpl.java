package com.totex.gamelibrary.core.usecases;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.core.gateway.GameGateway;

import java.util.List;

public class FindGameCaseImpl implements FindGameCase {
    private final GameGateway gameGateway;

    public FindGameCaseImpl(GameGateway gameGateway) {
        this.gameGateway = gameGateway;
    }

    public List<Game> execute() {
        return gameGateway.findGames();
    }
}
