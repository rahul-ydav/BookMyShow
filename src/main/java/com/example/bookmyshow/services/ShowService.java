package com.example.bookmyshow.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.bookmyshow.models.Hall;
import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.Seat;
import com.example.bookmyshow.dto.CreateShowRequest;
import com.example.bookmyshow.repositories.ShowRepository;
import com.example.bookmyshow.repositories.ShowSeatRepository;

@Service
public class ShowService {
    private HallService hallService;
    private MovieService movieService;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private SeatService seatService;


    public Show createShow(CreateShowRequest request) {
        Hall hall = hallService.getHall(request.getHallid());
        Movie movie = movieService.getMovie(request.getMovieid());

        Show show = Show.builder()
            .hall(hall)
            .movie(movie)
            .start_date(request.getStart_date())
            .build();
            
        Show savedShow = showRepository.save(show);
        List<Seat> seats = seatService.getAll(request.getHallid());

        List<ShowSeat> showSeats = seats.stream().map(seat -> ShowSeat.builder().seat(seat).show(savedShow).build())
                .toList();

        showSeatRepository.saveAll(showSeats);
        
        return showRepository.save(savedShow.toBuilder().showSeats(showSeats).build());
    }
}
