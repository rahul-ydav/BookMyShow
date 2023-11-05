package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.SeatStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Ticket extends BaseModel{
    private Double amount;
    private Show show;
    private ArrayList<Seat> seats;
    private User user;
    private SeatStatus status;
}
