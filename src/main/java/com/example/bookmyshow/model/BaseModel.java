package com.example.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@SuperBuilder
@Setter
@Getter
public class BaseModel {
    Long id;
    Date createdAt;
    Date updatedAt;
}
