package com.testjoins.jpajoins.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testjoins.jpajoins.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
