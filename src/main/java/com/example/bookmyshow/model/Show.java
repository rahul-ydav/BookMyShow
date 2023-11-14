package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.MovieFeature;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Getter
@Setter
@Entity
@Table(name = "bms_shows")
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    private Date start_date;
    private Date end_date;
    @ManyToOne
    private Hall hall;
    @ElementCollection
    @Enumerated
    private ArrayList<MovieFeature> features;
    @OneToMany
    private List<ShowSeat> showSeats = new ArrayList<>();
}
