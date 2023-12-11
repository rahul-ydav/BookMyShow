package com.example.bookmyshow.services;

import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.repositories.ShowSeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowSeatService {

    public ShowSeatRepository showSeatRepository;
    public List<ShowSeat> getShowSeats(List<Long> ids){
        return showSeatRepository.findAllById(ids);
    }

    public List<ShowSeat> saveAll(List<ShowSeat> showSeats) {
        return showSeatRepository.saveAll(showSeats);
    }
}
