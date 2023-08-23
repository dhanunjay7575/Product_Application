package com.jay.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jay.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
