package com.example.userservice.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name="address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "apartment_no")
    private String apartment;

    @Column(name="state")
    private String state;

    public AddressEntity() {
    }

    public AddressEntity(Long id, String city, String street, String apartment, String state, LocalDateTime  created_date, LocalDateTime  updated_date) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.apartment = apartment;
        this.state = state;
        this.created_date = created_date;
        this.updated_date = updated_date;
    }

    @Column(name = "created_date")
    private LocalDateTime created_date;

    @Column(name = "updated_date")
    private LocalDateTime  updated_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDateTime  created_date) {
        this.created_date = created_date;
    }

    public LocalDateTime getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(LocalDateTime  updated_date) {
        this.updated_date = updated_date;
    }
}
