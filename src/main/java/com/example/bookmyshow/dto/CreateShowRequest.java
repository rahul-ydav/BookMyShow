package com.example.bookmyshow.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;

import lombok.Getter;

@Getter
public class CreateShowRequest {

    private Long movieid;
    private Date start_date;
    private Date end_date;
    private Long hallid;
    private String[] features ;
    private List<Integer> showSeatIds = new ArrayList<>();
    
    public Show createShow() {
        ArrayList<ShowSeat> showSeatLists = new ArrayList<>();
        return Show.builder().end_date(end_date).start_date(start_date).showSeats(showSeatLists).build();
    }

}
