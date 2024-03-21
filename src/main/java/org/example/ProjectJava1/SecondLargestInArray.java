package org.example.ProjectJava1;

import java.util.Arrays;

/*
Write a java program to find the second largest number in the array
 */
public class SecondLargestInArray {
    public static void main(String[] args) {

        int [] numbers = {34, 23, 87, 12, 4, 9, 10, 109};
        int size = numbers.length;
        Arrays.sort(numbers);
        int secondLarge = numbers[size-2];
        System.out.println("2nd largest element is: " + secondLarge);
        // sort method
    }
}
