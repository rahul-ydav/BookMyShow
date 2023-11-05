package com.example.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
//@Table
public class City extends BaseModel{
    private String name;
    @OneToMany
    private List<Theatre> theatres = new ArrayList<>();
}
