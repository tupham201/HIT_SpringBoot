package com.example.btvn8.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter

public class NotFoundException extends RuntimeException {

    private String message;
    private HttpStatus httpStatus;
    private String[] params;

    public NotFoundException(String message) {
        super(message);
        this.message = message;
        this.httpStatus = HttpStatus.NOT_FOUND;
    }

    private NotFoundException(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
        this.params = null;
    }

    public NotFoundException(String message, String[] params) {
        super(message);
        this.message = message;
        this.params = params;
        this.httpStatus = HttpStatus.NOT_FOUND;
    }

    private NotFoundException(String message, String[] params, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.params = params;
        this.httpStatus = httpStatus;

    }
}
