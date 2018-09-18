package com.kodilla.good.patterns.challenges.ordering;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orr = new OrderRequestRetriever();
        OrderRequest orderRequest = orr.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailImplInformationService(),
                new OnlineImplOrderService(),
                new DBImplOrderRepository());

        OrderDto orderDto = orderProcessor.process(orderRequest);
        System.out.println("Dla użytkownika " + orderDto.getUser() + " zamówienie zostało złożone: " + (orderDto.isOrdered()? "TAK": "NIE"));

    }
}
