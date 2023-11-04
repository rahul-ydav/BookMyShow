package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.Language;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Builder
@Getter
@Setter
public class Movie extends BaseModel{
    private String name;
    private Double rating;
    private String genre;
    private ArrayList<Language> languages;
}
