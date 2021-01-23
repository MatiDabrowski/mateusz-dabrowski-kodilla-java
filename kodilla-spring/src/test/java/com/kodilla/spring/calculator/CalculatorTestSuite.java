package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    void testCalculations(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double addResult = calculator.add(1,2);
        double subResult = calculator.sub(3,2);
        double mulResult = calculator.mul(2,2);
        double divResult = calculator.div(3,3);

        //then
        assertEquals(3, addResult);
        assertEquals(1, subResult);
        assertEquals(4, mulResult);
        assertEquals(1, divResult);

    }
}
