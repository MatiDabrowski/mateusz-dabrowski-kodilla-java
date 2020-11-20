package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5, (a,b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a / b);

        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        System.out.println("My task 7");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Sialala", (anyString) -> anyString + "ABC");
        poemBeautifier.beautify("Sialala", (anyString) -> "ABC" + anyString);
        poemBeautifier.beautify("Sialala", (anyString) -> anyString.toUpperCase());
        poemBeautifier.beautify("Sialala", (anyString) -> anyString.repeat(2));
        poemBeautifier.beautify("Sialala", (anyString) -> anyString.replaceFirst("ala" , "TAG"));
    }
}