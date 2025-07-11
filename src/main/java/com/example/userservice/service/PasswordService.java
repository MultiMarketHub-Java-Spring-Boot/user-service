package com.example.userservice.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {
    private final BCryptPasswordEncoder passwordEncoder;

    public PasswordService(BCryptPasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
    }

    public String getHashedPassword(String password){
        return passwordEncoder.encode(password);
    }

}
