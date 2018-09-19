package com.kodilla.good.patterns.challenges.distribution;

import java.util.Map;

public class GlutenFreeShop implements Supplier {

    static final Double MIN_AMOUNT_REMAINED = 10.0;

    private Map<Product, Double> productsAmounts;

    public GlutenFreeShop(Map<Product, Double> productsAmounts) {
        this.productsAmounts = productsAmounts;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        Product product = orderRequest.getProduct();
        double amount = productsAmounts.getOrDefault(product, 0.0);
        if (amount - orderRequest.getAmount() >= MIN_AMOUNT_REMAINED) {
            System.out.println("OK: zapasy w " + this.getClass().getSimpleName() + " dla produku " + product.getName() + " są o " + MIN_AMOUNT_REMAINED + " większe niż zamówienie");
            amount -= orderRequest.getAmount();
            productsAmounts.remove(product);
            productsAmounts.put(product, amount);
            return true;
        } else {
            System.out.println("Problem: zapasy w " + this.getClass().getSimpleName() + " dla produku " + product.getName() + " nie są o " + MIN_AMOUNT_REMAINED + " większe niż zamówienie");
            return false;
        }
    }

}
