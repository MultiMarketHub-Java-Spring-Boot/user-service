package com.example.userservice.repository;

import com.example.userservice.dto.LoginDto;
import com.example.userservice.entity.AdminsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;

public interface  AdminRepository extends JpaRepository<AdminsEntity,Integer> {

    @Query("SELECT COUNT(a) FROM AdminsEntity a WHERE a.email= :email")
    Long countAdminByEmail(@Param("email") String email);

    @Query(value = "SELECT CURRENT_TIMESTAMP", nativeQuery = true)
    Timestamp findCurrentTimeStamp();

    @Query("SELECT a FROM  AdminsEntity a WHERE a.id = :id")
    AdminsEntity findUserById(@Param("id") Integer id);

    @Query("SELECT new com.example.userservice.dto.LoginDto(a.id, a.firstName,  a.role, a.email, a.password) FROM AdminsEntity a WHERE a.email = :email")
    LoginDto findUserByEmail(@Param("email") String email);

}
