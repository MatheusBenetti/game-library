package com.totex.gamelibrary.infrastructure.exception;

public class NotFoundGameException extends RuntimeException {
    public NotFoundGameException(String msg) {
        super(msg);
    }
}
