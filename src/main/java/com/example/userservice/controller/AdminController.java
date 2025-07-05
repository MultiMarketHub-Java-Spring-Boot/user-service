package com.example.userservice.controller;

import com.example.userservice.beans.Admin;
import com.example.userservice.service.AdminService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class AdminController {

    AdminService userService;

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

    @GetMapping("/admins/id")
    public ResponseEntity<List<Admin>> getUsersById(@RequestParam("adminId") Integer adminId){
        System.out.println("id");
            List<Admin> getUsersController = userService.getAllUsers(adminId);
        return ResponseEntity.ok(getUsersController);
    }


}
