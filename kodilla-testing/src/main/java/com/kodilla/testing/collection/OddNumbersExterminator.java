package com.kodilla.testing.collection;

import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> finalList = null;
        for(int i = 0; i > numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                Integer n = numbers.get(i);
                finalList.add(n);
            }
        }
        return finalList;
    }
}
