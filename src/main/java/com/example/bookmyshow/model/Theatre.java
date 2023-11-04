package com.example.bookmyshow.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class Theatre extends BaseModel{
    String name;
    String address;
    List<Hall> halls = new ArrayList<>();
}
