package com.totex.gamelibrary.infrastructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(DuplicateGameException.class)
    public ResponseEntity<Map<String, String>> handleDuplicateGameException(DuplicateGameException duplicateGameException) {
        Map<String, String> response = new HashMap<>();

        response.put("Error: ", duplicateGameException.getMessage());
        response.put("Message: ", "Please, insert a valid title for your event and try again.");

        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(NotFoundGameException.class)
    public ResponseEntity<Map<String, String>> handleNotFoundGameException(NotFoundGameException notFoundGameException) {
        Map<String, String> response = new HashMap<>();

        response.put("Error: ", notFoundGameException.getMessage());
        response.put("Message: ", "The request event was not found, check the title and try again.");

        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }
}
