package com.example.bookmyshow.controllers;

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
    public Customer postCustomer(@RequestBody CreateCustomerDTO request){
        return null;
    }
}
