package com.kodilla.good.patterns.challenges.distribution;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {

    static final String PRODUCT_APPLES = "jabłka";
    static final String PRODUCT_PEARS = "gruszki";
    static final String PRODUCT_BANANAS = "banany";

    public OrderRequest retrieve(){
        User user = new User("jkowalski"
                            ,"Jan"
                            ,"Kowalski"
                            ,"Klonowa 12 m. 30, 00-600 Warszawa"
                            ,"jkowalski@gmail.com"    );


        Product product1 = new Product(PRODUCT_APPLES, 5);
        Product product2 = new Product(PRODUCT_BANANAS, 15);
        Product product3 = new Product(PRODUCT_PEARS, 10);

        Map<Product,Double> productAmounts = new HashMap<>();
        productAmounts.put(product1,100.0);
        productAmounts.put(product2,200.0);
        productAmounts.put(product3,300.0);

        // Choose supplier:
        Supplier supplier = new ExtraFoodShop(productAmounts);
        //Supplier supplier = new HealthyShop();
        //Supplier supplier = new GlutenFreeShop(productAmounts);

        LocalDate date = LocalDate.of(2015,01,31);

        Product product = product1;

        return new OrderRequest(user,supplier, product,99.0, date);

    }
}
