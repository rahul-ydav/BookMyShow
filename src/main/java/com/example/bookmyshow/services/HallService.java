package com.example.bookmyshow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookmyshow.dto.CreateHallRequest;
import com.example.bookmyshow.enums.SeatType;
import com.example.bookmyshow.models.Hall;
import com.example.bookmyshow.models.Seat;
import com.example.bookmyshow.repositories.HallRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HallService {
    private HallRepository hallRepository;
    private SeatService seatService;

    public Hall getHall(Long id) {
        return hallRepository.findById(id).orElse(null);
    }
    
    public Hall createHall(CreateHallRequest request) {

        List<Seat> seats = new ArrayList<Seat>();

        for (int i = 0; i < request.getNumberOfSeats(); i++) {
            Seat seat = Seat.builder().seatType(SeatType.GOLD).columnNo(i % 4).rowNo(i / 4).build();
            seats.add(seat);
        }

        // List<Seat> savedSeats = seatService.saveAll(seats);
        
        Hall hall = Hall.builder().seats(seats).name(request.getName()).features(request.getFeatures()).build();
        Hall savedHall = hallRepository.save(hall);
        
        // seats.forEach(seat -> seat.setHall(savedHall));
        // seatService.saveAll(seats);

        return savedHall;
    }
}
