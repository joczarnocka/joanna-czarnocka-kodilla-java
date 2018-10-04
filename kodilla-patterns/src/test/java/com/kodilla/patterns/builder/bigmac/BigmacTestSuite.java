package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBuildBigmac() throws Exception {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient(Bigmac.INGREDIENT_CHAMPIGNONS)
                .bun(true)
                .ingredient(Bigmac.INGREDIENT_CHEESE)
                .ingredient(Bigmac.INGREDIENT_SALAD)
                .ingredient(Bigmac.INGREDIENT_ONION)
                .burgers(1)
                .sauce(Bigmac.SAUCE_BARBECUE)
                .withSesame(false)
                .build();
        System.out.println(bigmac);
        //When
       int howManyIngredients = bigmac.getIngredients().size();
        int burgers = bigmac.getBurgers();
        boolean bun = bigmac.isBun();
        boolean withSesame = bigmac.isWithSesame();
        String sauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(1, burgers);
        Assert.assertEquals(true, bun);
        Assert.assertEquals(false, withSesame);
        Assert.assertEquals(Bigmac.SAUCE_BARBECUE, sauce);
    }
}
