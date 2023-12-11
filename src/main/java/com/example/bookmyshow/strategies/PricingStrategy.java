package com.example.bookmyshow.strategies;

import com.example.bookmyshow.models.Booking;

public interface PricingStrategy {
    Double calculatePrice(Booking booking);
}
