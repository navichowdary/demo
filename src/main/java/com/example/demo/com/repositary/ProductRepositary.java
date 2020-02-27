package com.example.demo.com.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.com.entity.loginentity;

@Repository
public interface ProductRepositary extends JpaRepository<loginentity, Long>{
}
