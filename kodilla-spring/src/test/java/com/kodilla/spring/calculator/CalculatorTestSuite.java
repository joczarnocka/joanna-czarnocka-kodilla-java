package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 100.0;
        double b = 5.0;
        double resAdd = calculator.add(a, b);
        double resSub = calculator.sub(a, b);
        double resMul = calculator.mul(a, b);
        double resDiv = calculator.div(a, b);
        //Then
        Assert.assertEquals(105.0, resAdd, 0.0001);
        Assert.assertEquals(95.0, resSub, 0.0001);
        Assert.assertEquals(500.0, resMul, 0.0001);
        Assert.assertEquals(20.0, resDiv, 0.0001);
    }

}
