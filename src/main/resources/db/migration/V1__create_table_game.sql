-- V1__create_table_game.sql

CREATE TYPE console_enum AS ENUM ('playstation', 'computer', 'xbox', 'switch');

CREATE TABLE Games (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    developer VARCHAR(255) NOT NULL,
    release_date TIMESTAMP NOT NULL,
    genre VARCHAR(255) NOT NULL
);

ALTER TABLE Games ADD COLUMN console console_enum[];