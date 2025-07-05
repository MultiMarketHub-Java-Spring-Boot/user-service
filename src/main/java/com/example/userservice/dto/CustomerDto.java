package com.example.userservice.dto;

import java.sql.Timestamp;

public class CustomerDto {

//    String firstName, String lastName, String email,  String address, String phoneNumber,
//    Integer storeId, boolean isEmailVerified, Timestamp createdDate, Timestamp updatedDate) {
    private String firstName;
    private String lastName;
    private String email;
    private Long contact;
    private AddressDto address;
    private Integer storeId;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class AddressDto {
        private String city;
        private String street;
        private String state;
        private String apartment;

        public AddressDto() {
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getApartment() {
            return apartment;
        }

        public void setApartment(String apartment) {
            this.apartment = apartment;
        }
// Getters and Setters
    }
    @Override
    public String toString() {
        return "CustomerDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", storeId=" + storeId +
                '}';
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

    public Long getPhoneNumber() {
        return contact;
    }

    public void setPhoneNumber(Long contact) {
        this.contact = contact;
    }



    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public CustomerDto(String firstName, String lastName, String email, Long contact, AddressDto address, Integer storeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.storeId = storeId;
    }

    public CustomerDto() {
    }
}
