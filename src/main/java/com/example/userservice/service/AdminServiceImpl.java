package com.example.userservice.service;

import com.example.userservice.Exception.NotFoundException;
import com.example.userservice.service.PasswordService;
import com.example.userservice.beans.Admin;
import com.example.userservice.entity.AdminsEntity;
import com.example.userservice.repository.AdminRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.util.Optional;

@Slf4j
@Service
public class AdminServiceImpl implements AdminService {

    private  AdminRepository adminRepository;
    private  PasswordService passwordService;


    public AdminServiceImpl(AdminRepository adminRepository, PasswordService passwordService){
        this.adminRepository = adminRepository;
        this.passwordService = passwordService;
    }

    public Admin createAdmin(Admin admin){
     if(adminRepository.countAdminByEmail(((Admin)admin).getEmail()) ==0){
         AdminsEntity adminsEntity = convertToAdminsEntity((Admin)admin);
         Timestamp timeStamp = adminRepository.findCurrentTimeStamp();
         adminsEntity.setCreatedDate(timeStamp);
         adminsEntity.setUpdatedDate(timeStamp);
         adminsEntity.setEmailVerified(false);
         adminsEntity.setPassword(passwordService.getHashedPassword(((Admin)admin).getPassword()));
         return convertAdminEntityToAdmin(adminRepository.save(adminsEntity));

     }
     else{
         throw new IllegalArgumentException("This Email address "+ ((Admin)admin)+ " is already associated with Admin");
     }

    }

    public List<Admin> getAllUsers(Integer id){
        List<AdminsEntity> adminsEntity = new ArrayList<>();
        if(id == null){

         adminsEntity = adminRepository.findAll();
         if(adminsEntity.isEmpty()){
             throw new NotFoundException("No Admins Found");
         }

     }
     else{
         Optional<AdminsEntity> adminsEntityById = adminRepository.findById(id);
         if(adminsEntity==null){
             throw new NotFoundException("No Admin found with this ID: {id}");
         }
         else{
             adminsEntity.add(adminsEntityById.get());
         }
     }
     log.info("Admins Found");
        return convertAdminEntityListToAdmin(adminsEntity);
    }

    public AdminsEntity convertToAdminsEntity(Admin admin){
        return new AdminsEntity( admin.getFirstName() ,admin.getLastName()
                , admin.getPassword(), admin.getEmail(), admin.getAddress(),
                admin.getPhoneNumber() , admin.getStoreId());
    }


    public Admin convertAdminEntityToAdmin(AdminsEntity adminsEntity){
        return new Admin(adminsEntity.getFirstName(),adminsEntity.getLastName() ,
                adminsEntity.getEmail(), adminsEntity.getPhoneNumber(), adminsEntity.getAddress() ,
                adminsEntity.getStoreId() , adminsEntity.getEmailVerified(), adminsEntity.getCreatedDate(),
                adminsEntity.getUpdatedDate() );
    }

    public List<Admin> convertAdminEntityListToAdmin(List<AdminsEntity> adminsEntities){
        List<Admin> adminsEntity = new ArrayList<>();
        for(AdminsEntity adminsEnt : adminsEntities){
            adminsEntity.add(convertAdminEntityToAdmin(adminsEnt));
        }
        return adminsEntity;
    }







}
