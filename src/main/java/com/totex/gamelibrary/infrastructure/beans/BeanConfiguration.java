package com.totex.gamelibrary.infrastructure.beans;

import com.totex.gamelibrary.core.gateway.GameGateway;
import com.totex.gamelibrary.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateGameCase createGame(GameGateway gameGateway) {
        return new CreateGameCaseImpl(gameGateway);
    }

    @Bean
    public FindGamesCase findGames(GameGateway gameGateway) {
        return new FindGamesCaseImpl(gameGateway);
    }

    @Bean
    public FindGameCase findGame(GameGateway gameGateway) {
        return new FindGameCaseImpl(gameGateway);
    }

    @Bean
    public FindGameByTitleCase findGameByTitle(GameGateway gameGateway) {
        return new FindGameByTitleImpl(gameGateway);
    }
}
