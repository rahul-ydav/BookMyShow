package com.example.bookmyshow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookmyshow.models.Hall;

@Repository
public interface HallRepository extends JpaRepository<Hall,Long>{
}
