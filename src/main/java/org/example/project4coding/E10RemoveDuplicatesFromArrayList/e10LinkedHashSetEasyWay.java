package org.example.project4coding.E10RemoveDuplicatesFromArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
How can you remove all duplicates from ArrayList?
 */
public class e10LinkedHashSetEasyWay {
    public static void main(String[] args) {
        // Step1: Create an ArrayList
        List<Integer> originalList = new ArrayList<>();
        originalList.add(4);
        originalList.add(5);
        originalList.add(7);
        originalList.add(5);
        originalList.add(3);
        originalList.add(8);
        originalList.add(4);
        originalList.add(5);

        // Step2: Create LinkedHashSet to remove duplicates
        Set<Integer> set = new LinkedHashSet<>(originalList);
        // Convert LinkedHashSet back to ArrayList
        List<Integer> newList = new ArrayList<>(set);

        System.out.println(originalList);
        System.out.println(newList);

    }
}
