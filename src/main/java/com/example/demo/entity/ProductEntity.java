package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodid;

    private String prodname;

    private String description;

    private String dateofmanf;

    private String price;
    @OneToMany(mappedBy = "product")
    private List<SaleEntity> sales;

    public ProductEntity() {
    }

    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateofmanf() {
        return dateofmanf;
    }

    public void setDateofmanf(String dateofmanf) {
        this.dateofmanf = dateofmanf;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<SaleEntity> getSales() {
        return sales;
    }

    public void setSales(List<SaleEntity> sales) {
        this.sales = sales;
    }
}
