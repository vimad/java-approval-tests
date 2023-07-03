package org.example.approval.service;

import org.example.approval.model.Customer;

public class CustomerService {

    public Customer createCustomer() {
        return Customer.builder()
                .id(1L)
                .age(30)
                .firstName("vinod")
                .lastName("madubashana")
                .email("test@gmail.com")
                .country("Sri Lanka")
                .address("address")
                .isActive(true)
                .userName("vinod")
                .build();
    }
}
