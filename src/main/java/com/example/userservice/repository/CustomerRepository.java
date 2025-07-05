package com.example.userservice.repository;

import com.example.userservice.dto.CustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userservice.entity.CustomerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long>{

    boolean existsByEmail(String email);

    @Query("SELECT new com.example.userservice.dto.CustomerResponse(c.firstName,c.lastName,c.email,c.contact,c.storeId,c.address) FROM CustomerEntity c where c.email=:email")
    CustomerResponse fetchCustomerByMail(String email);
}
