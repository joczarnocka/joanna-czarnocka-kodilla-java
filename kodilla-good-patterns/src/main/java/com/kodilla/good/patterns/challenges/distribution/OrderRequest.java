package com.kodilla.good.patterns.challenges.distribution;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private Supplier supplier;
    private Product product;
    private double amount;
    private LocalDate orderDate;

    public OrderRequest(User user, Supplier supplier, Product product, double amount, LocalDate orderDate) {
        this.user = user;
        this.supplier = supplier;
        this.product = product;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
