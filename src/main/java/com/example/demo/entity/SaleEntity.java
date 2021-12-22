package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Sale")
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sino;
    private int salesmanid;
    private int prodid;
    private String salesmanname;
    private String dos;
    @ManyToOne()
    @JoinColumn(name = "prodid",insertable = false,updatable = false)
    private ProductEntity product;

    public SaleEntity() {
    }

    public int getSino() {
        return sino;
    }

    public void setSino(int sino) {
        this.sino = sino;
    }

    public int getSalesmanid() {
        return salesmanid;
    }

    public void setSalesmanid(int salesmanid) {
        this.salesmanid = salesmanid;
    }

    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }

    public String getSalesmanname() {
        return salesmanname;
    }

    public void setSalesmanname(String salesmanname) {
        this.salesmanname = salesmanname;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
