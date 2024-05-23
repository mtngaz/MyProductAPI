package org.example.productrestapi.exception;

public class CharacterLimitException extends RuntimeException{
    public CharacterLimitException(String message) {
        super(message);
    }
}