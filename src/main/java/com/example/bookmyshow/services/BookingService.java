package com.example.bookmyshow.services;

import com.example.bookmyshow.enums.BookingStatus;
import com.example.bookmyshow.enums.SeatStatus;
import com.example.bookmyshow.models.*;
import com.example.bookmyshow.repositories.BookingRepository;
import com.example.bookmyshow.strategies.PricingStrategy;
import org.springframework.stereotype.Service;

import com.example.bookmyshow.dto.CreateBookingRequest;

import java.security.InvalidParameterException;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BookingService {

    public CustomerService customerService;
    public ShowService showService;
    public ShowSeatService showSeatService;
    private BookingRepository bookingRepository;
    private PricingStrategy pricingStrategy;
    
    public Booking createBooking(CreateBookingRequest request) {

        //Step 1 : validate customerId
        Customer customer = customerService.getCustomer(request.getCustomerId());
        if(customer==null){
            throw new NoSuchElementException("Invalid Customer Id: " + request.getCustomerId());
        }

        //Step 2 : validate hallId;
        Show show = showService.getShow(request.getShowId());
        if(show==null){
            throw new NoSuchElementException("Invalid Show Id: " + request.getShowId());
        }

        List<ShowSeat> showSeats = showSeatService.getShowSeats(request.getShowSeatIds());

        for(ShowSeat seat : showSeats){
            if(seat.getStatus()!= SeatStatus.AVAILABLE){
                throw new InvalidParameterException("Seat not available: "+ seat.getSeat().getId());
            }
        }

        for(ShowSeat seat : showSeats){
            seat.setStatus(SeatStatus.LOCKED);
        }
        // Save showSeats
        List<ShowSeat> savedSeats = showSeatService.saveAll(showSeats);

        // Create and save booking

        Booking booking = Booking.builder()
                .customer(customer)
                .show(show)
                .seats(savedSeats)
                .bookedAt(new Date())
                .status(BookingStatus.PENDING)
                .build();

        Double amount = pricingStrategy.calculatePrice(booking);

        Booking withAmount = booking.toBuilder().amount(amount).build();
        return bookingRepository.save(withAmount);
    }
}
