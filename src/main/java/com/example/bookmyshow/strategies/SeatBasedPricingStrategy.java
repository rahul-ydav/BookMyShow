package com.example.bookmyshow.strategies;

import com.example.bookmyshow.enums.SeatType;
import com.example.bookmyshow.models.Booking;
import org.springframework.stereotype.Component;

@Component
public class SeatBasedPricingStrategy implements PricingStrategy{

    @Override
    public Double calculatePrice(Booking booking) {
        return booking.getSeats().stream().mapToDouble(
                seat -> getPrice(seat.getSeat().getSeatType())
        ).sum();
    }

    private static double getPrice(SeatType seatType){
        switch(seatType){
            case VIP -> {
                return 2000.0;
            }
            case PLATINUM -> {
                return 1000.0;
            }
            case GOLD -> {
                return 500.0;
            }
            case SILVER -> {
                return 250.0;
            }
        }

        throw new IllegalArgumentException("Invalid type: " + seatType);
    }
}
