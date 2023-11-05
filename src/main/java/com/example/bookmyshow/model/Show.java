package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.MovieFeature;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "bms_shows")
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    private Date start;
    private Date end;
    @ManyToOne
    private Hall hall;
    @ElementCollection
    @Enumerated
    private ArrayList<MovieFeature> features;
    @OneToMany
    private List<ShowSeat> showSeats = new ArrayList<>();
}
