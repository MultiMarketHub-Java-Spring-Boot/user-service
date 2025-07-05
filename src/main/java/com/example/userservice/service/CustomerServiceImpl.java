package com.example.userservice.service;

import com.example.userservice.dto.Customer;
import com.example.userservice.dto.CustomerDto;
import com.example.userservice.dto.CustomerResponse;
import com.example.userservice.dto.ResponseDto;
import com.example.userservice.entity.AddressEntity;
import com.example.userservice.entity.CustomerEntity;
import com.example.userservice.repository.AddressRepository;
import com.example.userservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, AddressRepository addressRepository) {
        this.customerRepository = customerRepository;
        this.addressRepository = addressRepository;
    }


    @Override
    public ResponseDto<Customer> createCustomer(CustomerDto customerDto) {

        CustomerDto.AddressDto addressDto = customerDto.getAddress();
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCity(addressDto.getCity());
        addressEntity.setState(addressDto.getState());
        addressEntity.setApartment(addressDto.getApartment());
        addressEntity.setStreet(addressDto.getStreet());
        addressEntity.setStreet(addressDto.getStreet());
        addressEntity.setCreated_date(LocalDateTime.now());
        addressEntity.setUpdated_date(LocalDateTime.now());

        CustomerEntity entity = new CustomerEntity();
        entity.setFirstName(customerDto.getFirstName());
        entity.setLastName(customerDto.getLastName());
        entity.setEmail(customerDto.getEmail());
        entity.setContact(customerDto.getPhoneNumber());
        entity.setPswd(customerDto.getPassword());
        entity.setCreatedDate(LocalDateTime.now());
        entity.setUpdatedDate(LocalDateTime.now());

        entity.setAddress(addressEntity);

        AddressEntity savedAddress = addressRepository.save(addressEntity);
        CustomerEntity customerDetails =  customerRepository.save(entity);

        Customer customer = new Customer();

        customer.setId(customerDetails.getId());
        customer.setFullName(customerDetails.getFirstName() + " "+customerDetails.getLastName());
        customer.setLastUpdatedAt(customerDetails.getUpdatedDate());
        customer.setEmail(customerDetails.getEmail());
        ResponseDto<Customer> response = new ResponseDto<>();
        response.setSuccess(true);
        response.setMessage("Customer created successfully");
        response.setStatusCode(200);
        response.setTimestamp(LocalDateTime.now());
        response.setData(customer);

        return response;
    }

    @Override
    public ResponseDto<CustomerResponse> getCustomerInfo(String email) {
        boolean checkMailExists = customerRepository.existsByEmail(email);

        ResponseDto<CustomerResponse> result = new ResponseDto<>();

        if(!checkMailExists) {
            result.setSuccess(false);
            result.setMessage("Invalid mail");
            result.setStatusCode(401);
            result.setTimestamp(LocalDateTime.now());
            result.setData(null);
            return result;
        }else{
            CustomerEntity entity = customerRepository.findByEmail(email);
            CustomerDto.AddressDto address =new CustomerDto.AddressDto();
            System.out.println(address.getCity());
            address.setApartment(entity.getAddress().getApartment());
            address.setState(entity.getAddress().getState());
            address.setCity(entity.getAddress().getCity());
            address.setStreet(entity.getAddress().getStreet());
            CustomerResponse response = new CustomerResponse(
                    entity.getFirstName(),
                    entity.getLastName(),
                    entity.getEmail(),
                    entity.getContact(), address);
            result.setSuccess(true);
            result.setMessage("Customer Fetched Successfully");
            result.setStatusCode(200);
            result.setTimestamp(LocalDateTime.now());
            result.setData(response);
            return result;
        }
    }


}
