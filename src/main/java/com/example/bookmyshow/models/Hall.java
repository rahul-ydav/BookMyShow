package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.MovieFeature;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Hall extends BaseModel {

    private String name;
    @OneToMany(mappedBy = "hall", cascade = CascadeType.PERSIST)
    @Builder.Default
    private List<Seat> seats = new ArrayList<>();
    @ElementCollection
    @Enumerated
    @Builder.Default
    private List<MovieFeature> features = new ArrayList<>();
}