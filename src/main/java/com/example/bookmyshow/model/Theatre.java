package com.example.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    String name;
    String address;
    @OneToMany
    List<Hall> halls = new ArrayList<>();

//    @OneToMany
//    private List<Show> shows = new ArrayList<>();
}
