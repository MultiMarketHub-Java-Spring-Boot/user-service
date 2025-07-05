package com.example.userservice.beans;

import java.sql.Timestamp;

public class Customer extends UserDetails{
    public Customer(String firstName, String lastName, String email, String address, String phoneNumber, Integer storeId, boolean isEmailVerified, Timestamp createdDate, Timestamp updatedDate) {
        super(firstName, lastName, email, address, phoneNumber, storeId, isEmailVerified, createdDate, updatedDate);
    }
}
