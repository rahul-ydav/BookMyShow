package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.MovieFeature;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Builder
@Getter
@Setter
public class Show extends BaseModel{
    private Movie movie;
    private Date start;
    private Date end;
    private Hall hall;
    private ArrayList<MovieFeature> features;
}
