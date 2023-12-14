package com.example.bookmyshow.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.bookmyshow.models.Seat;
import com.example.bookmyshow.repositories.SeatRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SeatService {
    private SeatRepository seatRepository;

    public List<Seat> getAll(Long id) {
        return seatRepository.findAllByHall_Id(id);
    }

    public List<Seat> saveAll(List<Seat> seats) {
        return seatRepository.saveAll(seats);
    }
}
