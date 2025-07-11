package com.example.userservice.dto;

public class LoginRequest {
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public LoginRequest() {
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String email;
    private String password;

}
