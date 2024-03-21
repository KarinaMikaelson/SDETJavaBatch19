package org.example.ProjectJava1;
/*
Create an array of integer values.
After the array is created, calculate the sum of all stored elements in that array.
 */
public class Calculator {
    public static void main(String[] args) {

        int [] array = {2, 8, 13, 24, 11, 19, 21};
        int sum = 0;
        for(int num:array){
            sum = sum + num;
        }
        System.out.println("The sum af stored values is "+sum);

    }
}
