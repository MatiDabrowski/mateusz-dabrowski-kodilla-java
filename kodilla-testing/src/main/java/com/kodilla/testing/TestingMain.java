package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
public class TestingMain {

    public static void main(String[] args) {
        //Exercise test
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator test
        int a = 1;
        int b = 2;

        Calculator calculator = new Calculator();

        int addResult = calculator.add(a,b);
        int substbractResult = calculator.substract(a,b);

        if(((a+b) == addResult) && ((a-b) == substbractResult) ) {
            System.out.println("Calculator test is OK");
        } else {
            System.out.println("Calculator test is error");
        }

    }
}
