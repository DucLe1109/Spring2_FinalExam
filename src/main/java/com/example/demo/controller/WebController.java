package com.example.demo.controller;

import com.example.demo.entity.ProductEntity;
import com.example.demo.entity.SaleEntity;
import com.example.demo.service.ProductService;
import com.example.demo.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    ProductService productService;

    @Autowired
    SaleService saleService;

    @GetMapping({"/product"})
    public String product_index(Model model) {
        List<ProductEntity> list_product = productService.getAllProduct();
        model.addAttribute("list_product", list_product);
        return "product_index";
    }

    @GetMapping({"/sale"})
    public String sale_index(Model model) {
        List<SaleEntity> list_sale = saleService.getAllSale();
        model.addAttribute("list_sale", list_sale);
        return "sale_index";
    }
}
