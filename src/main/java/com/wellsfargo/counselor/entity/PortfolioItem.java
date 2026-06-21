package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class PortfolioItem {

    @Id
    @GeneratedValue()
    private long itemId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private FinancialProduct financialProduct;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    protected PortfolioItem() {}

    public PortfolioItem(Portfolio portfolio, FinancialProduct financialProduct,
                         int quantity, double purchasePrice, Date purchaseDate) {
        this.portfolio = portfolio;
        this.financialProduct = financialProduct;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
    }

    public Long getItemId() { return itemId; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

    public FinancialProduct getFinancialProduct() { return financialProduct; }
    public void setFinancialProduct(FinancialProduct fp) { this.financialProduct = fp; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(double purchasePrice) { this.purchasePrice = purchasePrice; }

    public Date getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }
}