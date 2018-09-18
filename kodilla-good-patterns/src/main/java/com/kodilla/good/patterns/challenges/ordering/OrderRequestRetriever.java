package com.kodilla.good.patterns.challenges.ordering;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("jkowalski"
                            ,"Jan"
                            ,"Kowalski"
                            ,"Klonowa 12 m. 30, 00-600 Warszawa"
                            ,"jkowalski@gmail.com"    );

        Product product = new Product("Encyklopedia 123", 500);
        LocalDate date = LocalDate.of(2015,01,31);

        return new OrderRequest(user,product,date);

    }
}
