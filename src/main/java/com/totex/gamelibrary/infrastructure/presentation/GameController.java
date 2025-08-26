package com.totex.gamelibrary.infrastructure.presentation;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.core.usecases.CreateGameCase;
import com.totex.gamelibrary.infrastructure.dto.GameDto;
import com.totex.gamelibrary.infrastructure.mapper.GameDtoMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class GameController {

    private final CreateGameCase createGameCase;
    private final GameDtoMapper gameDtoMapper;

    public GameController(CreateGameCase createGameCase, GameDtoMapper gameDtoMapper) {
        this.createGameCase = createGameCase;
        this.gameDtoMapper = gameDtoMapper;
    }

    @PostMapping("create-game")
    public GameDto createGame(@RequestBody GameDto gameDto) {
        Game newGame = createGameCase.execute(gameDtoMapper.toGame(gameDto));
        return gameDtoMapper.toDto(newGame);
    }

    @GetMapping()
    public String findGame() {
        return "God of War";
    }
}
