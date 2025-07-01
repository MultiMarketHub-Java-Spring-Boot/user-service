package com.example.userservice.beans;
import java.sql.Timestamp;

public class Admin extends UserDetails {

public Admin(String firstName, String lastName, String email,  String phoneNumber ,
             String address, Integer storeId , boolean isEmailVerified, Timestamp createdDate,
             Timestamp updatedDate){
            super(firstName,lastName,email,phoneNumber,address,storeId, isEmailVerified , createdDate,
         updatedDate);
}


}
