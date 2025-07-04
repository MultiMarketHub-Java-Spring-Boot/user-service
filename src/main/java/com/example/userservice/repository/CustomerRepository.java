package com.example.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userservice.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long>{

}
