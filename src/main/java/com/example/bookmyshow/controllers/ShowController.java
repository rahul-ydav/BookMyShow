package com.example.bookmyshow.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmyshow.dto.CreateShowRequest;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.services.ShowService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/show")
@AllArgsConstructor
public class ShowController {
    private ShowService showService;

    @PostMapping()
    public Show createShows(@RequestBody CreateShowRequest request) {
        return showService.createShow(request);
    }
}
