package com.kodilla.stream.array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Array implements ArrayOperations {
    private List<Integer> numbersList = new ArrayList<>();

    public double getAverage(int[] numbers) {
        for (int number : numbers) {
            numbersList.add(number);
        }
        System.out.println(numbersList);
        IntStream.range(0, numbersList.size())
                .forEach(index ->System.out.println(numbersList.get(index)));


        double result = IntStream.range(0, numbersList.size())
                .map(index -> numbersList.get(index))
                .average()
                .getAsDouble();

        return result;
    }
}
