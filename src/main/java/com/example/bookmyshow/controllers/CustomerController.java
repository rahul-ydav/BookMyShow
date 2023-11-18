package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dto.CreateCustomerDTO;
import com.example.bookmyshow.exceptions.InvalidCustomerException;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id);
    }

    @PostMapping
    public Customer postCustomer(@RequestBody CreateCustomerDTO request) {
        this.validate(request);
        return customerService.createCustomer(request);
    }

    private void validate(CreateCustomerDTO request) {
        if(request.getEmail() == null) {
            throw new InvalidCustomerException("Email is mandatory");
        }
    }
}
