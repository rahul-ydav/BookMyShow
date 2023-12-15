package com.example.bookmyshow.services;

import com.example.bookmyshow.dto.CreateCustomerDTO;
import com.example.bookmyshow.exceptions.CustomerNotFoundException;
import com.example.bookmyshow.exceptions.EmailAlreadyExsistsException;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repositories.CustomerRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;
    private UserService userService;

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

        User user =  userService.createUser(request.getUsername(), request.getPassword());

        Customer customer = Customer.builder()
                .fullName(request.getFullName())
                .city(request.getCity())
                .phoneNumber(request.getPhoneNumber())
                .email(request.getEmail())
                .user(user)
                .build();

        return customerRepository.save(customer);
    }
}
