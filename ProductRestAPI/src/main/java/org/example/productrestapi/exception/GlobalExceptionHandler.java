package org.example.productrestapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotSuchException.class)
    public ResponseEntity<ErrObject> handleProductNotFoundException(ProductNotSuchException ex) {
        ErrObject errObject = new ErrObject(HttpStatus.NOT_FOUND.value(), ex.getMessage(), new Date());

        return new ResponseEntity<>(errObject, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({CharacterLimitException.class, ProductNameNullException.class, ProductPriceException.class})
    public ResponseEntity<ErrObject> handleCharacterLimitException(RuntimeException ex) {
        ErrObject errObject = new ErrObject(HttpStatus.BAD_REQUEST.value(), ex.getMessage(), new Date());

        return new ResponseEntity<>(errObject, HttpStatus.BAD_REQUEST);
    }
}