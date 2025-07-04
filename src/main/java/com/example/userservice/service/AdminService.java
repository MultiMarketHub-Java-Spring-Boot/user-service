package com.example.userservice.service;


import com.example.userservice.beans.Admin;

import java.util.List;

public interface AdminService {

    public Admin createAdmin(Admin admin);
    public List<Admin> getAllUsers(Integer id);

}
