package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.Language;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;
    private Double rating;
    private String genre;
    @ElementCollection
    @Enumerated
    private ArrayList<Language> languages;
}
