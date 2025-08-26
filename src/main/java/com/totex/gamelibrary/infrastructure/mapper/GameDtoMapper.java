package com.totex.gamelibrary.infrastructure.mapper;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.infrastructure.dto.GameDto;
import org.springframework.stereotype.Component;

@Component
public class GameDtoMapper {

    public GameDto toDto(Game game) {
        return new GameDto(game.id(), game.title(), game.developer(), game.releaseDate(), game.genre(), game.console());
    }

    public Game toGame(GameDto gameDto) {
        return new Game(gameDto.id(), gameDto.title(), gameDto.developer(), gameDto.releaseDate(), gameDto.genre(), gameDto.console());
    }
}
