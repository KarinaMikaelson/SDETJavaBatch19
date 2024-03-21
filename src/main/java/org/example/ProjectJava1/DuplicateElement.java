package org.example.ProjectJava1;
/*
Write a program to print out duplicate elements from an Array of Strings?
 */
public class DuplicateElement {
    public static void main(String[] args) {

        String [] elements = {"car", "bike", "nose", "home", "nose", "work", "pen", "bike"};

        for(int i = 0; i < elements.length - 1; i++){
            for(int j = i + 1; j < elements.length; j++){
                //// Check if two string elements are equal and not the same element.
                if((elements[i].equals(elements[j])) && (i != j)){
                    System.out.println("Duplicate element is: "+elements[j]);
                }
            }
        }
    }
}
