package com.totex.gamelibrary.infrastructure.exception;

public class DuplicateGameException extends RuntimeException {
    public DuplicateGameException(String msg) {
        super(msg);
    }
}
