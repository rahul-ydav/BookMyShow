package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.SeatStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ShowSeat extends BaseModel{
    private Show show;
    private Seat seat;
    private SeatStatus status;
}
