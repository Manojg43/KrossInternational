package com.KrossInternational.KrossInternational.Models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_PhysicalSpecifiction")
public class PhysicalSpecifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PhysicalId",nullable = false)
    private Long PhysicalId;
    @ManyToOne
    @JoinColumn(name = "KIPCode")
    private Product product;
    @Column(name = "PCharacteristics",nullable = false)
    private Long PCharacteristics;
    @Column(name = "PSpecifications",nullable = false)
    private Long PSpecifications;

    public PhysicalSpecifications() {
    }

    public PhysicalSpecifications(Long physicalId, Product product, Long PCharacteristics, Long PSpecifications) {
        PhysicalId = physicalId;
        this.product = product;
        this.PCharacteristics = PCharacteristics;
        this.PSpecifications = PSpecifications;
    }

    public Long getPhysicalId() {
        return PhysicalId;
    }

    public void setPhysicalId(Long physicalId) {
        PhysicalId = physicalId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getPCharacteristics() {
        return PCharacteristics;
    }

    public void setPCharacteristics(Long PCharacteristics) {
        this.PCharacteristics = PCharacteristics;
    }

    public Long getPSpecifications() {
        return PSpecifications;
    }

    public void setPSpecifications(Long PSpecifications) {
        this.PSpecifications = PSpecifications;
    }
}
