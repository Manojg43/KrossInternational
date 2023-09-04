package com.KrossInternational.KrossInternational.Models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_PDIR")
public class PDIR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "InvoiceId")
    private Long InvoiceId;
    @ManyToOne
    @JoinColumn(name = "KIPCode",nullable = false)
    private Product product;
    @Column(name = "PDIRNo")
    private String PDIRNo;
    @Column(name = "Quantity")
    private String Quantity;

    public PDIR() {
    }

    public PDIR(Long invoiceId, Product product, String PDIRNo, String quantity) {
        InvoiceId = invoiceId;
        this.product = product;
        this.PDIRNo = PDIRNo;
        Quantity = quantity;
    }

    public Long getInvoiceId() {
        return InvoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        InvoiceId = invoiceId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getPDIRNo() {
        return PDIRNo;
    }

    public void setPDIRNo(String PDIRNo) {
        this.PDIRNo = PDIRNo;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }
}
