package com.example.bookmyshow.exceptions;

public class MovieExistsException extends RuntimeException{
    public MovieExistsException(String name){
        super("Movie Already Exists in DB having name : " + name);
    }
}
