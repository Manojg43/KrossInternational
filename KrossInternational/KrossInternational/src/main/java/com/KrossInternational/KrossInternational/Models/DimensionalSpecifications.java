package com.KrossInternational.KrossInternational.Models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_DimensionalSpecifications")
public class DimensionalSpecifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DimensionalId")
    private Long DimensionalId;
    @ManyToOne
    @JoinColumn(name = "KIPCode")
    private Product product;
    @Column(name = "Parameters")
    private Long Parameters;
    @Column(name = "DSpecifications")
    private Long DSpecifications;

    public DimensionalSpecifications() {
    }

    public DimensionalSpecifications(Long dimensionalId, Product product, Long parameters, Long DSpecifications) {
        DimensionalId = dimensionalId;
        this.product = product;
        Parameters = parameters;
        this.DSpecifications = DSpecifications;
    }

    public Long getDimensionalId() {
        return DimensionalId;
    }

    public void setDimensionalId(Long dimensionalId) {
        DimensionalId = dimensionalId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getParameters() {
        return Parameters;
    }

    public void setParameters(Long parameters) {
        Parameters = parameters;
    }

    public Long getDSpecifications() {
        return DSpecifications;
    }

    public void setDSpecifications(Long DSpecifications) {
        this.DSpecifications = DSpecifications;
    }
}
