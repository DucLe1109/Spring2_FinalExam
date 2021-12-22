package com.example.demo.service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService{

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAllProduct() {
        return productRepo.findAll();
    }
}
