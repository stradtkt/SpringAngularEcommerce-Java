package com.stradtkt.springbootecommerce.dao;


import com.stradtkt.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
