package org.example.productrestapi.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ErrObject {
    private  Integer statusCode;
    private String message;
    private Date timestamp;
}