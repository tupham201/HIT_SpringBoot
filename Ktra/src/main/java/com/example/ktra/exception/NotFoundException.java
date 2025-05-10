package com.example.ktra.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends RuntimeException {
  private String message;
  private HttpStatus httpStatus;
  private String[] params;

  public NotFoundException(String message) {
    super(message);
    this.message = message;
  }
  public NotFoundException(String message, HttpStatus httpStatus) {
    super(message);
    this.message = message;
    this.httpStatus = httpStatus;
  }
  public NotFoundException(String message,String[] params) {
    super(message);
    this.message = message;
    this.params = params;
  }
  public NotFoundException(String message, HttpStatus httpStatus, String[] params) {
    super(message);
    this.message = message;
    this.httpStatus = httpStatus;
    this.params = params;
  }

}
