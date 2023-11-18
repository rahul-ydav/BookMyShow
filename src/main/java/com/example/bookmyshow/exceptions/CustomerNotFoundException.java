package com.example.bookmyshow.exceptions;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException(Long id) {
        super("User with " + id + "not found");
    }
}
