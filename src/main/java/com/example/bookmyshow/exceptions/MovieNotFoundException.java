package com.example.bookmyshow.exceptions;

public class MovieNotFoundException extends RuntimeException{
    public MovieNotFoundException(Long movieId){
        super("Movie Not Found for id : " + movieId);
    }
}
