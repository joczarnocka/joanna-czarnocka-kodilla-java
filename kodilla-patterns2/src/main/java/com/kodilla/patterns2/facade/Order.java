package com.kodilla.patterns2.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private ProductService productService;
    private Long orderId;
    private Long userId;
    private List<Item> items = new ArrayList<>();
    private boolean isPaid;
    private boolean isVerified;
    private boolean isSubmitted;

    public Order(ProductService productService, Long orderId, Long userId) {
        this.productService = productService;
        this.orderId = orderId;
        this.userId = userId;
    }

    public BigDecimal calculateValue(){
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item: items){
            sum = sum.add(productService.getPrice(item.getProductId()))
                    .multiply(new BigDecimal(item.getQty()));
        }
        return sum;
    }


    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }
}
