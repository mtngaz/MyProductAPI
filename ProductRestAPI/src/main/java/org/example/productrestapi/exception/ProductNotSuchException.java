package org.example.productrestapi.exception;

public class ProductNotSuchException extends RuntimeException {
    public ProductNotSuchException(String message) {
        super(message);
    }
}
