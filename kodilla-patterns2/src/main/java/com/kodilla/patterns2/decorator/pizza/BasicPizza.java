package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements Pizza{

    @Override
    public BigDecimal getCost(){
        return new BigDecimal(15);
    };

    @Override
    public String getDescription(){
        return "Pizza (ciasto i sos pomidorowy z serem)";
    };

}
