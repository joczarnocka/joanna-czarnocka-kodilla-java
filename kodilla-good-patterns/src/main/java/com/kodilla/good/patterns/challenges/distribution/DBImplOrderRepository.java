package com.kodilla.good.patterns.challenges.distribution;


public class DBImplOrderRepository implements OrderRepository{

    @Override
    public boolean insertOrder(OrderRequest orderRequest) {
        return true;
    }
}
