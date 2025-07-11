package com.example.userservice.service;


import com.example.userservice.beans.Admin;
import com.example.userservice.dto.LoginDto;
import com.example.userservice.entity.AdminsEntity;

import java.util.List;

public interface AdminService {

    public Admin createAdmin(Admin admin);
    public List<Admin> getAllUsers(Integer id);
    public String updateUser(Integer id, Admin admin);
    public LoginDto login(String emial);

}
