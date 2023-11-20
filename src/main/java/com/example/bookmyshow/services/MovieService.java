package com.example.bookmyshow.services;

import com.example.bookmyshow.exceptions.MovieExistsException;
import com.example.bookmyshow.exceptions.MovieNotFoundException;
import org.springframework.stereotype.Service;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.repositories.MovieRepository;

import lombok.AllArgsConstructor;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;

    public Movie getMovie(Long movieId) {
        return movieRepository
                .findById(movieId)
                .orElseThrow(() -> new MovieNotFoundException(movieId));
    }

    public Movie createMovie(Movie movie) {
        Optional<Movie> existingMovie = movieRepository
                .findByName(movie.getName());
//                .orElseThrow(() -> new MovieExistsException(movie.getName()));

        if(existingMovie.isPresent()){
            throw new MovieExistsException(movie.getName());
        }

        System.out.println("Existing Movie : " + existingMovie);

        return movieRepository.save(movie);
    }

}
