package com.totex.gamelibrary.core.usecases;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.core.gateway.GameGateway;

public class FindGameCaseImpl implements FindGameCase {

    private final GameGateway gameGateway;

    public FindGameCaseImpl(GameGateway gameGateway) {
        this.gameGateway = gameGateway;
    }

    @Override
    public Game execute(Long id) {
        return gameGateway.findGame(id);
    }
}
