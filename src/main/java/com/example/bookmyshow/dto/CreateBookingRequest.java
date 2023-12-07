package com.example.bookmyshow.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CreateBookingRequest {
    private Long customerId;
    private Long showId;
    private List<Long> showSeatIds = new ArrayList<>();
}
