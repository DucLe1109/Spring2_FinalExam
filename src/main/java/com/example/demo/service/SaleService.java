package com.example.demo.service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.entity.SaleEntity;
import com.example.demo.repository.ProductRepo;
import com.example.demo.repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaleService implements ISaleService{
    @Autowired
    SaleRepo saleRepo;

    @Override
    public List<SaleEntity> getAllSale() {
        return saleRepo.findAll();
    }
}
