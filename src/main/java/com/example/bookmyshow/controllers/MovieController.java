package com.example.bookmyshow.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmyshow.dto.CreateMovieDTO;
import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.services.MovieService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/movie")
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;

    @GetMapping()
    public Movie getMovie() {
        return null;
    }
    
    @PostMapping
    public Movie postMovie(@RequestBody CreateMovieDTO request) {
        Movie movie = request.toMovie();
        return movieService.createMovie(movie);
    }
}
