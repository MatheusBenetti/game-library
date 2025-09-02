package com.totex.gamelibrary.infrastructure.presentation;

import com.totex.gamelibrary.core.entities.Game;
import com.totex.gamelibrary.core.usecases.CreateGameCase;
import com.totex.gamelibrary.core.usecases.FindGameByTitleCase;
import com.totex.gamelibrary.core.usecases.FindGameCase;
import com.totex.gamelibrary.core.usecases.FindGamesCase;
import com.totex.gamelibrary.infrastructure.dto.GameDto;
import com.totex.gamelibrary.infrastructure.mapper.GameDtoMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/")
public class GameController {

    private final CreateGameCase createGameCase;
    private final FindGameCase findGameCase;
    private final FindGameByTitleCase findGameByTitleCase;
    private final FindGamesCase findGamesCase;
    private final GameDtoMapper gameDtoMapper;

    public GameController(CreateGameCase createGameCase,
                          FindGameCase findGameCase,
                          FindGameByTitleCase findGameByTitleCase,
                          FindGamesCase findGamesCase,
                          GameDtoMapper gameDtoMapper) {
        this.createGameCase = createGameCase;
        this.findGameCase = findGameCase;
        this.findGameByTitleCase = findGameByTitleCase;
        this.findGamesCase = findGamesCase;
        this.gameDtoMapper = gameDtoMapper;
    }

    @PostMapping("create-game")
    public ResponseEntity<Map<String, Object>> createGame(@RequestBody GameDto gameDto) {
        Game newGame = createGameCase.execute(gameDtoMapper.toGame(gameDto));
        Map<String, Object> response = new HashMap<>();

        response.put("Message: ", "Game added successfully!");
        response.put("Game data: ", gameDtoMapper.toDto(newGame));
        return ResponseEntity.ok(response);
    }

    @GetMapping("find-games")
    public List<GameDto> findGame() {
        return findGamesCase.execute().stream().map(gameDtoMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("find-game/{id}")
    public ResponseEntity<Game> findGameById(@PathVariable Long id) {
        Game game = findGameCase.execute(id);
        return ResponseEntity.ok(game);
    }

    @GetMapping("find-game-by-title/{title}")
    public ResponseEntity<Game> findGameByTitle(@PathVariable String title) {
        Game game = findGameByTitleCase.execute(title);
        return ResponseEntity.ok(game);
    }
}
