package com.example.userservice.controller;

import com.example.userservice.beans.Admin;
import com.example.userservice.dto.LoginDto;
import com.example.userservice.dto.LoginRequest;
import com.example.userservice.entity.AdminsEntity;
import com.example.userservice.service.AdminService;
import lombok.extern.java.Log;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class AdminController {

    private static final Logger log = LoggerFactory.getLogger(AdminController.class);
    AdminService userService;

    @Autowired
    public AdminController(AdminService userService){
        this.userService = userService;
    }

    @PostMapping("/admins")
    public ResponseEntity<Admin> addUsers(@RequestBody Admin admin){
        Admin createAdminController = userService.createAdmin(admin);
        System.out.println(createAdminController + "Admin Controller");
        return ResponseEntity.ok(createAdminController);
    }

    @GetMapping("/admins")
    public ResponseEntity<List<Admin>> getUsers(){
        System.out.println("No id");
        List<Admin> getUsersController = userService.getAllUsers(null);
        return ResponseEntity.ok(getUsersController);
    }

    @GetMapping("/admins/{adminId}")
    public ResponseEntity<List<Admin>> getUsersById(@PathVariable("adminId") Integer adminId){
        System.out.println("id");
            List<Admin> getUsersController = userService.getAllUsers(adminId);
        return ResponseEntity.ok(getUsersController);
    }

    @PatchMapping("/admins/{adminId}")
    public ResponseEntity<String> updateUser(@PathVariable("adminId") Integer adminId , @RequestBody Admin admin){
        log.info("PATCH MAPPING");
        String updateUserResult = userService.updateUser(adminId, admin);
        return new ResponseEntity<>(updateUserResult, HttpStatus.OK);
    }

    @GetMapping ("/admin/userLogin")
        public ResponseEntity<LoginDto> login(@RequestParam String email){
         log.info("Inside Login");
        LoginDto loginResponse = userService.login(email);
        log.info(String.valueOf(loginResponse));
        return new ResponseEntity<>(loginResponse, HttpStatus.OK);
        }
}
