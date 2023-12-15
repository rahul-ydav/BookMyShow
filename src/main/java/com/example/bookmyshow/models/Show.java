package com.example.bookmyshow.models;

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
public class Show extends BaseModel {
    
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    private Date start_date;
    private Date end_date;
    
    @ManyToOne
    private Hall hall;

    @ElementCollection
    @Enumerated
    @Builder.Default
    private List<MovieFeature> features = new ArrayList<>();

    @OneToMany(mappedBy = "show")
    @Builder.Default
    private List<ShowSeat> showSeats = new ArrayList<>();
}
