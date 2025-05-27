package com.example.tuan9.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends RuntimeException {

    private String message;
    private HttpStatus status;
    private String[] params;

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, HttpStatus status) {
        super(message);
        this.message = message;
        this.status = status;
    }

    public NotFoundException(String message, String[] param){
        super(message);
        this.message = message;
        this.params = params;
    }

    public NotFoundException(String message, HttpStatus status, String[] param){
        super(message);
        this.message = message;
        this.status = status;
        this.params = param;
    }
}
