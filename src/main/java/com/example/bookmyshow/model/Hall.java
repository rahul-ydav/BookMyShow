package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.MovieFeature;
import com.example.bookmyshow.enums.SeatType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Hall extends BaseModel {

    private String name;
    @OneToMany
    private List<Seat> seats = new ArrayList<>();
    @ElementCollection
    @Enumerated
    private List<MovieFeature> features = new ArrayList<>();
}