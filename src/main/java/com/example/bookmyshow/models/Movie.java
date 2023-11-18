package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.Language;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie extends BaseModel{
    private String name;
    private Double rating;
    private String genre;
    @ElementCollection
    @Enumerated
    private ArrayList<Language> languages;

    @OneToMany(mappedBy = "movie")
    @Builder.Default
    private List<Show> shows = new ArrayList<>();
}
