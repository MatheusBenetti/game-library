package com.totex.gamelibrary.infrastructure.beans;

import com.totex.gamelibrary.core.gateway.GameGateway;
import com.totex.gamelibrary.core.usecases.CreateGameCase;
import com.totex.gamelibrary.core.usecases.CreateGameCaseImpl;
import com.totex.gamelibrary.core.usecases.FindGamesCase;
import com.totex.gamelibrary.core.usecases.FindGamesCaseImpl;
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
}
