package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket extends BaseModel{
    private Double amount;
    @ManyToOne
    private Show show;
    @ManyToMany
    private List<ShowSeat> seats;
    @ManyToOne
    private User user;
    private SeatStatus status;
}
