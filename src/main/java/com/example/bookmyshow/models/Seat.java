package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Seat extends BaseModel{
    private Integer rowNo;
    private Integer columnNo;
    
    @Enumerated
    private SeatType seatType;

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;
}
