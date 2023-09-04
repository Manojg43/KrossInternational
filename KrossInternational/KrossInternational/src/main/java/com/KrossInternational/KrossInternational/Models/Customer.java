package com.KrossInternational.KrossInternational.Models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustId",nullable = false)
    private Long CustId;
    @Column(name = "Name",nullable = false)
    private String CustName;
    @Column(name = "MobileNo",nullable = false)
    private String MobileNo;
    @Column(name = "PO",nullable = false)
    private String PO;

    public Customer() {
    }

    public Customer(Long custId, String custName, String mobileNo, String PO) {
        CustId = custId;
        CustName = custName;
        MobileNo = mobileNo;
        this.PO = PO;
    }

    public Long getCustId() {
        return CustId;
    }

    public void setCustId(Long custId) {
        CustId = custId;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }
}
