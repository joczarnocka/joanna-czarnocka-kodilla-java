package com.kodilla.good.patterns.challenges.distribution;


public class OnlineImplOrderService implements OrderService {

    @Override
    public boolean makeOrder(OrderRequest orderRequest) {

        boolean res = orderRequest.getSupplier().process(orderRequest);
        return res;
    }
}
