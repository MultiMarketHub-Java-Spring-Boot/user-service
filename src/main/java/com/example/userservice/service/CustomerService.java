package com.example.userservice.service;

import com.example.userservice.dto.Customer;
import com.example.userservice.dto.CustomerDto;
import com.example.userservice.dto.CustomerResponse;
import com.example.userservice.dto.ResponseDto;

public interface CustomerService {
    public ResponseDto<com.example.userservice.dto.Customer> createCustomer(CustomerDto customer);
    public ResponseDto<CustomerResponse> getCustomerInfo(String email);
//    List<CustomerEntity> findByEmail(String email);

}
