package com.kodilla.good.patterns.challenges.distribution;

import java.util.List;
import java.util.Map;

public class ExtraFoodShop implements Supplier {

    private Map<Product, Double> productsAmounts;

    public ExtraFoodShop(Map<Product, Double> productsAmounts) {
        this.productsAmounts = productsAmounts;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        Product product = orderRequest.getProduct();
        double amount = productsAmounts.getOrDefault(product,0.0);

        if (amount >= orderRequest.getAmount()) {
            System.out.println("OK: zapasy w " + this.getClass().getSimpleName() + " dla produku " + product.getName() + " większe niż zamówienie");
            amount -= orderRequest.getAmount();
            productsAmounts.remove(product);
            productsAmounts.put(product, amount);
            return true;
        } else {
            System.out.println("Problem: zapasy w " + this.getClass().getSimpleName() + " dla produku " + product.getName() + " mniejsze niż zamówienie");
            return false;
        }
    }

}
