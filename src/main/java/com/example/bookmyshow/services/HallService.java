package com.example.bookmyshow.services;

import org.springframework.stereotype.Service;

import com.example.bookmyshow.models.Hall;
import com.example.bookmyshow.repositories.HallRepository;

@Service
public class HallService {

    private HallRepository hallRepository;

    public Hall getHall(Long id){
        return hallRepository.findById(id).orElse(null);
    }
}
