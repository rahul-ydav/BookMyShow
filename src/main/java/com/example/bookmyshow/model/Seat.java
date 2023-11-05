package com.example.bookmyshow.model;

import com.example.bookmyshow.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private Integer rowNo;
    private Integer columnNo;
    @Enumerated
    private SeatType seatType;
}
