package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.PaymentMethodType;
import com.example.bookmyshow.enums.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    
    private String reference;
    private Double amount;

    @Enumerated
    private PaymentMethodType providerType;

    @Enumerated
    private PaymentStatus status;
}
