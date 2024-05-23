package org.example.productrestapi.exception;

public class ProductNameNullException extends RuntimeException{
    public ProductNameNullException(String message) {
        super(message);
    }
}
