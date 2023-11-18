package com.example.bookmyshow.services;

import org.springframework.stereotype.Service;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.repositories.MovieRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
