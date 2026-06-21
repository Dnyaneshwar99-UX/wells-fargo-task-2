package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class FinancialProduct {

    @Id
    @GeneratedValue()
    private long productId;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private String productType;  // e.g., Stock, Bond, Mutual Fund

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double riskRating;

    protected FinancialProduct() {}

    public FinancialProduct(String productName, String productType,
                            String description, double riskRating) {
        this.productName = productName;
        this.productType = productType;
        this.description = description;
        this.riskRating = riskRating;
    }

    public Long getProductId() { return productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getProductType() { return productType; }
    public void setProductType(String productType) { this.productType = productType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getRiskRating() { return riskRating; }
    public void setRiskRating(double riskRating) { this.riskRating = riskRating; }
}