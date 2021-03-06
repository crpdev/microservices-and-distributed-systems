package com.crpdev.mds.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public void registerCustomer(CustomerRegistrationRequest request){
        Customer customer = Customer.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
        // todo: check if email is valid
        // todo: check if email is already taken
        // todo: save customer to db
    }
}
