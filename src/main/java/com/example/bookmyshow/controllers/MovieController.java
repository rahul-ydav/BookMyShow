package com.example.bookmyshow.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.bookmyshow.dto.CreateMovieDTO;
import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.services.MovieService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/movie")
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;

    @GetMapping("/{movie_id}")
    public Movie getMovie(@PathVariable Long movie_id) {
        return movieService.getMovie(movie_id);
    }
    
    @PostMapping
    public Movie postMovie(@RequestBody CreateMovieDTO request) {
        Movie movie = request.toMovie();
        return movieService.createMovie(movie);
    }
}
