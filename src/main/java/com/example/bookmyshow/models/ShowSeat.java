package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeat extends BaseModel{
    @ManyToOne
    @JoinColumn(name = "bms_shows_id")
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated
    private SeatStatus status;
}
