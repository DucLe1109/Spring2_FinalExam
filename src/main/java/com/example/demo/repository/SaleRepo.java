package com.example.demo.repository;

import com.example.demo.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepo extends JpaRepository<SaleEntity,Integer> {
}
