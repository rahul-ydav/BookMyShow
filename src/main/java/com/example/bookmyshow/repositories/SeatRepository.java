package com.example.bookmyshow.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookmyshow.models.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
    public List<Seat> findAllByHall_Id(Long id);
}