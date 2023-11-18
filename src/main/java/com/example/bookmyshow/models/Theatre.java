package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Theatre extends BaseModel{
    String name;
    String address;
    @OneToMany
    @Builder.Default
    List<Hall> halls = new ArrayList<>();

//    @OneToMany
//    private List<Show> shows = new ArrayList<>();
}
