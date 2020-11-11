package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.*;


@DisplayName("Collection Test")
public class CollectionTestSuit {
    @BeforeEach
    public void before(){
        System.out.println("Begin");
    }
    @AfterEach
    public void after() {
        System.out.println("End");
    }
    @Test
    @DisplayName("Check if list has only odd values")
    public void testOddNumbersExterminatorNormalList() {
        Integer expectedValues[] = new Integer[] {2,4,6,8,10};
        List<Integer> integerList = new ArrayList<Integer>();
        for (int i = 0; i < 11; i++) {
            integerList.add(i);
        }
        List<Integer> expectedList = Arrays.asList(expectedValues);
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();

        List<Integer> checkList = new ArrayList<Integer>();
        checkList = oddNumbers.exterminate(integerList);

        Assertions.assertEquals(expectedList,checkList);

    }

    @Test
    @DisplayName("Check if list is empty")
    public void testOddNumbersExterminatorEmptyList() {
        Integer initValues[] = new Integer[] {};
        List<Integer> integerList = Arrays.asList(initValues);
        List<Integer> expectedList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();

        List<Integer> checkList = new ArrayList<Integer>();
        checkList = oddNumbers.exterminate(integerList);

        Assertions.assertEquals(expectedList,checkList);
    }
}
