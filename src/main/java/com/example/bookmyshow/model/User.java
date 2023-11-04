package com.example.bookmyshow.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class User extends BaseModel{
    private String name;
}
