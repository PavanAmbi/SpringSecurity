package com.practice.springsecurity.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class DefaultExceptionHandler {

    public ResponseEntity<RestError> handleAuthenticationException(Exception exception) {

        RestError error = new RestError(HttpStatus.UNAUTHORIZED.toString(), exception.getMessage());
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(error);
    }
}
