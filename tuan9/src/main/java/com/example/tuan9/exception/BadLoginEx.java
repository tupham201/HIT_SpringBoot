package com.example.tuan9.exception;

import org.springframework.http.HttpStatus;

public class BadLoginEx extends RuntimeException {
    private String message;
    private HttpStatus status;
    private String[] params;

    public BadLoginEx(String message) {
        super(message);
    }

    public BadLoginEx(String message, HttpStatus status) {
        super(message);
        this.message = message;
        this.status = status;
    }

    public BadLoginEx(String message, String[] param){
        super(message);
        this.message = message;
        this.params = params;
    }

    public BadLoginEx(String message, HttpStatus status, String[] param){
        super(message);
        this.message = message;
        this.status = status;
        this.params = param;
    }
}
