package com.totex.gamelibrary.infrastructure.persistence;

import com.totex.gamelibrary.core.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository<GameEntity, Long> {
    Optional<Game> findByTitleIgnoreCase(String title);


}
