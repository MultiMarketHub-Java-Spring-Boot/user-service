package com.example.userservice.service;

import com.example.userservice.dto.Customer;
import com.example.userservice.dto.CustomerDto;
import com.example.userservice.dto.ResponseDto;

public interface CustomerService {
    public ResponseDto<com.example.userservice.dto.Customer> createCustomer(CustomerDto customer);
    public Customer getCustomerInfo(Long id);

}
