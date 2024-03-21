package org.example.ProjectJava1;
/*
Write a program to swap 2 numbers without a temporary variable?
 */
public class Swap {
    public static void main(String[] args) {

        int x = 2;
        int y = 8;

        x = x * y;
        y = x / y;
        x = x / y;
        System.out.println("x ="+x);
        System.out.print("y ="+y);
        // Multiplication and division method
    }
}
