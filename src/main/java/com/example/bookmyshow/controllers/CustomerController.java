package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dto.CreateCustomerDTO;
import com.example.bookmyshow.exceptions.InvalidCustomerException;
import com.example.bookmyshow.models.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public Customer postCustomer(@RequestBody CreateCustomerDTO request) {
        this.validate(request);
        return null;
    }

    private void validate(CreateCustomerDTO request) {
        if(request.getEmail() == null) {
            throw new InvalidCustomerException("Email is mandatory");
        }
    }
}
