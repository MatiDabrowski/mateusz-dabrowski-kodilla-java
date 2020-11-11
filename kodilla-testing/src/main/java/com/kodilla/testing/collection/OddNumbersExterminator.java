package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    List<Integer> oddList = new ArrayList<Integer>();
    int temporaryValue =0;

    public List<Integer> exterminate(List<Integer> numbers){
        for(int n = 0; n < numbers.size(); n++) {
            temporaryValue = numbers.get(n);
            if(temporaryValue % 2 == 0) {
                oddList.add(temporaryValue);
            }
        }
        return oddList;
    }
}
