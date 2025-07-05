package com.example.userservice.dto;

public class CustomerResponse {
    private String firstName;
    private String lastName;
    private String email;
    private Long contact;
    private CustomerDto.AddressDto address;
    private Integer storeId;
    private String password;

    @Override
    public String toString() {
        return "CustomerResponse{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", contact=" + contact +
                ", address=" + address +
                ", storeId=" + storeId +
                ", password='" + password + '\'' +
                '}';
    }
}
