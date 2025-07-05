package com.example.userservice.dto;

public class CustomerResponse {
    private String firstName;
    private String lastName;
    private String email;
    private Long contact;
    private CustomerDto.AddressDto address;
//    private Integer storeId;


    public CustomerResponse() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public CustomerDto.AddressDto getAddress() {
        return address;
    }

    public void setAddress(CustomerDto.AddressDto address) {
        this.address = address;
    }

    public CustomerResponse(String firstName, String lastName, String email, Long contact, CustomerDto.AddressDto address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerResponse{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", contact=" + contact +
                ", address=" + address +'\'' +
                '}';
    }
}
