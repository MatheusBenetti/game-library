package com.totex.gamelibrary.infrastructure.persistence;

import com.totex.gamelibrary.core.enums.ConsoleType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "games")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String developer;
    private LocalDate releaseDate;
    private String genre;
    private Set<ConsoleType> console;
}
