package com.testjoins.jpajoins.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testjoins.jpajoins.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
