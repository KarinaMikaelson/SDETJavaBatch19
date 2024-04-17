package org.example.class23.Task;

import java.util.ArrayList;

/*
Create an arrayList of even numbers from 1 to 500 using a loop.
Then write another loop to Remove any number that is divisible by 5 from that arrayList.
 */
public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int i = 2; i <= 500; i = i+2){
            evenNumbers.add(i);
        }
        System.out.println("Even numbers from 1 to 500");
        for(int n:evenNumbers){
            System.out.println(n);
        }

        for(int i = evenNumbers.size()-1 ; i >= 0; i--){
            if(evenNumbers.get(i) % 5 == 0)
                evenNumbers.remove(i);
        }
        // Displaying the updated list of even numbers
        System.out.println("List of even numbers from 1 to 500 (not divisible by 5):");
        for (int number : evenNumbers) {
            System.out.println(number);
    }
    }
}


