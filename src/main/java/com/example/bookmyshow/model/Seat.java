package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.SeatType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Seat extends BaseModel{
    private Integer rowNo;
    private Integer columnNo;
    private SeatType seatType;
}
