package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;



public class CollectionTestSuit {
    @Test
    public void testOddNumbersExterminatorNormalList() {
        boolean testResult = true;
        List<Integer> integerList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for (int i = 0; i < 500; i++) {
            integerList.add(theGenerator.nextInt(1000));
        }

        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();

        List<Integer> checkList = new ArrayList<Integer>();
        checkList = oddNumbers.exterminate(integerList);
        for(int k = 0; k < checkList.size(); k++) {
           if(!(checkList.get(k) % 2 == 0)) {
               testResult = false;
            }
        }
        Assertions.assertTrue(testResult);
    }
}
