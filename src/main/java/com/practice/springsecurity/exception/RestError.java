package com.practice.springsecurity.exception;

public class RestError {

    String message;
    String reason;

    public RestError(String message, String reason) {
        this.message = message;
        this.reason = reason;
    }
}
