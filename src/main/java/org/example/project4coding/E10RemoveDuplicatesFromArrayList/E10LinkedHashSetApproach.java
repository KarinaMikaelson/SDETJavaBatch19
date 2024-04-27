package org.example.project4coding.E10RemoveDuplicatesFromArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
How can you remove all duplicates from ArrayList?
------------------------------------
Using LinkedHashSet:
A better way (both time complexity and ease of implementation wise) is to remove duplicates from an ArrayList is
to convert it into a Set that does not allow duplicates. Hence LinkedHashSet is the best option available as this
do not allows duplicates as well it preserves the insertion order.

Approach:
   Get the ArrayList with duplicate values.
   Create a LinkedHashSet from this ArrayList. This will remove the duplicates
   Convert this LinkedHashSet back to Arraylist.
   The second ArrayList contains the elements with duplicates removed.
 */
public class E10LinkedHashSetApproach {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> originalList ){
        // Create a new LinkedHashSet
        Set<Integer> set = new LinkedHashSet<>(originalList);
        originalList.clear();
        originalList.addAll(set);
        return originalList;
    }
    public static void main(String[] args) {

        // Get the ArrayList with duplicate values
        ArrayList<Integer>
                originalList = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: " + originalList);

        // Remove duplicates
        ArrayList<Integer> newList = removeDuplicates(originalList);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + newList);
    }
}

