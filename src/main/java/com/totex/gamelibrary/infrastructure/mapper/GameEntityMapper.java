package com.totex.gamelibrary.infrastructure.mapper;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.infrastructure.persistence.GameEntity;
import org.springframework.stereotype.Component;

@Component
public class GameEntityMapper {

    public GameEntity toEntity(Game game) {
        return new GameEntity(game.id(), game.title(), game.developer(), game.releaseDate(), game.genre(), game.console());
    }

    public Game toDomain(GameEntity gameEntity) {
        return new Game(gameEntity.getId(), gameEntity.getTitle(), gameEntity.getDeveloper(), gameEntity.getReleaseDate(), gameEntity.getGenre(), gameEntity.getConsole());
    }
}
