package com.example.userservice.controller;

import com.example.userservice.dto.Customer;
import com.example.userservice.dto.CustomerDto;
import com.example.userservice.dto.CustomerResponse;
import com.example.userservice.dto.ResponseDto;
import com.example.userservice.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/api/v1/createUser")
    public ResponseEntity<ResponseDto<Customer>> saveCustomer(@RequestBody CustomerDto customer){
        ResponseDto<Customer> savedCustomers = customerService.createCustomer(customer);
        return ResponseEntity.ok(savedCustomers);
    }

    @GetMapping("/api/v1/getUser")
    public ResponseEntity<ResponseDto<CustomerResponse>> getCustomerByEmail(@RequestParam String email){
        ResponseDto<CustomerResponse> response=  customerService.getCustomerInfo(email);
        return ResponseEntity.ok(response);
    }


}
