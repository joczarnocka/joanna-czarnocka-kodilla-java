package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifuler;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
/*        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);*/

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        // moduł 7 zadanie 1
        System.out.println("Beautified texts");
        PoemBeautifuler beautifuler = new PoemBeautifuler();
        String str = "basic text";
        String bStr = beautifuler.beautify(str,s -> "ABC" + s + "ABC");
        System.out.println(bStr);
        bStr = beautifuler.beautify(str,s -> s.toUpperCase());
        System.out.println(bStr);
        bStr = beautifuler.beautify(str,s -> "<bold>" + s + "</bold>");
        System.out.println(bStr);
        bStr = beautifuler.beautify(str,s -> s.replaceAll("basic","BEUTIFUL"));
        System.out.println(bStr);
        bStr = beautifuler.beautify(str,s -> s + "*************");
        System.out.println(bStr);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
