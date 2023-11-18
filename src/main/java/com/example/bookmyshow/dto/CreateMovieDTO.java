package com.example.bookmyshow.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.bookmyshow.models.Movie;

import lombok.Getter;

import com.example.bookmyshow.enums.Language;
import com.example.bookmyshow.enums.MovieFeature;

@Getter
public class CreateMovieDTO {
    private String name;
    private Double rating;
    private List<Language> languages = new ArrayList<>();
    private List<MovieFeature> features = new ArrayList<>();


    public Movie toMovie() {
        return Movie.builder().name(name).rating(rating).languages(languages).features(features).build();
    }
}
