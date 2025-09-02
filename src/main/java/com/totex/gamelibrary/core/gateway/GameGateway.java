package com.totex.gamelibrary.core.gateway;

import com.totex.gamelibrary.core.entities.Game;

import java.util.List;
import java.util.Optional;

public interface GameGateway {

    Game createGame(Game game);
    List<Game> findGames();
    Game findGame(Long id);
    Optional<Game> findGameByTitle(String name);
    boolean existsByTitle(String title);
}
