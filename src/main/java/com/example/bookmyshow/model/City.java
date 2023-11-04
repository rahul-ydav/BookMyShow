package com.example.bookmyshow.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class City extends BaseModel{
    private String name;
    private List<Theatre> theatres = new ArrayList<>();
}
