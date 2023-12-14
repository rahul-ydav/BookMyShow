package com.example.bookmyshow.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmyshow.dto.CreateHallRequest;
import com.example.bookmyshow.models.Hall;
import com.example.bookmyshow.services.HallService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/hall")
@AllArgsConstructor
public class HallController {
   
    private HallService hallService;

    @PostMapping
    public Hall createHall(@RequestBody CreateHallRequest request) {
        return hallService.createHall(request);
    }
}
