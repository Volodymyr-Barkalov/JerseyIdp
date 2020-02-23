package com.barkalov.jerseyIDP.exception;

public class MyCustomException extends RuntimeException {

    public MyCustomException(String message) {
        super(message);
    }
}
