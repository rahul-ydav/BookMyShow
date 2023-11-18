package com.example.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
//@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseModel{
    private String fullName;
    private String city;
    private String phoneNumber;
    private String email;
}
