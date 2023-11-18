package com.example.bookmyshow.services;

import com.example.bookmyshow.dto.CreateCustomerDTO;
import com.example.bookmyshow.exceptions.CustomerNotFoundException;
import com.example.bookmyshow.exceptions.EmailAlreadyExsistsException;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.repositories.CustomerRepository;

import lombok.AllArgsConstructor;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public Customer getCustomer(Long id){
        return customerRepository.findById(id)
        .orElseThrow(() -> new CustomerNotFoundException(id));
    }

    public Customer createCustomer(CreateCustomerDTO request){
        String email = request.getEmail();

        Optional<Customer> existingCustomer = customerRepository.findCustomerByEmail(email);

        if (existingCustomer.isPresent()) {
            throw new EmailAlreadyExsistsException(email);
        }
        
        return null;
    }
}
