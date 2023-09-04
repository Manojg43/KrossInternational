package com.KrossInternational.KrossInternational.Models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KIPCode",nullable = false)
    private Long KIPCode;
    @Column(name = "OEPartNo",nullable = false)
    private String OEPartNo;
    @Column(name = "ProductDescription",nullable = false)
    private String ProductDescription;
    @Column(name = "Size",nullable = false)
    private String Size;

    public Product() {
    }

    public Product(Long KIPCode, String OEPartNo, String productDescription, String size) {
        this.KIPCode = KIPCode;
        this.OEPartNo = OEPartNo;
        ProductDescription = productDescription;
        Size = size;
    }

    public Long getKIPCode() {
        return KIPCode;
    }

    public void setKIPCode(Long KIPCode) {
        this.KIPCode = KIPCode;
    }

    public String getOEPartNo() {
        return OEPartNo;
    }

    public void setOEPartNo(String OEPartNo) {
        this.OEPartNo = OEPartNo;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }
}
