package com.kodilla.good.patterns.challenges.distribution;

public class HealthyShop implements Supplier {

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Dostawca " + this.getClass().getSimpleName() +  " czasowo nieczynny");
        return false;
    }
}
