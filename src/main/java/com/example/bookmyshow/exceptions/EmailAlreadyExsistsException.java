package com.example.bookmyshow.exceptions;

public class EmailAlreadyExsistsException extends RuntimeException {
    public EmailAlreadyExsistsException(String email) {
        super(email + " already exists");
    }
}
