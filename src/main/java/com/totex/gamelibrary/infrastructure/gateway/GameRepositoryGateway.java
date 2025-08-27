package com.totex.gamelibrary.infrastructure.gateway;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.core.gateway.GameGateway;
import com.totex.gamelibrary.infrastructure.mapper.GameEntityMapper;
import com.totex.gamelibrary.infrastructure.persistence.GameEntity;
import com.totex.gamelibrary.infrastructure.persistence.GameRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameRepositoryGateway implements GameGateway {

    private final GameRepository gameRepository;
    private final GameEntityMapper gameEntityMapper;

    public GameRepositoryGateway(GameRepository gameRepository, GameEntityMapper gameEntityMapper) {
        this.gameRepository = gameRepository;
        this.gameEntityMapper = gameEntityMapper;
    }

    @Override
    public Game createGame(Game game) {
        GameEntity entity = gameEntityMapper.toEntity(game);
        GameEntity newGame = gameRepository.save(entity);
        return gameEntityMapper.toDomain(newGame);
    }

    @Override
    public List<Game> findGames() {
        return gameRepository.findAll().stream().map(gameEntityMapper::toDomain).toList();
    }

    @Override
    public Game findGame() {
        return null;
    }
}
