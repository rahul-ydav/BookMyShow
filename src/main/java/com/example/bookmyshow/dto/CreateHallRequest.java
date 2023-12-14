package com.example.bookmyshow.dto;

import java.util.ArrayList;

import com.example.bookmyshow.enums.MovieFeature;

import lombok.Getter;

@Getter
public class CreateHallRequest {
    private int numberOfSeats;
    private ArrayList<MovieFeature> features;
    private String name;
}
