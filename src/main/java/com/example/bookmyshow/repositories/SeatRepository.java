package com.example.bookmyshow.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookmyshow.models.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    public List<Seat> findAllByHall_Id(Long id);
}