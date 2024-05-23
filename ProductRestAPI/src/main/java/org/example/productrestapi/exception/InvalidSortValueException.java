package org.example.productrestapi.exception;

public class InvalidSortValueException extends RuntimeException{
    public InvalidSortValueException(String message) {
        super(message);
    }
}
