package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.MovieFeature;

import java.util.ArrayList;
import java.util.Date;

public class Show {
    private Movie movie;
    private Date start;
    private Date end;
    private Hall hall;
    private ArrayList<MovieFeature> features;
}
