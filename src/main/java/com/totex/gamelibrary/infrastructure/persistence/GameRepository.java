package com.totex.gamelibrary.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameEntity, Long> {
}
